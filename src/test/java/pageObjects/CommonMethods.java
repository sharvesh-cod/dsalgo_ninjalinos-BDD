package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverFactory;
import utils.ConfigReader;

public class CommonMethods {

	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	ConfigReader configReader;

	public CommonMethods() {
		this.driver = DriverFactory.getDriver(); // get current driver from ThreadLocal
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

//	// to verify Try Editor Url
//	public void VerifyTryEditorUrl() throws IOException {
//		configReader = new ConfigReader();
//		String baseUrl = configReader.initProp().getProperty("url");
//		String actualUrlTryEditor = driver.getCurrentUrl();
//		String expectedUrl = baseUrl + "/tryEditor";
//		System.out.println("Current Url TryHere" + actualUrlTryEditor);
//		Assert.assertEquals(actualUrlTryEditor, expectedUrl, "Successfully Naviagted to TryEditor");
//
//	}

	// to click the Try Editor in respective page

	public void clickTryEditor(WebElement element) {
		action.scrollToElement(element).perform();
		action.click(element).perform();
	}

// to check the current driver URL 	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
