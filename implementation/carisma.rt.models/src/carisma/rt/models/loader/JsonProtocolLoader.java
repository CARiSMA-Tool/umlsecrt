package carisma.rt.models.loader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import carisma.rt.models.json.Protocol;
import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTProtocol;

public class JsonProtocolLoader implements IProtocolLoader {

	private ResourceSet set;
	
	private final Gson gson = new Gson();
	
	public JsonProtocolLoader() {
		set = new ResourceSetImpl();
		set.getPackageRegistry().put(ProtocolPackage.eNS_URI, ProtocolPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
	}

	@Override
	public RTProtocol loadRTProtocol(File location) {
		try (JsonReader in = gson.newJsonReader(new FileReader(location))) {
			return protocol((Protocol) gson.fromJson(in, Protocol.class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private RTProtocol protocol(Protocol protocol) throws IOException {
		RTProtocol rtProtocol = new ProtocolBuilder().getProtocol(protocol);
		Resource resource = set.createResource(
				URI.createFileURI("UmlsecRT-" + rtProtocol.getProgram() + "-" + rtProtocol.getDate() + ".xmi"));
		resource.getContents().add(rtProtocol);
		resource.save(Collections.EMPTY_MAP);
		return rtProtocol;
	}
}
