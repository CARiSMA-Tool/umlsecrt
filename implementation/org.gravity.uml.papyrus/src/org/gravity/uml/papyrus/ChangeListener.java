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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.GravityUmlresourceHandler;
import org.gravity.tgg.uml.Transformation;

public class ChangeListener implements ResourceSetListener {

	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.RESOURCE_LOADED;
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		IWorkspace ws = ResourcesPlugin.getWorkspace();

		for (Notification notification : event.getNotifications()) {
			if (notification.getEventType() >= Notification.EVENT_TYPE_COUNT) {
				continue;
			}
			Object notifier = notification.getNotifier();
			if (notifier instanceof UMLResource) {
				UMLResource targetResource = (UMLResource) notifier;
				String location = targetResource.getURI().toPlatformString(true);
				if (location == null) {
					continue;
				}
				IFile file = ws.getRoot().getFile(new Path(location));
				if (file == null || !file.exists()) {
					continue;
				}
				IProject project = file.getProject();
				IFile corrFile;
				try {
					String corrXmi = GravityUmlresourceHandler.CORR_XMI;
					corrFile = getResourcePath(project, corrXmi);
					if (corrFile.exists()) {
						ResourceSet rs = targetResource.getResourceSet();
						Resource corrResource = rs.getResource(toPlatformResourceURI(corrFile), true);
						Resource sourceResource = rs.getResource(
								toPlatformResourceURI(getResourcePath(project, GravityUmlresourceHandler.SRC_XMI)), true);
						Resource protocolResource = rs.getResource(
								toPlatformResourceURI(getResourcePath(project, GravityUmlresourceHandler.PROTOCOL_XMI)), true);
						Transformation trafo = GravityUmlActivator.getTransformationFactory().getTransformation(
								JavaProjectUtil.getJavaProject(project), targetResource);
						assert trafo != null;
					}
				} catch (IOException | CoreException e) {
					e.printStackTrace();
					continue;
				}
				System.out.println("Changed resource: " + notifier);
			}
		}
	}

	/**
	 * @param file
	 * @return
	 */
	private URI toPlatformResourceURI(IFile file) {
		return URI.createPlatformResourceURI(file.getFullPath().makeRelative().toString(), true);
	}

	/**
	 * @param project
	 * @param file
	 * @return
	 * @throws IOException
	 */
	private IFile getResourcePath(IProject project, String file) throws IOException {
		return GravityUmlresourceHandler.getOutputFolder(project).getFile(new Path(file));
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		// TODO Auto-generated method stub
		return false;
	}

}
