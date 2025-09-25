package host;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipFile;

import com.google.gson.Gson;

public class Manager {

	private Map<String, Interface> plugins = new HashMap<>();
	
	public static void main(String[] args) {
		new Manager();
	}

	public Manager() {
		loadAllClasses();
		
		for(Entry<String,Interface> entry : plugins.entrySet()) {
			try {
				String string = "### Startup: "+entry.getKey()+ " ###";
				for(int i = 0; i < string.length(); i++) System.out.print('#');
				System.out.println();
				System.out.println(string);
				for(int i = 0; i < string.length(); i++) System.out.print('#');
				System.out.println();
				entry.getValue().startUp(this);
				System.out.println();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void loadAllClasses() {
		Map<String,String> toLoad = new HashMap<>();
		List<URL> urls = new LinkedList<>();
		for (File file : new File("plugins").listFiles()) {
			if (file.getName().endsWith(".jar")) {
				try (ZipFile jar = new ZipFile(file)) {
					try (InputStream stream = jar.getInputStream(jar.getEntry("plugin.json"))) {
						Map<String, String> map = new Gson().fromJson(new InputStreamReader(stream), Map.class);
						if (!map.isEmpty()) {
							urls.add(file.toURI().toURL());
							toLoad.putAll(map);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try (URLClassLoader loader = URLClassLoader.newInstance(urls.toArray(new URL[0]))) {
			for (Entry<String, String> entry : toLoad.entrySet()) {
				try {
					Class<?> loadClass = loader.loadClass(entry.getValue());
					plugins.put(entry.getKey(), (Interface) loadClass.newInstance());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Interface getPlugin(String id) {
		return plugins.get(id);
	}
}
