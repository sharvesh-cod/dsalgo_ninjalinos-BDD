package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;

public class LoginPage {

	ConfigReader config;
	String browser;

	private WebDriver driver;
	private Actions action;
	WebDriverWait wait;

	public LoginPage(Passing_Driver passdr) throws IOException {
		// DsAlgoHooks hooks = new DsAlgoHooks();
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);
	}

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//		// this.action = new Actions(driver);
//		PageFactory.initElements(driver, this);
//	}

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

	public void launch() {
		driver.get("https://dsportalapp.herokuapp.com/");
		launchBtn.click();

	}

	public void login() {
		signinBtn.click();
		userName.sendKeys("ninjalinos@work.com");
		pwd.sendKeys("sdet218920@");
		logInBtn.click();

	}

	public void logout() {
		signOut.click();

	}

}