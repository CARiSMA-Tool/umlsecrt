package carisma.rt.editor.uml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;
import org.gravity.tgg.uml.Transformation;

public class FwdHandler extends AbstractHandler {

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
						Model model = Transformation.projectToModel(iJjavaProject, monitor);
						IFolder folder = iJjavaProject.getProject().getFolder(".gravity");
						File srcFile = folder.getFile("src.xmi").getLocation().toFile();
						Files.copy(new FileInputStream(srcFile),
								folder.getFile("fwd.src.xmi").getLocation().toFile().toPath(),
								StandardCopyOption.REPLACE_EXISTING);
					} catch (DiscoveryException | CoreException | IOException e1) {
						e1.printStackTrace();
					}

				}
			}
		});
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

}
