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
		return driver;

	}

	public String return_browser() {
		return browser;
	}
}

// ***************************************************************************************
// CODE FOR PARALLEL EXECUTION USING THREAD LOCAL AND DRIVER FACTORY
//package driverManager;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
//
//public class DriverFactory {
//
//	// ThreadLocal for parallel test execution
//	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
//
//	// Initialize driver based on browser name
//	public WebDriver initDriver(String browser) { // creates a browser per thread
//
//		System.out.println("Launching browser: " + browser);
//
//		if (browser.equalsIgnoreCase("chrome")) {
//			tlDriver.set(new ChromeDriver());
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			tlDriver.set(new FirefoxDriver());
//		} else if (browser.equalsIgnoreCase("safari")) {
//			tlDriver.set(new SafariDriver());
//		} else {
//			System.out.println("Invalid browser name: " + browser + ". Defaulting to Chrome.");
//			tlDriver.set(new ChromeDriver());
//		}
//
//		getDriver().manage().window().maximize();
//		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//
//		return getDriver(); // returns driver for that thread
//	}
//
//	// Get driver instance for current thread
//	public static WebDriver getDriver() { // NOTICE THAT THIS IS A STATIC METHOD
//		return tlDriver.get();
//	}
//
//	// Quit driver for current thread
//	public static void quitDriver() { // STATIC METHOD
//		if (tlDriver.get() != null) {
//			tlDriver.get().quit();
//			tlDriver.remove();
//		}
//	}
//}
//***************************************************************************************

//ORIGINAL RAW CODE FOR DRIVER FACTORY FOR NON PARALLEL
//package driverManager;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DriverFactory {
//
//	private static WebDriver driver; // Creating single instance of the WebDriver
//
//	public static WebDriver initDriver() { // Initialize the WebDriver
//		if (driver == null) {
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		}
//		return driver;
//	}
//
//	public static WebDriver getDriver() { // Get the current WebDriver instance
//		return driver;
//	}
//
//	public static void quitDriver() { // Quit and clean up the WebDriver
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
//	}
//}

// Notes: 1. It is used To ensure only one WebDriver instance per test.
//  2.If you're using parallel execution, using a static WebDriver won't work because:
//   Threads share the same driver → Tests interfere with each other.