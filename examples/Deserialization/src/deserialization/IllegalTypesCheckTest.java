package deserialization;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IllegalTypesCheckTest {
	static class Bean1599 {
		public int id;
		public Object obj;
	}

	@Test
	public void testIssue1599() throws Exception {
		final String JSON = aposToQuotes(
				"{'id': 124,\n" 
						+ " 'obj':[ 'com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl',\n" 
							+ "  {\n"
							+ "    'transletBytecodes' : [ 'AAIAZQ==' ],\n" 
							+ "    'transletName' : 'a.b',\n"
							+ "    'outputProperties' : {  }\n" 
						+ "  }\n" 
					+ " ]\n" 
				+ "}");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enableDefaultTyping();
		try {
			mapper.readValue(JSON, Bean1599.class);
			fail("Should not pass");
		} catch (JsonMappingException e) {
			verifyException(e, "Illegal type");
			verifyException(e, "to deserialize");
			verifyException(e, "prevented for security reasons");
		}
	}

	protected static String aposToQuotes(String json) {
		return json.replace("'", "\"");
	}
	
	protected void verifyException(Throwable e, String... matches)
    {
        String msg = e.getMessage();
        String lmsg = (msg == null) ? "" : msg.toLowerCase();
        for (String match : matches) {
            String lmatch = match.toLowerCase();
            if (lmsg.indexOf(lmatch) >= 0) {
                return;
            }
        }
        fail("Expected an exception with one of substrings ("+Arrays.asList(matches)+"): got one with message \""+msg+"\"");
    }
}
