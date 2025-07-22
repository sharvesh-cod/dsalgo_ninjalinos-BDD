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
import pageObjects.Home_pf;
import pageObjects.Launch_pf;
import pageObjects.Register_pf;
import utils.ConfigReader;

public class Register_sd {

	private WebDriver driver;
	private Launch_pf Launch_pf;
	private Register_pf Register_pf;
	private Home_pf Home_pf;
	// private LoginPage loginpage;
	// private CodeEditor_pf codeeditor;
	String browserName;
	ConfigReader config;
	CommonMethods common;

	public Register_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.Launch_pf = new Launch_pf(passdr);
		this.Register_pf = new Register_pf(passdr);
		this.Home_pf = new Home_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");
		// this.common = new CommonMethods(passdr);

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("the user is on Register page after clicking on registerlink from Home page")
	public void the_user_is_on_register_page_after_clicking_on_registerlink_from_home_page() {
		driver.get("https://dsportalapp.herokuapp.com/");
		Launch_pf.clickgetstarted();
		Home_pf.clickRegister();
	}
//	
//	@When("the user clicks on the Register")
//	public void the_user_clicks_on_the_register() {
//		// Hm =new Home1pf(driver);
//		Home_pf.clickRegister();
//		// rg=new Register1pf(driver);
//
//	}

	@When("the user enters valid inputs and clicks on register button")
	public void the_user_enters_valid_inputs_and_clicks_on_register_button() throws IOException {

		Register_pf.setinvalidDatafromExcel();
//		Register_pf.setusername(null);
//		Register_pf.setpassword(null);
//		Register_pf.setconfirmpassword(null);
//		Register_pf.clickRegisterbutton();
	}

	@Then("User able to see succesfully registered  message")
	public void user_able_to_see_succesfully_registered_message() {

	}

	@When("the user enters {string} {string} and {string} and clicks register button")
	public void the_user_enters_and_and_clicks_register_button(String string, String string2, String string3)
			throws IOException {

		Register_pf.setinvalidDatafromExcel();

		// Register_pf.setinvalidusername(string);
//		Register_pf.setinvalidpassword(string2);
//		Register_pf.setinvalidconfirmpassword(string3);
//		Register_pf.clickRegisterbutton();

	}

	@Then("the user be able to see error message")
	public void the_user_be_able_to_see_error_message() {

	}

}