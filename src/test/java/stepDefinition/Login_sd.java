package stepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethods;
import pageObjects.Launch_pf;
import pageObjects.Login_pf;
import utils.ConfigReader;

public class Login_sd {

	private WebDriver driver;
	private Login_pf Login_pf;
	private Launch_pf Launch_pf;
	// private LoginPage loginpage;
	// private CodeEditor_pf codeeditor;
	String browserName;
	ConfigReader config;
	CommonMethods common;

	public Login_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.Login_pf = new Login_pf(passdr);
		this.Launch_pf = new Launch_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");
		// this.common = new CommonMethods(passdr);

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

//	WebDriver driver = DriverFactory.getDriver();
//	public Login1pf lg;
//	public Launch1pf lap;
//	public Home1pf Hm;

	@Given("the user is on the Home page")
	public void the_user_is_on_the_home_page() {
		driver.get("https://dsportalapp.herokuapp.com/");

		// lap=new Launch1pf(driver);
		// Hm =new Home1pf(driver);
		Launch_pf.clickgetstarted();

	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {

		Login_pf.clickSigninLink();
		// Login1pf.clickSigninLink();
	}

	@When("the user enters valid username  password and clicks on Login")
	public void the_user_enters_valid_username_password_and_clicks_on_login() throws IOException {
//		Login_pf.set_username(null);
//		Login_pf.set_password(null);
//		Login_pf.clickLoginbutton();
		Login_pf.setvalidDatafromExcel();
	}

	@Then("the user lands on Home page with message {string}")
	public void the_user_lands_on_home_page_with_message(String string) {

	}

	@When("the user enters   {string} and {string} and clicks on Login")
	public void the_user_enters_and_and_clicks_on_login(String username, String password) throws IOException {
//  lg.set_invalidusername(Username);
//  lg.set_invalidpassword(Password);
//  lg.clickLoginbutton();
		Login_pf.setinvalidDatafromExcel();
	}

	@Then("the user will able to see {string} in login page")
	public void the_user_will_able_to_see_in_login_page(String string) {

	}

}