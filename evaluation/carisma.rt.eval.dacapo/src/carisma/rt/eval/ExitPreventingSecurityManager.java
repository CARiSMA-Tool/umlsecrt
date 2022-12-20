package carisma.rt.eval;

import java.security.Permission;

public final class ExitPreventingSecurityManager extends SecurityManager {
	
	public static final String MESSAGE = "Exit not allowed";

	@Override
	public void checkPermission(Permission perm) {
		if(perm.getName().startsWith("exitVM")) {
			throw new SecurityException(MESSAGE);
		}
		return;
	}
}