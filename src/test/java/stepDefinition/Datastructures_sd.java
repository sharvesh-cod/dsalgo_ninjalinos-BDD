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
import pageObjects.Datastructure_pf;
import pageObjects.Launch_pf;
import pageObjects.Login_pf;
import utils.ConfigReader;
//import junit.framework.Assert;

public class Datastructures_sd {

	private WebDriver driver;
	private Launch_pf Launch_pf;
	// private LoginPage loginpage;
	// private CodeEditor_pf codeeditor;
	String browserName;
	ConfigReader config;
	CommonMethods common;
	private Datastructure_pf Datastructure_pf;
	private Login_pf Login_pf;

	public Datastructures_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.Launch_pf = new Launch_pf(passdr);
		this.Login_pf = new Login_pf(passdr);
		this.Datastructure_pf = new Datastructure_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");
		// this.common = new CommonMethods(passdr);

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("the user clicks on get started button of Data structures after logged in with user credentials")
	public void the_user_is_on_the_home_page_after_logged_in() throws IOException {

		driver.get("https://dsportalapp.herokuapp.com/");

		Launch_pf.clickgetstarted();

		Login_pf.clickSigninLink();
		Login_pf.setvalidDatafromExcel();

		Datastructure_pf.clickgetstartedDatastructures();

	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		// Assert.assertEquals(Ds.Datastructurespagetitle(), "Data
		// Structures-Introduction");

	}

	@When("The user clicks on Time Complexity link")
	public void the_user_clicks_on_time_complexity_link() {
		Datastructure_pf.clickTimecomplexityLink();
	}

	@Then("The user should be directed to Time Complexity of Data structures-Introduction")
	public void the_user_should_be_directed_to_time_complexity_of_data_structures_introduction() {
		// Assert.assertEquals(Ds.Timecomplexitytitle(), "Time Complexity");
	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		Datastructure_pf.clickTimecomplexityLink();
	}

	@When("The user clicks practice Questions")
	public void the_user_clicks_practice_questions() {
		Datastructure_pf.clickPracticeQuestionsLink();
	}

	@Then("The user should be directed to Practice Questions of Data structures-Introduction Page, again redirected to Time complexity page")
	public void the_user_should_be_directed_to_practice_questions_of_data_structures_introduction_page_again_redirected_to_time_complexity_page() {
		driver.navigate().back();
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		Datastructure_pf.clickTryhereLink();
	}

	@Then("The user should be directed the page having an try Editor with a Run button to test")
	public void the_user_should_be_directed_the_page_having_an_try_editor_with_a_run_button_to_test() {
		// Assert.assertEquals(Ds.tryeditorurl(),
		// "https://dsportalapp.herokuapp.com/tryEditor");
	}

	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
		Datastructure_pf.clickTimecomplexityLink();
		Datastructure_pf.clickTryhereLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		Datastructure_pf.clickRunButton();

	}

	@Then("The user should able to see error message in alert window")
	public void the_user_should_able_to_see_error_message_in_alert_window() {
		Datastructure_pf.closealert();
	}

	@When("The user clicks the Run button by entering the  wrong code in the Editor")
	public void the_user_clicks_the_run_button_by_entering_the_wrong_code_in_the_editor() {
		Datastructure_pf.Tryeditorboxwithinvaliddata();
		Datastructure_pf.clickRunButton();
	}

	@When("the user clicks the Run button by entering the correct python code")
	public void the_user_clicks_the_run_button_by_entering_the_correct_python_code() {
		Datastructure_pf.Tryeditorboxvaliddata();
		Datastructure_pf.clickRunButton();
	}

	@Then("the user should able to see output in the console window")
	public void the_user_should_able_to_see_output_in_the_console_window() {

	}

}