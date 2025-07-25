
//*************************** CODE WITH HEADLESS MODE********************************
package driverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {
	private WebDriver driver;
	String browser;
	String headless;

	public DriverFactory(ConfigReader config) throws IOException {

		this.browser = config.get_prop_value("browser");
		this.headless = config.get_prop_value("headless");
	}

	// Initialize WebDriver based on browser name
	public WebDriver initBrowser(String browser, String headless) {

		if (browser.equalsIgnoreCase("chrome")) {
			if (headless.equalsIgnoreCase("true")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=new");
				options.addArguments("--start-maximized");
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				WebDriverManager.chromedriver().setup();
			} else {
				driver = new ChromeDriver();
				WebDriverManager.chromedriver().setup();
			}

		}

		else if (browser.equalsIgnoreCase("Safari")) {
			// tldriver.set(new SafariDriver());
			driver = new SafariDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			if (headless.equalsIgnoreCase("true")) {
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("browser.sessionstore.resume_from_crash", false);

				profile.setPreference("browser.sessionstore.enabled", false);
				profile.setPreference("browser.sessionstore.max_tabs_undo", 0);

				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--headless");
				options.setProfile(profile);

				driver = new FirefoxDriver(options);
			} else {
				driver = new FirefoxDriver();
			}

		}

		else if (browser.equalsIgnoreCase("edge")) {
			if (headless.equalsIgnoreCase("true")) {
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--headless=new");
				driver = new EdgeDriver(options);
			} else {
				driver = new EdgeDriver();
			}
		}

		else {
			throw new IllegalArgumentException("Unsupported Browser:" + browser);

		}
		return driver;

	}

	public String return_browser() {
		return browser;
	}

	public String return_headless_option() {
		return headless;
	}

}
