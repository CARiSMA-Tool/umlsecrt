package org.gravity.uml.papyrus;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;

public class ChangeListener implements ResourceSetListener {

	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.RESOURCE_LOADED;
	}

	@Override
	public Command transactionAboutToCommit(final ResourceSetChangeEvent event) throws RollbackException {
		return null;
	}

	@Override
	public void resourceSetChanged(final ResourceSetChangeEvent event) {
		final IWorkspace ws = ResourcesPlugin.getWorkspace();

		for (final Notification notification : event.getNotifications()) {
			if (notification.getEventType() >= Notification.EVENT_TYPE_COUNT) {
				continue;
			}
			final Object notifier = notification.getNotifier();
			if (notifier instanceof UMLResource) {
				final UMLResource targetResource = (UMLResource) notifier;
				final String location = targetResource.getURI().toPlatformString(true);
				if (location == null) {
					continue;
				}
				final IFile file = ws.getRoot().getFile(new Path(location));
				if ((file == null) || !file.exists()) {
					continue;
				}
				final IProject project = file.getProject();
				try {
					final Transformation trafo = GravityUmlActivator.getTransformationFactory()
							.getTransformation(project);
					assert trafo != null;
				} catch (IOException | CoreException e) {
					e.printStackTrace();
					continue;
				}
				System.out.println("Changed resource: " + notifier);
			}
		}
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		return false;
	}

}
