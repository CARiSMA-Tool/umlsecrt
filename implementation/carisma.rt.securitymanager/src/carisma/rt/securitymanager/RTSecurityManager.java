/**
 *
 */
package carisma.rt.securitymanager;

import java.io.FilePermission;
import java.lang.reflect.Method;
import java.security.Permission;

/**
 * @author speldszus
 *
 */
public class RTSecurityManager extends SecurityManager {

	public RTSecurityManager() {
		System.out.println("Create RTManager");
	}

	@Override
	public void checkSecurityAccess(final String target) {
		System.out.println("Target: " + target);
		super.checkSecurityAccess(target);
	}

	@Override
	public void checkPermission(final Permission perm) {
		System.out.println("Permission: " + perm);
		System.out.println("PermType: " + perm.getClass());
		if (perm instanceof FilePermission) {
			super.checkPermission(perm);
		}
		else if (perm instanceof UMLsecRTPermission) {
			final Method called = ((UMLsecRTPermission) perm).getMethod();
			final StackTraceElement[] trace = Thread.currentThread().getStackTrace();
			int i;
			for(i = trace.length - 1; i >= 0; i++) {
				final StackTraceElement element = trace[i];
				if(element.getClassName().equals(called.getDeclaringClass().getName()) && element.getMethodName().equals(called.getName())) {
					break;
				}
			}
			final StackTraceElement element = trace[i -1];
			try {
				final Method caller = Class.forName(element.getClassName()).getDeclaredMethod(element.getMethodName());
				// We cannot identify the concrete method here
			} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {

			}
		}
	}
}
