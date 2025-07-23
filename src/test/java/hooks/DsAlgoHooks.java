package hooks;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DsAlgoHooks {

	private WebDriver driver;

	public DsAlgoHooks(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
	}

	@Before
	public void setup() {

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

//	@After
//	public void tearDriver() throws InterruptedException {
//		if (driver != null) {
//			Thread.sleep(3000);
//			driver.quit();
//			Thread.sleep(3000);
//			driver = null;
//		}
//	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take a screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			try {
				// Create folder if it doesn't exist
				String folderPath = System.getProperty("user.dir") + "/reports/screenshots/";
				File screenshotDir = new File(folderPath);
				if (!screenshotDir.exists()) {
					screenshotDir.mkdirs(); // creates folder structure
				}
				// take a screenshot
				String savedScreenshot = scenario.getName().replaceAll(" ", "_");
				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(folderPath + savedScreenshot + ".png");

				// Save file
				FileUtils.copyFile(srcFile, destFile);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	@After(order = 0)
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
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
