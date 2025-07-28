package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Datastructure_pf;
import pageObjects.Launch_pf;
import pageObjects.Login_pf;
import utils.ConfigReader;
import utils.LoggerLoad;

public class Datastructures_sd {

	private WebDriver driver;
	private Launch_pf Launch_pf;
	String browserName;
	ConfigReader config;

	private Datastructure_pf Datastructure_pf;
	private Login_pf Login_pf;
	LoggerLoad log;

	public Datastructures_sd(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.Launch_pf = new Launch_pf(passdr);
		this.Login_pf = new Login_pf(passdr);
		this.Datastructure_pf = new Datastructure_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");

		this.log = new LoggerLoad();
	}

	@Given("the user is on the homepage after loggedin with valid data")
	public void the_user_is_on_the_homepage_after_loggedin_with_valid_data() throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/");
		Launch_pf.clickgetstarted();
		Login_pf.clickSigninLink();
		Login_pf.setvalidDatafromExcel();

	}

	@Given("The user is in the Data Structures page after clicking on Get started button of DataStructures")
	public void the_user_is_in_the_data_structures_page_after_clicking_on_get_started_button_of_data_structures() {
		Datastructure_pf.clickgetstartedDatastructures();
	}

	@When("The user clicks on Time Complexity link")
	public void the_user_clicks_on_time_complexity_link() {
		Datastructure_pf.clickTimecomplexityLink();
	}

	@Then("The user should be directed to {string} of Data structures-Introduction")
	public void the_user_should_be_directed_to_of_data_structures_introduction(String exptitle) {
		String acttitle = Datastructure_pf.timecomplexitytitle();
		Assert.assertEquals(acttitle, exptitle);
	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		Datastructure_pf.clickgetstartedDatastructures();
		Datastructure_pf.clickTimecomplexityLink();
	}

	@When("The user clicks practice Questions")
	public void the_user_clicks_practice_questions() {
		Datastructure_pf.clickPracticeQuestionsLink();
	}

	@Then("The user should be directed to Practice Questions of Data structures-Introduction Page, again redirected to Time complexity page")
	public void the_user_should_be_directed_to_practice_questions_of_data_structures_introduction_page_again_redirected_to_time_complexity_page() {
		String acturl = Datastructure_pf.practiceQueURl();
		log.error("There are no practice questions available in the Datastructure module");
		Assert.assertEquals(acturl, "https://dsportalapp.herokuapp.com/data-structures-introduction/practic",
				"user is not able to see practice questions, the page is empty");
	}

	@When("the user clicks Try here button")
	public void the_user_clicks_try_here_button() {
		Datastructure_pf.clickTryhereLink();
	}

	@Then("The user should be directed the page having an try Editor with a Run button to test")
	public void the_user_should_be_directed_the_page_having_an_try_editor_with_a_run_button_to_test() {
		String acturl = Datastructure_pf.tryeditorurl();
		Assert.assertEquals(acturl, "https://dsportalapp.herokuapp.com/tryEditor");
	}

	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
		Datastructure_pf.clickgetstartedDatastructures();
		Datastructure_pf.clickTimecomplexityLink();
		Datastructure_pf.clickTryhereLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		Datastructure_pf.clickRunButton();
		String actcode = Datastructure_pf.consoletxt();
		String expcode = "please enter the code";
		log.error("user is should able to see error message 'Please enter the code'");
		Assert.assertEquals(actcode, expcode, "user is should able to see error message 'Please enter the code'");

	}

	@When("The user clicks the Run button by entering the  wrong code in the Editor")
	public void the_user_clicks_the_run_button_by_entering_the_wrong_code_in_the_editor() throws IOException {
		Datastructure_pf.setinvalidcodefromExcel();
		Datastructure_pf.clickRunButton();
	}

	@Then("The user should able to see error message {string}")
	public void the_user_should_able_to_see_error_message(String experrormsg) {
		String actmsg = Datastructure_pf.alert_message();
		String expmsg = Datastructure_pf.alertconfim();
		log.error("There are no alert msg displayed in the page saying 'Please enter the code'");
		Assert.assertEquals(actmsg, expmsg, "alert msg is not displayed");
		Datastructure_pf.closealert();
	}

	@Then("The user should able to see alert popup")
	public void the_user_should_able_to_see_alert_popup() {
		String actmsg = Datastructure_pf.alert_message();
		String expmsg = Datastructure_pf.alertconfim();
		Assert.assertEquals(actmsg, expmsg, "alert msg is not displayed");
		Datastructure_pf.closealert();
		System.out.println("Alert handled successfully");

	}

	@When("the user clicks the Run button by entering the correct python code")
	public void the_user_clicks_the_run_button_by_entering_the_correct_python_code() throws IOException {
		Datastructure_pf.setvalidcodefromExcel();
		Datastructure_pf.clickRunButton();
	}

	@Then("the user should able to see output in the console window")
	public void the_user_should_able_to_see_output_in_the_console_window() {
		String actcode = Datastructure_pf.consoletxt();
		String expcode = Datastructure_pf.consoletxt();
		Assert.assertEquals(actcode, expcode, "user is not able to see the output in console");
	}

}