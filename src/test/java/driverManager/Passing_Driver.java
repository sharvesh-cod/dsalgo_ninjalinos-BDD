package driverManager;

<<<<<<< HEAD
public class Passing_Driver {
=======
import org.openqa.selenium.WebDriver;

public class Passing_Driver {

	private WebDriver driver;

	String browser;
	String headless;

	public Passing_Driver(DriverFactory driverObj) {
		this.browser = driverObj.return_browser();
		this.headless = driverObj.return_headless_option();
		this.driver = driverObj.initBrowser(browser, headless);
	}

	public WebDriver getDriver() {
		return driver;
	}
>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git

}
