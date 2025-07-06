package stepDefinition;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginPage_sd {

	WebDriver driver = DriverFactory.getBrowser();
	private LoginPage loginPg = new LoginPage(driver);

	@Given("User launches the browser")
	public void user_launches_the_browser() {
		DriverFactory.getBrowser().get("https://dsportalapp.herokuapp.com");

	}

	@Given("navigates to {string}")
	public void navigates_to(String string) {
		//
		// throw new io.cucumber.java.PendingException();
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		// throw new io.cucumber.java.PendingException();
	}

	@When("User provides the valid username, password")
	public void user_provides_the_valid_username_password() {

		// throw new io.cucumber.java.PendingException();
	}

	@When("click login button")
	public void click_login_button() {

		// throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the home page")
	public void user_should_see_the_home_page() {

//		throw new io.cucumber.java.PendingException();
	}

	@Then("close the browser")
	public void close_the_browser() {
// 		throw new io.cucumber.java.PendingException();
	}

	@When("User provides the invalid username, password")
	public void invalid_username_password() {
		// throw new io.cucumber.java.PendingException();

	}

	@Then("User should see the error pop-up msg Invalid Username and Password")
	public void invalid_username_and_password() {
		// throw new io.cucumber.java.PendingException();

	}

}
