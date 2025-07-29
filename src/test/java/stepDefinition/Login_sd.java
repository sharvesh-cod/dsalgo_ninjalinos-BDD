package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Launch_pf;
import pageObjects.Login_pf;
import utils.ConfigReader;

public class Login_sd {

	private WebDriver driver;
	private Login_pf Login_pf;
	private Launch_pf Launch_pf;

	String browser;
	ConfigReader config;

	public Login_sd(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.Login_pf = new Login_pf(passdr);
		this.Launch_pf = new Launch_pf(passdr);
		this.config = new ConfigReader();

	}

	@Given("the user is on the Home page")
	public void the_user_is_on_the_home_page() {
		Launch_pf.geturl();
		Launch_pf.clickgetstarted();

	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		Login_pf.clickSigninLink();

	}

	@When("the user enters valid username  password and clicks on Login")
	public void the_user_enters_valid_username_password_and_clicks_on_login() throws IOException {
		Login_pf.setvalidDatafromExcel();
	}

	@Then("the user lands on Home page with message {string}")
	public void the_user_lands_on_home_page_with_message(String expsuccessmsg) {
		String actualsuccessfullmessage = Login_pf.loginsuccesfullmessage();
		Assert.assertEquals(expsuccessmsg, actualsuccessfullmessage, "user is not logged in");

	}

	@When("the user clicks on Loginbutton without entering username and password")
	public void the_user_clicks_on_loginbutton_without_entering_username_and_password() throws IOException {
		Login_pf.setDatafromExcelwithemptyfields();

	}

	@Then("the user should able to see error_message {string} under usernametextbox")
	public void the_user_should_able_to_see_error_message_under_usernametextbox(String experrormsg) {
		String actualerrormessage = Login_pf.invalidAssertionusernamebox();
		Assert.assertEquals(actualerrormessage, experrormsg,
				"user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on loginbutton by entering username without password")
	public void the_user_clicks_on_loginbutton_by_entering_username_without_password() throws IOException {
		Login_pf.setDatafromExcelwithusernameNoPassword();
	}

	@Then("the user should able to see errormessage {string} under passwordtextbox")
	public void the_user_should_able_to_see_errormessage_under_passwordtextbox(String experrormsg) {
		String actualerrormessage = Login_pf.invalidAssertiopasswordbox();
		Assert.assertEquals(actualerrormessage, experrormsg,
				"user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on loginbutton by entering password without username")
	public void the_user_clicks_on_loginbutton_by_entering_password_without_username() throws IOException {
		Login_pf.setDatafromExcelwithPasswordnousername();
	}

	@Then("the user should able to see errormessage {string} under usernametextbox")
	public void the_user_should_able_to_see_errormessage_under_usernametextbox(String experrormsg) {
		String actualerrormessage = Login_pf.invalidAssertionusernamebox();
		Assert.assertEquals(actualerrormessage, experrormsg,
				"user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on loginbutton by entering invalid username and invalid password")
	public void the_user_clicks_on_loginbutton_by_entering_invalid_username_and_invalid_password() throws IOException {
		Login_pf.setDatafromExcelinvalidData();
	}

	@Then("the user should able to see errormessage {string}")
	public void the_user_should_able_to_see_errormessage(String experrormsg) {
		String acterrormsg = Login_pf.invaliddatamessage();
		Assert.assertEquals(experrormsg, acterrormsg, "user is not able to see 'please fill out this field'message");
	}

}