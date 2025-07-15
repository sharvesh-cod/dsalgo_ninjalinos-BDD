package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverFactory;

public class CommonMethods {

	WebDriver driver;

	public CommonMethods() {
		this.driver = DriverFactory.getDriver(); // get current driver from ThreadLocal
	}

	public void VerifyTryEditorUrl() {

		String actualUrlTryEditor = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		System.out.println("Current Url TryHere" + actualUrlTryEditor);
		Assert.assertEquals(actualUrlTryEditor, expectedUrl, "Successfully Naviagted to TryEditor");

		// include form -> config.properties+"/tryEditor"
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
