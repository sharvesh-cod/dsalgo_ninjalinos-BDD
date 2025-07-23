package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;

public class CommonMethods {
	private WebDriver driver;

	public CommonMethods(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();

	}

	public String currentUrl() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
