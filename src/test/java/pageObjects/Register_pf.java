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
import utils.ExcelReader;

public class Register_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;

//	WebDriver driver;
//	
//	//constructor
//	 public Register_pf(WebDriver driver)
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
//	}

	// Locators

	@FindBy(xpath = "//*[@name='username']")
	WebElement usernameTextbox;

	@FindBy(xpath = "//*[@name='password1']")
	WebElement passwordTextbox;

	@FindBy(xpath = "//*[@name='password2']")
	WebElement confirmpasswordTextbox;

	@FindBy(xpath = "//*[@value='Register']")
	WebElement RegisterButton;

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
		RegisterButton.click();
	}

	public void missmatchPasswordMessage() {
		missmatchPasswordMessage.getText();
	}

	public void setvalidDatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		int rows = ExcelReader.rowCount(filepath, "validlogin");
		String username = ExcelReader.getData(filepath, "validlogin", 1, 0);
		String password = ExcelReader.getData(filepath, "validlogin", 1, 1);
		String confirmpassword = ExcelReader.getData(filepath, "validlogin", 1, 2);

		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		confirmpasswordTextbox.sendKeys(confirmpassword);
		RegisterButton.click();
	}

	public void setinvalidDatafromExcel() throws IOException {
		String filepath = System.getProperty("user.dir") + "\\testdata\\data.xlsx";
		int rows = ExcelReader.rowCount(filepath, "invalidregister");
		for (int i = 1; i <= rows; i++) {
			String username = ExcelReader.getData(filepath, "invalidregister", i, 0);
			String password = ExcelReader.getData(filepath, "invalidregister", i, 1);
			String confirmpassword = ExcelReader.getData(filepath, "invalidregister", i, 2);

			usernameTextbox.sendKeys(username);
			passwordTextbox.sendKeys(password);
			confirmpasswordTextbox.sendKeys(confirmpassword);
			RegisterButton.click();
		}
	}

}