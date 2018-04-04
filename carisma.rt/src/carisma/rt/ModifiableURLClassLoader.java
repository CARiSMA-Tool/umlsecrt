package carisma.rt;

import java.net.URL;
import java.net.URLClassLoader;

public class ModifiableURLClassLoader extends URLClassLoader {

	public ModifiableURLClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
	}
	
	@Override
	public void addURL(URL url) {
		super.addURL(url);
	}

}
