package carisma.rt.editor.uml;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.e4.core.commands.ExpressionContext;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.tgg.uml.Transformation;

public class SyncHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(SyncHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();

		Job job = Job.create("UMLsecRT: Sync UML-model with code", (ICoreRunnable) monitor -> {
			for (Object selected : structured.toArray()) {
				if (selected instanceof IJavaProject) {
					IJavaProject iJjavaProject = (IJavaProject) selected;
					try {
						Transformation.umlToProject(iJjavaProject, new NullProgressMonitor());
					} catch (TransformationFailedException | IOException e) {
						LOGGER.log(Level.ERROR, e.getMessage(), e);
					}
				}
			}
		});
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

	@Override
	public void setEnabled(Object evaluationContext) {
		Object defaultVariable;
		if (evaluationContext instanceof ExpressionContext) {
			defaultVariable = ((ExpressionContext) evaluationContext).getRoot().getDefaultVariable();
		} else {
			setBaseEnabled(false);
			return;
		}
		IProject iProject;
		if (defaultVariable instanceof List<?>) {
			List<?> list = (List<?>) defaultVariable;
			if (list.size() == 0) {
				setBaseEnabled(false);
				return;
			} else if (list.size() == 1) {
				defaultVariable = list.get(0);
			} else {
				System.out.println("There is more than one selected entry");
				setBaseEnabled(false);
				return;
			}
		}
		if (defaultVariable instanceof IJavaProject) {
			iProject = ((IJavaProject) defaultVariable).getProject();
		} else if (defaultVariable instanceof IProject) {
			iProject = (IProject) defaultVariable;
			try {
				if (!iProject.hasNature(JavaCore.NATURE_ID)) {
					setBaseEnabled(false);
					return;
				}
			} catch (CoreException e) {
				e.printStackTrace();
				setBaseEnabled(false);
				return;
			}
		} else {
			setBaseEnabled(false);
			return;
		}
		IFolder gravityFolder = iProject.getFolder(".gravity");
		setBaseEnabled(gravityFolder.exists());
	}
}
