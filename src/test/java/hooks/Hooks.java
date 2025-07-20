package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver driver;

	public Hooks(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
	}

	@Before
	public void setup() {

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@After
	public void tearDriver() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(3000);
			driver.quit();
			Thread.sleep(3000);
			driver = null;
		}
	}

}

//************* MY ORIGINAL CODE*****************************
//package hooks;
//
//import org.openqa.selenium.WebDriver;
//
//import driverManager.DriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import utils.ConfigReader;
//
//public class DsAlgoHooks {
//
//	private DriverFactory driverFactory;
//	private WebDriver driver;
//
//	@Before
//	public void setUp() {
//		String browserName = ConfigReader.get("browser"); // Direct static access
//		driverFactory = new DriverFactory();
//		driver = driverFactory.initDriver(browserName);
//	}
//
//	@After
//	public void tearDown() {
//		DriverFactory.quitDriver();
//	}
//}

//@A1 or @A2 or @A3 or @A4 or @A5 or @A6 or @A7 or @A8 or @A9 or @A10 or @A11 or @A12 or @A13 or @A14 or @A15 or @A16 or @A17 or @A18 or @A19 or @A20 or @A21"
