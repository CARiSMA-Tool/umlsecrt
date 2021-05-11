/**
 * 
 */
package carisma.rt.securitymanager;

import java.io.FilePermission;
import java.security.Permission;
import java.text.FieldPosition;

/**
 * @author speldszus
 *
 */
public class RTSecurityManager extends SecurityManager {

	public RTSecurityManager() {
		System.out.println("Create RTManager");
	}

	@Override
	public void checkSecurityAccess(String target) {
		System.out.println("Target: " + target);
		super.checkSecurityAccess(target);
	}

	@Override
	public void checkPermission(Permission perm) {
		System.out.println("Permission: " + perm);
		System.out.println("PermType: " + perm.getClass());
		if (perm instanceof FilePermission) {
			FilePermission f = (FilePermission) perm;
			System.out.println("File: "+f.getName());
			
		}
		super.checkPermission(perm);
	}
}
