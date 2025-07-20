package hooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class DsAlgoHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() throws IOException {

		configreader = new ConfigReader();
		prop = configreader.initProp();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initBrowser(browserName);

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				// Create folder if it doesn't exist
				String folderPath = System.getProperty("user.dir") + "/reports/screenshots/";
				File screenshotDir = new File(folderPath);
				if (!screenshotDir.exists()) {
					screenshotDir.mkdirs(); // creates folder structure
				}
				// take a screenshot
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(folderPath + screenshotName + ".png");

				// Save file
				FileUtils.copyFile(srcFile, destFile);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

//	@After(order = 0)
//	public void closeBrowser() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
}
