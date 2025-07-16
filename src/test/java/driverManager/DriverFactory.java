package driverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {

	// ThreadLocal WebDriver for parallel testing if picocontainer is not used
	// public static ThreadLocal<WebDriver> tldriver = new ThreadLocal();
	private WebDriver driver;
	String browser;

	public DriverFactory(ConfigReader config) throws IOException {

		this.browser = config.get_prop_value("browser");
	}

	// Initialize WebDriver based on browser name
	public WebDriver initBrowser(String browser) {

		// System.out.println("Initializing browser: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();

		}

		else if (browser.equalsIgnoreCase("Safari")) {
			// tldriver.set(new SafariDriver());
			driver = new SafariDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			// tldriver.set(new FirefoxDriver());
			driver = new FirefoxDriver();
			// WebDriverManager.firefoxdriver().setup();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			// tldriver.set(new FirefoxDriver());
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else {
			throw new IllegalArgumentException("Unsupported Browser:" + browser);

		}
//		getBrowser().manage().deleteAllCookies();
//		getBrowser().manage().window().maximize();
//		getBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;

	}

//	public WebDriver return_driver() {
//	
	// return driver;
//	}

	public String return_browser() {
		return browser;
	}

	// used to ge the driver with ThreadLocal for parallel testing
//	public static WebDriver getBrowser() {
//
//		if (Objects.isNull(tldriver.get())) {
//			throw new IllegalStateException("WebDriver not initialized for the current thread.");
//		}
//		return tldriver.get();
//	}
//
//	// cleanup thread
//
//	public static void quitDriver() {
//		if (tldriver.get() != null) {
//			tldriver.get().quit();
//			tldriver.remove();
//		}
//
//	}

}
