package org.gravity.uml.papyrus;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ChangeListener implements ResourceSetListener {
	
	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.NOT_TOUCH;
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		for (Notification notification : event.getNotifications()) {
			if(notification.getEventType() >= Notification.EVENT_TYPE_COUNT) {
				continue;
			}
			Object notifier = notification.getNotifier();
			if (notifier instanceof UMLResource) {
				System.out.println("Changed resource: "+notifier);
			}
			else 
			if(notification instanceof ENotificationImpl) {
				ENotificationImpl eNotification = (ENotificationImpl) notification;
				if(notifier instanceof EObject) {
					if(((EObject) notifier).eResource() instanceof UMLResource) {
						//TODO: Check if relevant
						switch(eNotification.getEventType()) {
							case Notification.ADD:
								System.out.println("ADD: "+eNotification.getNewValue());
								break;
							case Notification.REMOVE:
								System.out.println("REMOVE: "+eNotification.getNewValue());
								break;
							case Notification.SET:
								System.out.println("SET: "+eNotification.getNewValue());
								break;
							default:
								System.err.println("Not handled yet: "+eNotification.getEventType());
								break;
						}
					}
				}
			}
		}
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
