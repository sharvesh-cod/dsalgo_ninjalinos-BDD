package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;

public class Launch_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;

//	WebDriver driver;
//
//	// constructor
//	public Launch_pf(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	// Locators

	@FindBy(xpath = "//*[text()='You are at the right place']")
	WebElement message;

	@FindBy(xpath = "//*[text()='Get Started']")

	WebElement btn_getstarted;

	@FindBy(xpath = "//*[text()='NumpyNinja']")
	WebElement NumpyNinja;

	public Launch_pf(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

//*[text()='NumpyNinja']
//action methods

	public void clickgetstarted() {
		btn_getstarted.click();
	}

	public void NumpyNinja() {
		NumpyNinja.isDisplayed();

	}

	public void geturl() {
		driver.get("https://dsportalapp.herokuapp.com/");

	}

	public String gettextmsg() {
		String text = message.getText();
		return text;
	}
}