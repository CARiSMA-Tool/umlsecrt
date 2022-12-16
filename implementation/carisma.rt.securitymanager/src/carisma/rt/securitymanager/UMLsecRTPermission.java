package carisma.rt.securitymanager;

import java.lang.reflect.Method;
import java.security.BasicPermission;

public class UMLsecRTPermission extends BasicPermission {

	private static final long serialVersionUID = -1231560349229026948L;
	private final Method method;

	public UMLsecRTPermission(final Method method) {
		super(method.getName());
		this.method = method;
	}

	public Method getMethod() {
		return this.method;
	}

}
