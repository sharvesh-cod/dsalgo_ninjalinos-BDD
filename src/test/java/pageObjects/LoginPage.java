package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//button[text()='Get Started']")
	private WebElement getStarted;

	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signin;

	@FindBy(id = "id_username")
	private WebElement usernameField;

	@FindBy(id = "id_password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickStart() {
		getStarted.click();
	}

	public void signIn() {
		signin.click();
	}

	public void enterUserName(String uName) {
		usernameField.sendKeys(uName);

	}

	public void passwordField(String pName) {
		usernameField.sendKeys(pName);

	}

	public void clickLogin() {

		loginButton.click();
	}

	public void getTitile() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
