package hooks;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.GetProperty;

public class Hooks {

	private WebDriver driver;
	// ConfigReader configreader;

//	public Hooks(DriverFactory obj) {
//		driver = obj.return_driver();
//	}
	DriverFactory obj = new DriverFactory();

	// private Actions action;
	@Before
	public void setup() {
		// WebDriverManager.chromedriver().setup();

		// action = new Actions(driver);
		// driver.get(configreader.testUrl());
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ConfigReader reader = new ConfigReader();
		GetProperty prop = new GetProperty(reader);
		String browser = prop.browserName();

		obj.initBrowser(browser);

	}

	@After
	public void tearDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	// public Actions getAction() {
	// return action;
	// }

}
