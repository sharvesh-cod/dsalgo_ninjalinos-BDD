package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;
import utils.ExcelReaderFile;

public class LoginPage {

	ConfigReader config;
	String browser;
	WebDriverWait wait;
	JavascriptExecutor js;

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
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;

	}

	public void launch() {
		driver.get(config.get_prop_value("testurl"));
		launchBtn.click();

	}

	public void signin_btn() {
		signinBtn.click();
	}

	public void user_name() throws IOException, InterruptedException {
		String path = config.get_prop_value("path");
		String data = ExcelReaderFile.getData(path, "credentials", 1, 0);
		userName.sendKeys(data);

	}

	public void password() throws IOException, InterruptedException {
		String path = config.get_prop_value("path");
		String data = ExcelReaderFile.getData(path, "credentials", 1, 1);
		pwd.sendKeys(data);

	}

	public void login_btn() {
		logInBtn.click();

	}

	public void logout() {
		signOut.click();

	}
//	userName.sendKeys(config.get_prop_value("username"));
//	pwd.sendKeys(config.get_prop_value("password"));

}
