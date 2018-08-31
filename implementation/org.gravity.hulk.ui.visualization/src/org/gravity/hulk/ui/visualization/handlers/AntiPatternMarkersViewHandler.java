package org.gravity.hulk.ui.visualization.handlers;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.hulk.ui.visualization.views.AntiPatternMarkerView;

public class AntiPatternMarkersViewHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger( AntiPatternMarkersViewHandler.class.getName() );
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (window == null)
			return null;

		IWorkbenchPage page = window.getActivePage();
		if (page == null)
			return null;

		try {
			page.showView(AntiPatternMarkerView.ID);
		} catch (PartInitException e) {
			LOGGER.log( Level.ERROR, "Failed to open the AntiPattern Marker view");
		}

		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

}
