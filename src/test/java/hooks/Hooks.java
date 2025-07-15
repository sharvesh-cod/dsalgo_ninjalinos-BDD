package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver driver;
	// ConfigReader configreader;
	// String browser;

	public Hooks(Passing_Driver passdr) {
		// this.browser = obj.return_browser();
		this.driver = passdr.getDriver();
	}

	// private Actions action;
	@Before
	public void setup() {
		// WebDriverManager.chromedriver().setup();

		// action = new Actions(driver);
		// driver.get(configreader.testUrl());

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@After
	public void tearDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

//	public WebDriver getDriver_fromHooks() {
//		return driver;
//	}

}
