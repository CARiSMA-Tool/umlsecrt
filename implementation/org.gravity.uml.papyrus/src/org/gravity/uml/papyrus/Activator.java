package org.gravity.uml.papyrus;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator of this plugin
 * 
 * @author speldszus
 *
 */
public class Activator implements BundleActivator {
	
	/**
	 * The ID of this plugin
	 */
	public static final String PLUGIN_ID = "org.gravity.uml.papyrus";

	private static BundleContext context;

	/**
	 * A getter for the bundle context of this plugin
	 * 
	 * @return the context
	 */
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
