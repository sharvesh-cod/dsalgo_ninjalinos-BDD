package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;
import utils.ConfigReader;

public class LoginPage {

	ConfigReader config;

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

	public LoginPage() {

	}

	public LoginPage(Hooks hooks) {

		driver = hooks.getDriver();
		action = new Actions(driver);
		PageFactory.initElements(driver, this);

	}

	public void launch() {
		driver.get(config.testUrl());
		launchBtn.click();

	}

	public void login() {
		signinBtn.click();
		userName.sendKeys(config.userName());
		pwd.sendKeys(config.pwd());
		logInBtn.click();

	}

	public void logout() {
		signOut.click();

	}

}
