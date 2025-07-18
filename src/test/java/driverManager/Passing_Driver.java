package driverManager;

import org.openqa.selenium.WebDriver;

public class Passing_Driver {

	private WebDriver driver;

	String browser;

	public Passing_Driver(DriverFactory obj) {
		this.browser = obj.return_browser();
		this.driver = obj.initBrowser(browser);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
