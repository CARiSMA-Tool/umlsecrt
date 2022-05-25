package carisma.rt.models.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.uml2.uml.Model;
import org.junit.Test;

import carisma.rt.models.loader.JsonProtocolLoader;
import carisma.rt.models.loader.ModelLoader;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.sync.ModelSync;

public class ModelSyncTest {

	@Test
	public void test() throws FileNotFoundException, IOException {
		Model model = new ModelLoader().getModel("protocols/Classloader.uml");
		RTProtocol protocol = new JsonProtocolLoader().loadRTProtocol(new File("protocols/protocol.json"));
		Model changed = new ModelSync(model).sync(protocol);
		assertNotNull(changed);
		changed.eResource().save(new FileOutputStream(new File("protocols/Classloader-changed.uml")), Collections.emptyMap());
	}

}
