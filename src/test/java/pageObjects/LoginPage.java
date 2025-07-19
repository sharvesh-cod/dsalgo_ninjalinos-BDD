package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.Passing_Driver;
import utils.ConfigReader;

public class LoginPage {

	ConfigReader config;
	String browser;

	private WebDriver driver;
	private Actions action;

	@FindBy(className = "btn")
	WebElement launchBtn;

	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement signinBtn;

	@FindBy(id = "id_username")
	WebElement userName;

	@FindBy(id = "id_password")
	WebElement pwd;

	@FindBy(xpath = "//input[4]")
	WebElement logInBtn;

	@FindBy(xpath = "//*[text()='Sign out']")
	WebElement signOut;

	public LoginPage(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);

	}

	public void launch() {
		driver.get(config.get_prop_value("testurl"));
		launchBtn.click();

	}

	public void login() {
		signinBtn.click();
		userName.sendKeys(config.get_prop_value("username"));
		pwd.sendKeys(config.get_prop_value("password"));
		logInBtn.click();

	}

	public void logout() {
		signOut.click();

	}

}
