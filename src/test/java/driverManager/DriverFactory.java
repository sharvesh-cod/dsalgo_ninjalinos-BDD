package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public WebDriver chromeBrowser() {
		return driver = new ChromeDriver();
	}
	
public WebDriver fireFoxBrowser() {	
	return driver = new FirefoxDriver();		
	}

public WebDriver safribrowser() {
	return driver = new SafariDriver();
}

public static WebDriver getDriver() {
	
	
	return driver;
	
	
}

}
