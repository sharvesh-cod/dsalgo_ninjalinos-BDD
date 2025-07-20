package hooks;

import java.time.Duration;

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
		// driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			// take a screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

//			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(screenshotFile,
//						new File("src/test/resources/reports/screenshots/" + screenshotName + ".png"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

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