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

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

			try {

				String folderPath = System.getProperty("user.dir") + "/reports/screenshots/";
				File screenshotDir = new File(folderPath);
				if (!screenshotDir.exists()) {
					screenshotDir.mkdirs(); // creates folder structure
				}

				String savedScreenshot = scenario.getName().replaceAll(" ", "_");
				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(folderPath + savedScreenshot + ".png");

				FileUtils.copyFile(srcFile, destFile);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	@After(order = 0)
	public void tearDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
