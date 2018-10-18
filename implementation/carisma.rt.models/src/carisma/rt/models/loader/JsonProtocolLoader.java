package carisma.rt.models.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTSecurity;

public class JsonProtocolLoader implements IProtocolLoader {

	private ResourceSet set;
	private ProtocolBuilder builder;

	public JsonProtocolLoader() {
		set = new ResourceSetImpl();
		set.getPackageRegistry().put(ProtocolPackage.eNS_URI, ProtocolPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
	}

	@Override
	public RTProtocol loadRTProtocol(File location) {
		try (FileReader in = new FileReader(location)) {
			JsonReader reader = new Gson().newJsonReader(in);
			return protocol(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private RTProtocol protocol(JsonReader reader) throws IOException {
		while (reader.hasNext()) {
			JsonToken token = reader.peek();
			switch (token) {
			case BEGIN_OBJECT:
				reader.beginObject();
				builder = new ProtocolBuilder();
				break;
			case END_OBJECT:
				reader.endObject();
				break;
			case NAME:
				String nextName = reader.nextName();
				switch (nextName) {
				case "calls":
					call(reader);
					break;
				case "date":
					builder.setDate(reader.nextString());
					break;
				case "application":
					builder.setApplication(reader.nextString());
					break;
				case "location":
					builder.setLocation(reader.nextString());
					break;
				}
				break;
			default:
				throw new RuntimeException();
			}
		}
		RTProtocol protocol = builder.getProtocol();
		Resource resource = set.createResource(
				URI.createFileURI("UmlsecRT-" + protocol.getProgram() + "-" + protocol.getDate() + ".xmi"));
		resource.getContents().add(protocol);
		resource.save(Collections.EMPTY_MAP);
		return protocol;
	}

	private void call(JsonReader reader) throws IOException {
		if (reader.peek() != JsonToken.BEGIN_ARRAY) {
			throw new RuntimeException();
		}
		reader.beginArray();

		while (reader.hasNext()) {
			switch (reader.peek()) {
			case BEGIN_OBJECT:
				reader.beginObject();
				member(reader);
				reader.endObject();
				break;
			default:
				throw new RuntimeException();
			}
		}
		reader.endArray();
	}

	private RTMember member(JsonReader reader) throws IOException {
		String clazz = null, member = null, bin = null;
		Set<RTSecurity> violations = new HashSet<>();
		while (reader.hasNext()) {
			switch (reader.peek()) {
			case NAME:
				switch (reader.nextName()) {
				case "class":
					clazz = reader.nextString();
					break;
				case "member":
					member = reader.nextString();
					break;
				case "bin":
					bin = reader.nextString();
					break;
				case "violations":
					reader.beginArray();
					while(reader.hasNext()) {
						String next = reader.nextString();
						switch(next.trim().toLowerCase()) {
						case "secrecy":
							violations.add(RTSecurity.RT_SECRECY);
							break;
						case "integrity":
							violations.add(RTSecurity.RT_INTEGRITY);
							break;
						default:
							break;
						}
					}
					reader.endArray();
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
		}
		RTMember rtmember = builder.getMember(clazz, member, bin);
		builder.addCall(rtmember, violations);
		return rtmember;
	}
}
