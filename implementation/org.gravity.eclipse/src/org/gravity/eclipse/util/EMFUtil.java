/**
 *
 */
package org.gravity.eclipse.util;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

/**
 * Helpers for dealing with EMF Resources
 *
 * @author speldszus
 *
 */
public final class EMFUtil {

	private EMFUtil() {
		// As this class only has static methods we don't want instances
	}

	/**
	 * Efficiently deletes all Objects from the resource
	 *
	 * @param objects The EObjects which should be deleted
	 * @param resource The containing resource
	 */
	public static void deleteAll(final Collection<EObject> objects, final Resource resource) {
		final Map<EObject, Collection<Setting>> usages = UsageCrossReferencer.findAll(objects, resource);
		for (final EObject eObject : objects) {
			if ((eObject!= null) && !usages.containsKey(eObject)) {
				EcoreUtil.delete(eObject);
			}
		}
		for (final Entry<EObject, Collection<Setting>> entry : usages.entrySet()) {
			final EObject eObject = entry.getKey();
			for (final EStructuralFeature.Setting setting : entry.getValue()) {
				if (setting.getEStructuralFeature().isChangeable()) {
					EcoreUtil.remove(setting, eObject);
				}
			}
			EcoreUtil.remove(eObject);
		}
	}

	/**
	 * Creates a platform resource URI
	 *
	 * @param file A file in the workspace
	 * @return The uri
	 */
	public static URI getPlatformResourceURI(final IFile file) {
		final File workspaceRelativeFile = new File(new File(file.getProject().getName()),
				file.getProjectRelativePath().toString());
		return URI.createPlatformResourceURI(workspaceRelativeFile.toString(), true);
	}
}
