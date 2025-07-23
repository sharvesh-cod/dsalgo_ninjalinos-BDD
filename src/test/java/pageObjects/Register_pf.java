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
import utils.ExcelReader;

public class Register_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;

	// Locators

	@FindBy(xpath = "//*[@name='username']")
	WebElement usernameTextbox;

	@FindBy(xpath = "//*[@name='password1']")
	WebElement passwordTextbox;

	@FindBy(xpath = "//*[@name='password2']")
	WebElement confirmpasswordTextbox;

	@FindBy(xpath = "//*[@value='Register']")
	WebElement registerButton;

	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	WebElement missmatchPasswordMessage;

	public Register_pf(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

//action methods

	public void setusername(String username) {
		usernameTextbox.sendKeys("ninjalinos@work.com");
	}

	public void setinvalidusername(String username) {
		usernameTextbox.sendKeys(username);
	}

	public void setinvalidpassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void setinvalidconfirmpassword(String confirmpassword) {
		confirmpasswordTextbox.sendKeys(confirmpassword);
	}

	public void setpassword(String password) {
		passwordTextbox.sendKeys("sdet218920@");
	}

	public void setconfirmpassword(String confirmpassword) {
		confirmpasswordTextbox.sendKeys("sdet218920@");
	}

	public void clickRegisterbutton() {
		registerButton.click();
	}

	public String missmatchPasswordMessage() {
		String msg = missmatchPasswordMessage.getText();
		return msg;
	}

	public String successfulMessage() {
		String msg = missmatchPasswordMessage.getText();
		return msg;
	}

	public String invalidAssertionUsernamebox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String validationMsg = (String) jse.executeScript("return arguments[0].validationMessage;", usernameTextbox);
		return validationMsg;
	}

	public String invalidAssertionconfirmpswdbox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String validationMsg = (String) jse.executeScript("return arguments[0].validationMessage;",
				confirmpasswordTextbox);
		return validationMsg;
	}

	public String invalidAssertionPasswdnamebox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String validationMsg = (String) jse.executeScript("return arguments[0].validationMessage;", passwordTextbox);
		return validationMsg;
	}

	public void setvalidDatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "validlogin", 1, 0);
		String password = ExcelReader.getData(filepath, "validlogin", 1, 1);
		String confirmpassword = ExcelReader.getData(filepath, "validlogin", 1, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

	public void setemptydatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "register", 1, 0);
		String password = ExcelReader.getData(filepath, "register", 1, 1);
		String confirmpassword = ExcelReader.getData(filepath, "register", 1, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

	public void setonlyusernamefromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "register", 2, 0);
		String password = ExcelReader.getData(filepath, "register", 2, 1);
		String confirmpassword = ExcelReader.getData(filepath, "register", 2, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

	public void setonlypasswordfromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "register", 3, 0);
		String password = ExcelReader.getData(filepath, "register", 3, 1);
		String confirmpassword = ExcelReader.getData(filepath, "register", 3, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

	public void setwithoutconfirmpasswordfromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "register", 4, 0);
		String password = ExcelReader.getData(filepath, "register", 4, 1);
		String confirmpassword = ExcelReader.getData(filepath, "register", 4, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

	public void setinvaliddatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		String username = ExcelReader.getData(filepath, "register", 5, 0);
		String password = ExcelReader.getData(filepath, "register", 5, 1);
		String confirmpassword = ExcelReader.getData(filepath, "register", 5, 2);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		registerButton.click();
	}

}
