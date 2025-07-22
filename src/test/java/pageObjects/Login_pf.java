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

public class Login_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;

//	public WebDriver driver;
//
//	// constructor
//	public Login_pf(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	// Locators

	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement SigninLink;

	@FindBy(xpath = "//*[@name='username']")
	WebElement Username_textbox;

	@FindBy(xpath = "//*[@name='password']")
	WebElement Password_textbox;

	@FindBy(xpath = "//*[@value=\"Login\"]")
	WebElement Login_button;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement loginsuccesfullmessage;

	@FindBy(xpath = "//*[@name='username']")
	WebElement Usernameinvalid_textbox;

	@FindBy(xpath = "//*[@name='password']")
	WebElement Passwordinvalid_textbox;

	@FindBy(xpath = "//div[@role='alert'] ")
	WebElement invaliddatamsg;
	// div[@role='alert']

	public Login_pf(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

//*[@role='alert']
//action methods

	public void clickSigninLink() {
		SigninLink.click();
	}

	public void set_username(String username) {
		Username_textbox.sendKeys("ninjalinos@work.com");
	}

	public void set_invalidusername(String username) {
		Usernameinvalid_textbox.sendKeys(username);
	}

	public void set_invalidpassword(String password) {
		Passwordinvalid_textbox.sendKeys(password);
	}

	public void set_password(String password) {
		Password_textbox.sendKeys("sdet218920@");
	}

	public void clickLoginbutton() {
		Login_button.click();
	}

	public String loginsuccesfullmessage() {
		String msg = loginsuccesfullmessage.getText();
		return msg;
		// loginsuccesfullmessage.getText();
	}

	public String invaliddatamessage() {
		String msg = invaliddatamsg.getText();
		return msg;
		// loginsuccesfullmessage.getText();
	}

	public void setvalidDatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";

		String username = ExcelReader.getData(filepath, "validlogin", 1, 0);
		String password = ExcelReader.getData(filepath, "validlogin", 1, 1);
		Username_textbox.sendKeys(username);
		Password_textbox.sendKeys(password);
		Login_button.click();
	}

	public void setDatafromExcelwithemptyfields() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";

		String username = ExcelReader.getData(filepath, "login", 1, 0);
		String password = ExcelReader.getData(filepath, "login", 1, 1);
		Username_textbox.sendKeys(username);
		Password_textbox.sendKeys(password);
		Login_button.click();
	}

	public void setDatafromExcelwithusernameNoPassword() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";

		String username = ExcelReader.getData(filepath, "login", 2, 0);
		String password = ExcelReader.getData(filepath, "login", 2, 1);
		Username_textbox.sendKeys(username);
		Password_textbox.sendKeys(password);
		Login_button.click();
	}

	public void setDatafromExcelwithPasswordnousername() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";

		String username = ExcelReader.getData(filepath, "login", 3, 0);
		String password = ExcelReader.getData(filepath, "login", 3, 1);
		Username_textbox.sendKeys(username);
		Password_textbox.sendKeys(password);
		Login_button.click();
	}

	public void setDatafromExcelinvalidData() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";

		String username = ExcelReader.getData(filepath, "login", 4, 0);
		String password = ExcelReader.getData(filepath, "login", 4, 1);
		Username_textbox.sendKeys(username);
		Password_textbox.sendKeys(password);
		Login_button.click();
	}

	public String invalidAssertionusernamebox() {

		// Adjust locator if needed
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String validationMsg = (String) jse.executeScript("return arguments[0].validationMessage;", Username_textbox);
		// System.out.println("Validation message: " + validationMsg);
		return validationMsg;
	}

	public String invalidAssertiopasswordbox() {

		// Adjust locator if needed
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String validationMsg = (String) jse.executeScript("return arguments[0].validationMessage;", Password_textbox);
		// System.out.println("Validation message: " + validationMsg);
		return validationMsg;
	}

	public void setinvalidDatafromExcel() throws IOException {
		System.out.println("hi");
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		int rows = ExcelReader.rowCount(filepath, "login");
		System.out.println("rows=" + rows);

		for (int i = 1; i <= rows; i++) {
			// System.out.println("iteration=" + i);
			// read data from excel
			// int j = 1;
			String uname = ExcelReader.getData(filepath, "login", i, 0);
			System.out.println("user:" + uname);
			String pwd = ExcelReader.getData(filepath, "login", i, 1);
			System.out.println("pwd:" + pwd);
			// String error_message = ExcelReader.getData(filepath, "login", i, 0);
			// pass data to application
			Usernameinvalid_textbox.sendKeys(uname);
			Passwordinvalid_textbox.sendKeys(pwd);

			Login_button.click();
			// }
		}
	}
}