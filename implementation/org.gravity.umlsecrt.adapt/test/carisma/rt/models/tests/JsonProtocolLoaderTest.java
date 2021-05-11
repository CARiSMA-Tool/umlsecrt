package carisma.rt.models.tests;

import static org.junit.Assert.assertNotNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import carisma.rt.models.loader.JsonProtocolLoader;
import carisma.rt.models.protocol.RTProtocol;

@RunWith(Parameterized.class)
public class JsonProtocolLoaderTest {

	private static final File OUT = new File("protocols/protocol");
	private File input;
	
	public JsonProtocolLoaderTest(File input) {
		this.input = input;
		if(!OUT.exists()) {
			OUT.mkdirs();
		}
	}
	
	@Parameters
	public static File[] load() {
		List<File> results = new LinkedList<>();
		for(File json : new File("protocols/json/").listFiles()) {
			if(json.getName().endsWith(".json")) {
				results.add(json);
			}
		}
		return results.toArray(new File[results.size()]);
	}
	
	
	@Test
	public void testLoadRTProtocol() throws IOException {
		RTProtocol protocol = new JsonProtocolLoader().loadRTProtocol(input);
		protocol.eResource().save(new FileOutputStream(new File(OUT, input.getName().replaceAll("\\.json", ".xmi"))), Collections.emptyMap());
		assertNotNull(protocol);
	}

}
