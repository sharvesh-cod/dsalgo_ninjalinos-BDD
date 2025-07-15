package driverManager;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public WebDriver driver;
	// ThreadLocal WebDriver for parallel testing
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal();
	// Initialize WebDriver based on browser name

	public WebDriver initBrowser(String browser) {

		System.out.println("Initializing browser: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			tldriver.set(new ChromeDriver());

		}

		else if (browser.equalsIgnoreCase("Safari")) {
			tldriver.set(new SafariDriver());
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			tldriver.set(new FirefoxDriver());
		}
		WebDriver wd = getDriver();
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return wd;
	}

	// used to get the driver with ThreadLocal for parallel testing
	// thread local is used to make sure that each thread(test cases) getting its
	// own isolated webdriver instance

	public static synchronized WebDriver getDriver() {

		if (Objects.isNull(tldriver.get())) {
			throw new IllegalStateException("WebDriver not initialized for the current thread.");
		}
		return tldriver.get();
	}

	// cleanup thread

	public static void quitDriver() {
		if (tldriver.get() != null) {
			tldriver.get().quit();
			tldriver.remove();
		}

	}

}
