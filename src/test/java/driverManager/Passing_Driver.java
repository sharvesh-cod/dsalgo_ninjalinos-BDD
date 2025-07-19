package driverManager;

import org.openqa.selenium.WebDriver;

public class Passing_Driver {

	private WebDriver driver;

	String browser;

	public Passing_Driver(DriverFactory driverObj) {
		this.browser = driverObj.return_browser();
		this.driver = driverObj.initBrowser(browser);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
