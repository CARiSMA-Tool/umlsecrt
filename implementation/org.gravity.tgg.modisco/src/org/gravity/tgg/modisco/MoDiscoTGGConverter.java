package org.gravity.tgg.modisco;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.converter.IPGConverter;
import static org.gravity.eclipse.io.ModelSaver.*;
import org.gravity.modisco.GravityMoDiscoFactoryImpl;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing;
import org.gravity.tgg.modisco.preprocessing.PreprocessingFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;

public class MoDiscoTGGConverter extends SynchronizationHelper implements IPGConverter {

	private IJavaProject java_project = null;

	private Set<IPath> libs;

	private boolean debug;

	private IFolder modisco_folder;

	private Resource tggRulesResource;

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {
		public ResourceSet getRS() {
			return getResourceSet();
		}

		public ElementsToAnalyze getElemetstoAnalyze() {
			return getElementsToAnalyze();
		}
	}

	private MyDiscoverJavaModelFromJavaProject discoverer;

	public MoDiscoTGGConverter() throws MalformedURLException, IOException {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();

		BasicConfigurator.configure();

		this.set = this.discoverer.getRS();
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		this.corrPackageResource = this.set.createResource(URI.createURI("GravityTGG.ecore")); //$NON-NLS-1$
		InputStream corr_package = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.corrPackageResource.load(corr_package, Collections.EMPTY_MAP);
		corr_package.close();

		this.configurator = new Configurator() {
		};
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});

		InputStream tgg_rules = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.sma.xmi") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.tggRulesResource = this.set.createResource(URI.createURI("TGGRules.sma.xmi")); //$NON-NLS-1$
		this.tggRulesResource.load(tgg_rules, Collections.EMPTY_MAP);
		tgg_rules.close();

		setRules((StaticAnalysis) this.tggRulesResource.getContents().get(0));
	}

	@Override
	public boolean convertProject(IJavaProject project, IProgressMonitor monitor) {
		libs = new HashSet<IPath>();
		return convertProject(project, libs, monitor);
	}

	@Override
	public boolean convertProject(IJavaProject java_project, Set<IPath> libs, IProgressMonitor monitor) {
		long start = System.currentTimeMillis();
		System.out.println(start+" GRaViTY convert project: "+java_project.getProject().getName());
		this.java_project = java_project;
		this.libs = libs;
		
		if(!createOutFiles(java_project, monitor)){
			System.err.println("Creating output folders failed.");
			return false;
		}

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " MoDisco discover project: "+java_project.getProject().getName());
		Model eobject = discoverProject(java_project, libs, monitor);
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");

		if (this.debug) {
			saveModel(eobject, this.modisco_folder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$ );
		}
		if(monitor.isCanceled()){
			return false;
		}

		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " MoDisco preprocessing");
		if (eobject instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) eobject;
			
			GravityMoDiscoFactoryImpl factory = (GravityMoDiscoFactoryImpl) JavaFactory.eINSTANCE;
			if (model.getMFieldDefinitions().size() == 0) {
				model.getMFieldDefinitions().addAll(factory.getFdefs());
			}
			if (model.getMMethodDefinitions().size() == 0) {
				model.getMMethodDefinitions().addAll(factory.getMdefs());
			}
			if (model.getMConstructorDefinitions().size() == 0) {
				model.getMConstructorDefinitions().addAll(factory.getCdefs());
			}
			MoDiscoTGGPreprocessing preprocessing = PreprocessingFactory.eINSTANCE.createMoDiscoTGGPreprocessing();
			preprocessing.fixStaticMethodCallOnField(model);
			if (!preprocessing.preprocess(model)) {
				System.out.println("ERROR: Preprocessing failed");
				return false;
			}
			TreeIterator<EObject> iterator = model.eResource().getAllContents();
			while (iterator.hasNext()) {
				EObject next = iterator.next();
				if (next instanceof AnonymousClassDeclaration) {
					model.getAnonymousClassDeclarations().add((AnonymousClassDeclaration) next);
				}
				else if(next instanceof TypeParameter){
					model.getTypeParameters().add((TypeParameter) next);
				}
				
				if(monitor.isCanceled()){
					return false;
				}
			}
		}
		long t3 = System.currentTimeMillis();
		System.out.println(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		if (this.debug) {
			saveModel(eobject, this.modisco_folder.getFile("modisco_preprocessed.xmi"), monitor); //$NON-NLS-1$
		}

		setSrc(eobject);
		setChangeSrc(null);
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});
		setSynchronizationProtocol(null);
		
		if(debug){
			setConfigurator(new PGSavingConfigurator(this, this.modisco_folder.getFile("emoflon_pg.xmi").getLocation().toString()));
		}

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " eMoflon TGG fwd trafo");
		integrateForward();
		
		long t5 = System.currentTimeMillis();
		System.out.println(t5 + " eMoflon TGG fwd trafo - done " + (t5 - t4) + "ms");
		if (this.debug) {
			savePG(this.modisco_folder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
			saveCorr(this.modisco_folder.getFile("correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(this.modisco_folder.getFile("sync_protocol.xmi").getLocation().toString()); //$NON-NLS-1$
		}

		boolean success = getTrg() != null && getTrg() instanceof TypeGraph;
		
		long stop = System.currentTimeMillis();
		System.out.println(stop+" GRaViTY convert project - done "+(stop-start)+"ms");
		
		return success;
	}

	@Override
	public boolean syncProjectFwd(IProgressMonitor monitor) {
		long start = System.currentTimeMillis();
		System.out.println(start+" MoDisco sync project: "+java_project.getProject().getName());
		if (this.discoverer == null || this.java_project == null) {
			return false;
		}
		
		Resource targetModel = this.discoverer.getTargetModel();
		if(targetModel == null || targetModel.getContents().size() == 0){
			return convertProject(java_project, monitor);
		}
		MGravityModel oldProject = (MGravityModel) targetModel.getContents().get(0);
		System.out.println(System.currentTimeMillis()+" Discover Project");
		MGravityModel newProject = (MGravityModel) discoverProject(java_project, monitor);
		System.out.println(System.currentTimeMillis()+" Discover Project - Done");
		
		GravityMoDiscoModelPatcher patcher = MoDiscoTGGActivator.getDefault().getSelectedPatcher();
			

		System.out.println(System.currentTimeMillis()+" Integrate FWD");
		setChangeSrc(SynchronizationHelper->{

			System.out.println(System.currentTimeMillis()+" Calculate Patch");
			patcher.update(oldProject, newProject);
			System.out.println(System.currentTimeMillis()+" Calculate Patch - Done");
			
			});
		
		integrateForward();
		System.out.println(System.currentTimeMillis()+" Integrate FWD - Done");
		
		if (this.debug) {
			saveMoDiscoModel(this.modisco_folder.getFile("modisco.xmi"), monitor); //$NON-NLS-1$
			savePG(this.modisco_folder.getFile("pg.xmi"), monitor); //$NON-NLS-1$
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop+ "MoDisco sync project -done: "+(stop-start)+"ms");
		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		if (this.discoverer == null) {
			return false;
		}

		setChangeTrg(consumer);
		integrateBackward();

		if (this.debug) {
			savePG(this.modisco_folder.getFile("sync_bwd_pg.xmi"), monitor); //$NON-NLS-1$
			saveMoDiscoModel(this.modisco_folder.getFile("sync_bwd_modisco.xmi"), monitor); //$NON-NLS-1$
			saveCorr(this.modisco_folder.getFile("sync_bwd_correspondence_model.xmi").getLocation().toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(this.modisco_folder.getFile("sync_bwd_sync_protocol.xmi").getLocation().toString()); //$NON-NLS-1$

		}

		Stack<Package> packages = new Stack<>();
		Model model = (Model) getSrc();
		packages.addAll(model.getOwnedElements());

		while (!packages.isEmpty()) {
			Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (AbstractTypeDeclaration t : p.getOwnedElements()) {
				if (!t.isProxy()) {
					if (t.getOriginalClassFile() != null && t.getOriginalCompilationUnit() == null) {
						CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
						cu.getTypes().add(t);
						cu.setPackage(p);
						cu.setName(t.getName() + ".java");
						t.setOriginalCompilationUnit(cu);
						model.getCompilationUnits().add(cu);
					}
					CompilationUnit cu = t.getOriginalCompilationUnit();
					Set<NamedElement> types = new HashSet<>();
					for (ImportDeclaration i : cu.getImports()) {
						types.add(i.getImportedElement());
					}
					for (Annotation a : t.getAnnotations()) {
						org.eclipse.gmt.modisco.java.Type type = a.getType().getType();
						if (!types.contains(type)) {
							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
							imp.setImportedElement(type);
							cu.getImports().add(imp);
						}
					}
				}
			}
		}

		try {
			IFolder out_file = this.java_project.getProject().getFolder("src");
			if (monitor == null) {
				monitor = new NullProgressMonitor();
			}
			new GenerateJavaExtended(getSrc(), out_file.getLocation().toFile(), Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}

		try {
			this.java_project.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public Model discoverProject(IJavaProject java_project, IProgressMonitor monitor) {
		return discoverProject(java_project, new HashSet<IPath>(), monitor);
	}

	public Model discoverProject(IJavaProject java_project, Set<IPath> libs, IProgressMonitor monitor) {
		Model model = null;

		if (this.discoverer.isApplicableTo(java_project)) {
			try {
				List<Object> discoverable = AbstractDiscoverJavaModelFromProject
						.computeDiscoverableElements(java_project);
				ElementsToAnalyze analyze = new ElementsToAnalyze(java_project);
				for (Object o : discoverable) {
					if (o instanceof JarPackageFragmentRoot) {
						JarPackageFragmentRoot jar = (JarPackageFragmentRoot) o;
						IPath path = jar.getPath();

						for (IPath l : libs) {
							if (l.isPrefixOf(path)) {
								analyze.addElementToDiscover(jar);
							}
						}
					}
				}
				this.discoverer.setElementsToAnalyze(analyze);
				this.discoverer.discoverElement(java_project, monitor);
				Resource java_resource = this.discoverer.getTargetModel();
				if (java_resource != null) {
					if(java_resource.getURI()==null){
						java_resource.setURI(URI.createURI(java_project.getProject().getName()+".xmi"));
					}
					EList<EObject> contents = java_resource.getContents();

					if (contents.size() > 0) {
						EObject eobject = contents.get(0);

						if (eobject instanceof Model) {
							model = (Model) eobject;

						}
					}
				}
				
			} catch (DiscoveryException e) {
				e.printStackTrace();
			}
		}

		return model;
	}

	private boolean createOutFiles(IJavaProject java_project, IProgressMonitor monitor) {
		IProject project = java_project.getProject();
		this.modisco_folder = project.getFolder("modisco"); //$NON-NLS-1$
		if(!this.modisco_folder.exists()){
			try {
				this.modisco_folder.create(true, true, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean savePG(IFile file, IProgressMonitor monitor) {
		return saveModel(getTrg(), file, monitor);
	}

	private boolean saveMoDiscoModel(IFile modisco_file, IProgressMonitor monitor) {
		return saveModel(getSrc(), modisco_file, monitor);
	}

	@Override
	public TypeGraph getPG() {
		return (TypeGraph) getTrg();
	}

	@Override
	public boolean isDebug() {
		return this.debug;
	}

	@Override
	public void setDebug(boolean debug) {
		this.verbose = debug;
		this.debug = debug;
	}

	@Override
	public boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return false;
	}

}
