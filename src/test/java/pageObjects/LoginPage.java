package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;

public class LoginPage {

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
