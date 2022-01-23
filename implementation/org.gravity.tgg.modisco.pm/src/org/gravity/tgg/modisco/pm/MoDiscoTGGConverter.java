package org.gravity.tgg.modisco.pm;

import static org.gravity.eclipse.io.ModelSaver.saveModel;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.GravityModiscoTGGConverter;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.GravityMoDiscoProcessorUtil;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.tgg.modisco.pm.processing.pg.IProgramGraphProcessor;
import org.gravity.tgg.modisco.pm.processing.pg.ProgramGraphProcesorUtil;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A converter for creating a program model from eclipse projects using MoDisco
 *
 * @author speldszus
 *
 */
public class MoDiscoTGGConverter extends GravityModiscoTGGConverter implements IPGConverter {

	private static final String PM_XMI = "pm.xmi";

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverter.class);

	/**
	 * Initializes ResourceSet for EMF and eMoflon
	 *
	 * @param project The project this converter is created for
	 *
	 * @throws IOException   If the eMoflon TGG rules couldn't be loaded
	 * @throws CoreException
	 */
	public MoDiscoTGGConverter(final IJavaProject project) throws IOException, CoreException {
		this(project, true);
	}

	public MoDiscoTGGConverter(final IJavaProject project, final boolean load)
			throws IOException, CoreException {
		super(project, "pm", load);
	}

	@Override
	public boolean convertProject(final IProgressMonitor monitor) {
		return convertProject(new HashSet<>(), monitor);
	}

	@Override
	public boolean convertProject(final Collection<IPath> libs, final IProgressMonitor monitor) {
		if (this.load && (getTrg() != null) && (getSrc() != null) && (getCorr() != null)) {
			final IProject project = this.project.getProject();
			try {
				if (project.getModificationStamp() <= EclipseProjectUtil.getGravityFolder(project, monitor)
						.getModificationStamp()) {
					return true;
				}
			} catch (final IOException e) {
				LOGGER.error(e.getMessage(), e);
				discard();
				clearChanges();
			}
		}

		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		long start = 0;
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "GRaViTY convert project: " + this.project.getProject().getName());
		}

		MGravityModel preprocessedModiscoModel;
		try {
			preprocessedModiscoModel = this.discoverer.discoverModel(libs, progressMonitor);
		} catch (final DiscoveryException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		if ((this.src != null) && this.src.equals(preprocessedModiscoModel) && (this.trg instanceof TypeGraph)) {
			return true;
		}

		final boolean success = convertModel(preprocessedModiscoModel, progressMonitor);
		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("All:" + (System.currentTimeMillis() - start) + "ms");
		} else if (infoEnabled) {
			LOGGER.log(Level.INFO, "GRaViTY convert project - done " + (System.currentTimeMillis() - start) + "ms");
		}

		return success;
	}

	/**
	 * Converts the modisco model of the given project into a program model
	 *
	 * @param modiscoModel The modisco model of the Java project
	 * @param monitor      A progress monitor
	 * @return If the model has been converted successfully
	 */
	public boolean convertModel(final MGravityModel modiscoModel, final IProgressMonitor monitor) {
		if ((this.src != null) && this.src.equals(modiscoModel) && (this.trg instanceof TypeGraph)) {
			return true;
		}
		final SubMonitor submonitor = SubMonitor.convert(monitor, "Transform MoDisco Model to PM", 100);

		final Resource eResource = modiscoModel.eResource();
		if (!getResourceSet().equals(eResource.getResourceSet())) {
			getResourceSet().createResource(eResource.getURI()).getContents().add(modiscoModel);
		}
		setSrc(modiscoModel);
		clearChanges();
		setSynchronizationProtocol(null);

		final boolean infoEnabled = LOGGER.isInfoEnabled();
		long start = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo");
		}

		final SubMonitor integrate = submonitor.split(70);
		integrate.setTaskName("Integrate FWD");
		integrateForward();
		integrate.done();

		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("TGG:" + (System.currentTimeMillis() - start) + "ms");
		} else if (infoEnabled) {
			LOGGER.log(Level.INFO, "eMoflon TGG fwd trafo - done " + (System.currentTimeMillis() - start) + "ms");
		}

		final boolean success = this.trg instanceof TypeGraph;
		if (success) {
			postprocess(submonitor.split(20), infoEnabled);
			if (this.autosave) {
				Job.create("Save models", runnable -> {
					save(submonitor.split(10));
				}).schedule();
			}
		}
		submonitor.done();
		return success;
	}

	/**
	 * Executes all registered postprocessors
	 *
	 * @param monitor A progress monitor
	 * @param info    If info messages should be logged
	 */
	private void postprocess(final IProgressMonitor monitor, final boolean info) {
		final Collection<IProgramGraphProcessor> sortedProcessors = ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_FWD);
		final SubMonitor processors = SubMonitor.convert(monitor, "Postprocessing", sortedProcessors.size());
		long start = 0;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		} else if (info) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, "Start postprocessing with " + sortedProcessors.size() + " post-processors");
		}
		for (final IProgramGraphProcessor processor : sortedProcessors) {
			processor.process(getPG(), processors);
			processors.worked(1);
		}
		if (GravityActivator.MEASURE_PERFORMANCE) {
			System.out.println("Postprocessing:" + (System.currentTimeMillis() - start) + "ms");
		} else if (info) {
			LOGGER.log(Level.INFO, "Postprocessing - done (" + (System.currentTimeMillis() - start) + "ms)");
		}
	}

	@Override
	public boolean syncProjectFwd(final IProgressMonitor monitor) {
		if ((this.discoverer == null) || (this.project == null)) {
			return false;
		}
		long start = 0;
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			start = System.currentTimeMillis();
			LOGGER.log(Level.INFO, start + " MoDisco sync project: " + this.project.getProject().getName());
		}

		if (getSrc() == null) {
			return convertProject(monitor);
		}

		final MGravityModel oldModiscoModel = getSrc();

		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project");
		}

		MGravityModel newModiscoModel;
		try {
			newModiscoModel = this.discoverer.discoverModel(monitor);
		} catch (final DiscoveryException e) {
			LOGGER.error(e);
			return false;
		}
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Discover Project - Done");
		}

		final GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();

		final Consumer<EObject> changes = change -> {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch");
			patcher.update(oldModiscoModel, newModiscoModel);
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Calculate Patch - Done");
		};

		final boolean success = syncProjectFwd(changes, monitor);

		if (infoEnabled) {
			final long stop = System.currentTimeMillis();
			LOGGER.log(Level.INFO, stop + "MoDisco sync project -done: " + (stop - start) + "ms");
		}

		return success;
	}

	@Override
	public boolean syncProjectFwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		if (getSrc() == null) {
			LOGGER.error("No initial transformation has been performed!");
			return false;
		}
		final boolean infoEnabled = LOGGER.isInfoEnabled();
		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD");
		}

		setChangeSrc(consumer);
		integrateForward();

		if (infoEnabled) {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Integrate FWD - Done");
		}

		if (isDebug()) {
			save(monitor);
		}
		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		if ((this.discoverer == null) || (getSrc() == null) || (getTrg() == null)) {
			return false;
		}

		IProgressMonitor progressMonitor;
		if (monitor == null) {
			progressMonitor = new NullProgressMonitor();
		} else {
			progressMonitor = monitor;
		}

		for (final IProgramGraphProcessor processor : ProgramGraphProcesorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_PG_BWD)) {
			processor.process(getPG(), progressMonitor);
		}
		setChangeTrg(consumer);
		integrateBackward();

		if (isDebug()) {
			save(progressMonitor);

		}

		final EObject src = getSrc();
		for (final IMoDiscoProcessor processor : GravityMoDiscoProcessorUtil
				.getSortedProcessors(MoDiscoTGGActivator.PROCESS_MODISCO_BWD)) {
			processor.process((MGravityModel) src, null, progressMonitor);
		}

		try {
			final IFolder srcFile = this.project.getProject().getFolder("src");
			new GenerateJavaExtended(src, srcFile.getLocation().toFile(), Collections.emptyList())
			.doGenerate(new BasicMonitor.EclipseSubProgress(progressMonitor, 1));
			this.project.getProject().refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		} catch (IOException | CoreException e) {
			return false;
		}

		return true;
	}

	@Override
	public boolean savePG(final IFile file, final IProgressMonitor monitor) {
		return saveModel(getTrg(), file);
	}

	@Override
	public TypeGraph getPG() {
		return getTrg();
	}

	@Override
	public TypeGraph getTrg() {
		return (TypeGraph) super.getTrg();
	}

	@Override
	public MGravityModel getSrc() {
		return (MGravityModel) super.getSrc();
	}

	@Override
	public boolean discard() {
		unload();
		return GravityActivator.getDefault().discardConverter(this.project.getProject());
	}

	@Override
	protected IFile getTargetFile() {
		return this.outputFolder.getFile(PM_XMI);
	}

	@Override
	protected String getSmaURI() {
		return "platform:/plugin/org.gravity.tgg.modisco.pm/model/Pm.sma.xmi"; //$NON-NLS-1$
	}

	@Override
	protected EPackage getCorrPackage() {
		return BasicPackage.eINSTANCE;
	}
}
