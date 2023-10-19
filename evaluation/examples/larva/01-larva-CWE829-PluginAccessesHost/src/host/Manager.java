package host;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipFile;

import com.google.gson.Gson;

public class Manager {

	Map<String, Object> plugins = new HashMap<>();

	public Manager() {
		for (File file : new File("plugins").listFiles()) {
			if (file.getName().endsWith(".jar")) {
				try (ZipFile jar = new ZipFile(file)) {
					try (InputStream stream = jar.getInputStream(jar.getEntry("plugin.json"))) {
						Map<String, String> map = new Gson().fromJson(new InputStreamReader(stream), Map.class);
						if (!map.isEmpty()) {
							try (URLClassLoader loader = URLClassLoader
									.newInstance(new URL[] { file.toURI().toURL() })) {
								for (Entry<String, String> entry : map.entrySet()) {
									try {
										plugins.put(entry.getKey(), loader.loadClass(entry.getValue()));
									} catch (ClassNotFoundException e) {
										e.printStackTrace();
									}
								}
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
