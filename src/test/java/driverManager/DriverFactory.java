package driverManager;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

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
		getBrowser().manage().deleteAllCookies();
		getBrowser().manage().window().maximize();
		getBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getBrowser();
	}

	// used to ge the driver with ThreadLocal for parallel testing
	public static WebDriver getBrowser() {

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
