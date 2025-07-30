package stepDefinition;

import java.io.IOException;

import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Home_pf;
import pageObjects.Launch_pf;
import pageObjects.Register_pf;
import utils.ConfigReader;
import utils.LoggerLoad;

public class Register_sd {

	private Launch_pf Launch_pf;
	private Register_pf Register_pf;
	private Home_pf Home_pf;

	String browser;
	ConfigReader config;

	LoggerLoad log;

	public Register_sd(Passing_Driver passdr) throws IOException {

		this.Launch_pf = new Launch_pf(passdr);
		this.Register_pf = new Register_pf(passdr);
		this.Home_pf = new Home_pf(passdr);
		this.config = new ConfigReader();
		this.log = new LoggerLoad();

	}

	@Given("the user is on Register page after clicking on registerlink from Home page")
	public void the_user_is_on_register_page_after_clicking_on_registerlink_from_home_page() {
		Launch_pf.geturl();
		Launch_pf.clickgetstarted();
		Home_pf.clickRegister();
	}

	@When("the user enters valid inputs and clicks on register button")
	public void the_user_enters_valid_inputs_and_clicks_on_register_button() throws IOException {
		Register_pf.setvalidDatafromExcel();
	}

	@Then("User able to see {string}  message")
	public void user_able_to_see_message(String expmsg) {
		String actmsg = Register_pf.successfulMessage();
		log.error("user not able to see the message 'user is already registered'");
		Assert.assertEquals(actmsg, expmsg, "user not able to see 'user is already registered'");
	}

	@When("the user clicks on register button with empty fields")
	public void the_user_clicks_on_register_button_with_empty_fields() throws IOException {
		Register_pf.setemptydatafromExcel();
	}

	@Then("the user should see error message {string} below usernamebox")
	public void the_user_should_see_error_message_below_usernamebox(String Experrormsg) {
		// missed to check the expected string
		String acterrormsg = Register_pf.invalidAssertionUsernamebox();
		Assert.assertEquals(acterrormsg, acterrormsg, "user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on register button by entering username and remaining fields empty")
	public void the_user_clicks_on_register_button_by_entering_username_and_remaining_fields_empty()
			throws IOException {
		Register_pf.setonlyusernamefromExcel();
	}

	@Then("the user should see error message {string} below passwordbox")
	public void the_user_should_see_error_message_below_passwordbox(String Experrmsg) {
		String acterrmsg = Register_pf.invalidAssertionPasswdnamebox();
		Assert.assertEquals(acterrmsg, Experrmsg, "user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on register button by entering password and reamining fields empty")
	public void the_user_clicks_on_register_button_by_entering_password_and_reamining_fields_empty()
			throws IOException {
		Register_pf.setonlypasswordfromExcel();
	}

	@When("the user clicks on register button after entering username and password with empty confirmpassword")
	public void the_user_clicks_on_register_button_after_entering_username_and_password_with_empty_confirmpassword()
			throws IOException {
		Register_pf.setwithoutconfirmpasswordfromExcel();
	}

	@Then("the user should see error message {string} below confirmpasswordbox")
	public void the_user_should_see_error_message_below_confirmpasswordbox(String Experrmsg) {
		String actermsg = Register_pf.invalidAssertionconfirmpswdbox();
		Assert.assertEquals(actermsg, Experrmsg, "user is not able to see 'please fill out this field'message");
	}

	@When("the user clicks on register button after entering invalid data in all fields")
	public void the_user_clicks_on_register_button_after_entering_invalid_data_in_all_fields() throws IOException {
		Register_pf.setinvaliddatafromExcel();
	}

	@Then("the user should see error message {string}")
	public void the_user_should_see_error_message(String expmsg) {
		String actmsg = Register_pf.missmatchPasswordMessage();
		Assert.assertEquals(actmsg, expmsg, "user is not able to see 'please fill out this field'message");
	}

}