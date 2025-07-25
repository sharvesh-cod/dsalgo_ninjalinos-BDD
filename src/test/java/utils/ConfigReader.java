package utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> branch 'development' of git@github-shared:sharvesh-cod/dsalgo_ninjalinos-BDD.git
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git
public class ConfigReader {
	private Properties prop;
	FileInputStream fis;

<<<<<<< HEAD
	public ConfigReader() throws IOException {
		prop = new Properties();
		this.fis = new FileInputStream("src/test/resources/config/config.properties"); // Use relative path
																						// if possible
=======
<<<<<<< HEAD
}
=======
	public ConfigReader() throws IOException {
		prop = new Properties();
		this.fis = new FileInputStream("src/test/resources/config/config.properties");
>>>>>>> branch 'development' of git@github-shared:sharvesh-cod/dsalgo_ninjalinos-BDD.git
		prop.load(fis);

	}

	public String get_prop_value(String key) {
		String prop_value = prop.getProperty(key);
		return prop_value;
	}
}

<<<<<<< HEAD
//******************MY ORIGINAL CODE******************************
//package utils;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//
//	private static Properties prop;
//
//	static {
//		try {
//			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
//			prop = new Properties();
//			prop.load(fis);
//		} catch (IOException e) {
//			e.printStackTrace();
//			throw new RuntimeException("Could not load config.properties");
//		}
//	}
//
//	public static String get(String key) {
//		return prop.getProperty(key);
//	}
//}
=======
}
>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git
>>>>>>> branch 'development' of git@github-shared:sharvesh-cod/dsalgo_ninjalinos-BDD.git
