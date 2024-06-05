package carisma.rt.editor.uml;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;

public class SyncHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(SyncHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final var window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final var service = window.getSelectionService();
		final var structured = (IStructuredSelection) service.getSelection();

		final var job = Job.create("UMLsecRT: Sync UML-model with code", (ICoreRunnable) monitor -> {
			for (final Object selected : structured.toArray()) {
				if (selected instanceof final IJavaProject iJavaProject) {
					try {
						final Transformation transformation = GravityUmlActivator.getTransformationFactory()
								.getTransformation(iJavaProject.getProject());
						transformation.applyChangeAndGenerateCode(m -> {
						}, monitor);
					} catch (final IOException e) {
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
	public void setEnabled(final Object evaluationContext) {
		Object defaultVariable;
		if (!(evaluationContext instanceof final IEvaluationContext context)) {
			this.setBaseEnabled(false);
			return;
		}
		defaultVariable = context.getRoot().getDefaultVariable();
		IProject iProject;
		if (defaultVariable instanceof final List<?> list) {
			if (list.isEmpty()) {
				this.setBaseEnabled(false);
				return;
			}
			if (list.size() == 1) {
				defaultVariable = list.get(0);
			} else {
				System.out.println("There is more than one selected entry");
				this.setBaseEnabled(false);
				return;
			}
		}
		if (defaultVariable instanceof IJavaProject) {
			iProject = ((IJavaProject) defaultVariable).getProject();
		} else if (defaultVariable instanceof IProject) {
			iProject = (IProject) defaultVariable;
			try {
				if (!iProject.hasNature(JavaCore.NATURE_ID)) {
					this.setBaseEnabled(false);
					return;
				}
			} catch (final CoreException e) {
				e.printStackTrace();
				this.setBaseEnabled(false);
				return;
			}
		} else {
			this.setBaseEnabled(false);
			return;
		}
		final var gravityFolder = iProject.getFolder(".gravity");
		this.setBaseEnabled(gravityFolder.exists());
	}
}
