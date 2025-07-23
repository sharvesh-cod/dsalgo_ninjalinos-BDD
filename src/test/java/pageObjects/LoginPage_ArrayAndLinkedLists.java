package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;
import utils.ExcelReader;

public class LoginPage_ArrayAndLinkedLists {

	ConfigReader config;
	String browser;

	private WebDriver driver;
	private Actions action;
	WebDriverWait wait;
	ExcelReader excelReader;
	String path;

	public LoginPage_ArrayAndLinkedLists(Passing_Driver passdr) throws IOException {
		// DsAlgoHooks hooks = new DsAlgoHooks();
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReader(path);
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
		// driver.get("https://dsportalapp.herokuapp.com/");
		driver.get(config.get_prop_value("testurl"));
		launchBtn.click();

	}

	public void signin_btn() {
		signinBtn.click();
	}

	public void user_name() throws IOException, InterruptedException {
		// String path = config.get_prop_value("path");
		// ExcelReader reader = new ExcelReader(path, "credentials");
		String data = excelReader.getData("credentials", 1, 0);
		// String data = ExcelReader.getData(path, "credentials", 1, 0);
		userName.sendKeys(data);

	}

	public void password() throws IOException, InterruptedException {
		// String path = config.get_prop_value("path");
		// ExcelReader reader = new ExcelReader(path, "credentials");
		String data = excelReader.getData("credentials", 1, 1);
		// String data = ExcelReader.getData(path, "credentials", 1, 1);
		pwd.sendKeys(data);

	}

	public void login_btn() {
		logInBtn.click();

	}

//	public void login() throws IOException ,InterruptedException {
//		signinBtn.click();
//		userName.sendKeys("ninjalinos@work.com");
//		pwd.sendKeys("sdet218920@");
//		logInBtn.click();
//
//	}

	public void logout() {
		signOut.click();

	}

}