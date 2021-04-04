package org.gravity.tgg.pm.uml;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.moflon.tgg.runtime.CorrespondenceModel;

public class CorrespondenceGraphGenHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(CorrespondenceGraphGenHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<?> selection = GravityUiActivator.getSelection(event);
		for (final Object object : selection) {
			IJavaProject javaProject = null;
			if (object instanceof IProject) {
				try {
					final IProject project = (IProject) object;
					if (project.hasNature(JavaCore.NATURE_ID)) {
						javaProject = JavaCore.create(project);
					}
				} catch (final CoreException e) {
					LOGGER.error(e);
				}
			} else if (object instanceof IJavaProject) {
				javaProject = (IJavaProject) object;
			}
			if (javaProject == null) {
				continue;
			}
			launchJob(javaProject);
		}
		return null;
	}

	private Job launchJob(final IJavaProject javaProject) {
		final Job job = new Job("Generate UML PM Corr Model") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final CorrespondenceModel model = CorrespondenceGraphGenerator.createModel(javaProject, monitor);
				if (model != null) {
					return Status.OK_STATUS;
				}
				return new Status(IStatus.ERROR, "org.garvity.tgg.pm.uml", "Creating the corr model failed");
			}

		};
		job.schedule();
		return job;
	}

}
