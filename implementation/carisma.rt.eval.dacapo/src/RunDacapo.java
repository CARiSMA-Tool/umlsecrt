

public class RunDacapo {

	public static final String[] BENCHMARKS = new String[] { 
			"avrora",		// 0
			"batik", 		// 1
			"eclipse", 		// 2
			"fop", 			// 3
			"h2", 			// 4
			"jython",		// 5
			"luindex", 		// 6
			//"lusearch", 	// 7 << use luindex-fix
			"lusearch-fix", // 8
			"pmd", 			// 9
			"sunflow", 		// 10
			//"tomcat", 		// 11 << broken
			//"tradebeans", 	// 12
			//"tradesoap", 	// 13
			"xalan" 		// 14
		};

	private static final int LIMIT = 2;

	public static void main(String[] args) throws Exception {
		Harness.main(new String[] { BENCHMARKS[0] });
	}
}
