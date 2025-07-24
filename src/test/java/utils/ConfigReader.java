package utils;

<<<<<<< HEAD
=======
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git
public class ConfigReader {
	private Properties prop;
	FileInputStream fis;

<<<<<<< HEAD
}
=======
	public ConfigReader() throws IOException {
		prop = new Properties();
		this.fis = new FileInputStream("src/test/resources/config/config.properties");
		prop.load(fis);

	}

	public String get_prop_value(String key) {
		String prop_value = prop.getProperty(key);
		return prop_value;
	}

}
>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git
