package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;

public class CommonMethods {

	private WebDriver driver;
	Actions action;
	WebDriverWait wait;
	ConfigReader config;

	public CommonMethods(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.config = new ConfigReader();
	}

	public String currentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void get_testUrl() {
		driver.get(config.get_prop_value("testurl"));
	}

}
