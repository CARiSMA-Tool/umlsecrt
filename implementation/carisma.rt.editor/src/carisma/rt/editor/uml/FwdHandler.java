package carisma.rt.editor.uml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.tgg.uml.Transformation;

public class FwdHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(FwdHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();

		Job job = Job.create("UMLsecRT: Reverseengineering UML-model", (ICoreRunnable) monitor -> {
			for (Object selected : structured.toArray()) {
				if (selected instanceof IJavaProject) {
					IJavaProject iJjavaProject = (IJavaProject) selected;
					try {
						Model model = Transformation.projectToModel(iJjavaProject, true, monitor);
						IFolder folder = iJjavaProject.getProject().getFolder(".gravity");
						File srcFile = folder.getFile("src.xmi").getLocation().toFile();
						Files.copy(new FileInputStream(srcFile),
								folder.getFile("fwd.src.xmi").getLocation().toFile().toPath(),
								StandardCopyOption.REPLACE_EXISTING);
						final IFile umlFile = folder.getFile(iJjavaProject.getProject().getName() + ".uml");
						model.eResource().save(new FileOutputStream(
								umlFile.getLocation().toFile()),
								Collections.EMPTY_MAP);
						umlFile.refreshLocal(Resource.DEPTH_ONE, monitor);
					} catch (TransformationFailedException | CoreException | IOException e) {
						LOGGER.log(Level.ERROR, e.getMessage(), e);
					}

				}
			}
		});
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

}
