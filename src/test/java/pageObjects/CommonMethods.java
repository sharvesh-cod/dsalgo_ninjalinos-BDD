package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;

public class CommonMethods {

	private WebDriver driver;
	Actions action;
	WebDriverWait wait;

	public CommonMethods(Passing_Driver passdr) {
		this.driver = passdr.getDriver();
		action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	public void clickTryEditor(WebElement element) {
		action.scrollToElement(element).perform();
		action.click(element).perform();
	}

// to check the current driver URL 	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {

		return driver.getTitle();
	}

}
