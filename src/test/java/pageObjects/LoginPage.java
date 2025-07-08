package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "id_username")
	WebElement usernameField;

	@FindBy(id = "id_password")
	WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}