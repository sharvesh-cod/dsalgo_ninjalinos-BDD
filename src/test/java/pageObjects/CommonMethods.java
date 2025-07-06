package pageObjects;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {

	protected static WebDriver driver;
	protected static Properties prop;
	protected static FileInputStream fis;
	protected Actions action;

	public void initializeDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			action = new Actions(driver);
		}
	}

	public void tearDownDriver() {
		if (driver != null) {
			driver.close();
			driver = null;
		}

	}
}
