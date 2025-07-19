package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;

public class CommonMethods {
	private WebDriver driver;

	public CommonMethods(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();

	}
//
//	public void bug_screenshot(String screenshotName, String browser) throws IOException {
//
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		Files.copy(screenshot, new File(
//				"src/test/resources/reports/screenshots/bugs_stack_queue/" + screenshotName + "_ " + browser + ".jpg"));
//
//	}

	public String url() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

}
