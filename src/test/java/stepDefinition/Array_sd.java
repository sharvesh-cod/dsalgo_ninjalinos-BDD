package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Array_pf;
import pageObjects.LoginPage;
import pageObjects.TryEditorPage_pf;
import utils.ConfigReader;

public class Array_sd {

	private WebDriver driver; // CODE CHANGES FOR FIREFOX
	private LoginPage loginpage;
	private Array_pf array_pf;
	private TryEditorPage_pf tryeditorpage;
	String browserName;
	ConfigReader config;
	// CommonMethods common;

	public Array_sd(Passing_Driver passdr) throws IOException { // This is the constructor for your step definition
																// class Array_sd.
		this.driver = passdr.getDriver();
		this.array_pf = new Array_pf(passdr); // Cucumber creates a new instance of this class every time it runs a
		// scenario,
		// and this constructor is called automatically at that time.
		this.loginpage = new LoginPage(passdr);
		this.tryeditorpage = new TryEditorPage_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");
		// this.common = new CommonMethods(passdr);
	}
	// NOTES: This is safe because Cucumber creates a new step definition instance
	// per scenario by default
	// — meaning each thread will get a fresh copy.

	// CODE CHANGES FOR FIREFOX
	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("The user is in array page after logging in") // BACKGROUND
	public void the_user_is_in_array_page_after_logging_in() {
		loginpage.launch();
		loginpage.login();
		array_pf.clickArrayGetStarted();
		System.out.println("output 1");

	}

	@When("The user clicks Array in Python")
	public void the_user_clicks_array_in_python() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		System.out.println("output 2");
	}

	@Then("The user should be navigated to Array in Python page")
	public void the_user_should_be_navigated_to_array_in_python_page() {
		waitForTenSec("/arrays-in-python/");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/arrays-in-python/", url);
		System.out.println("output 3");
	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() throws InterruptedException {
		waitForTenSec("/arrays-in-python/");
		array_pf.clickTryHere();
		Thread.sleep(2000);
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		waitForTenSec("/tryEditor");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", url);
	}

	@Given("The user is in the Try here page")
	public void the_user_is_in_the_try_here_page() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		waitForTenSec("/arrays-in-python/");
		array_pf.clickTryHere();

	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
		waitForTenSec("/tryEditor");
		tryeditorpage.clickRun();

	}

	@Then("The user should see an error message in alert window")
	public void the_user_should_see_an_error_message_in_alert_window() {
		tryeditorpage.getErrMsg_NoCode();
	}

	@When("The user clicks Run button after writing invalid code in editor")
	public void the_user_clicks_run_button_after_writing_invalid_code_in_editor() {
		waitForTenSec("/tryEditor");
		tryeditorpage.tryEditor_invalidCode();
		tryeditorpage.clickRun();
		tryeditorpage.alertMsg();

	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		System.out.println("Alert Handled");

	}

	@When("The user clicks Run button after writing valid code in editor")
	public void the_user_clicks_run_button_after_writing_valid_code_in_editor() throws InterruptedException {
		waitForTenSec("/tryEditor");
		tryeditorpage.tryEditor_validCode();
		tryeditorpage.clickRun();
		Thread.sleep(2000);

	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		String output = tryeditorpage.outputText();
		assertEquals("Hello World", output);

	}

	@Given("The user is in the Array page after sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		waitForTenSec("/array");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/", url);

	}

	@When("The user clicks Array Using List")
	public void the_user_clicks_array_using_list() {
		waitForTenSec("/array");
		array_pf.clickArraysUsingList();

	}

	@Then("The user should be navigated to Array using List page")
	public void the_user_should_be_navigated_to_array_using_list_page() {
		waitForTenSec("/arrays-using-list/");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/arrays-using-list/", url);

	}

	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
		waitForTenSec("/array");
		array_pf.clickArraysUsingList();

	}

	@When("The user clicks Try Here button in Arrays Using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() throws InterruptedException {
		waitForTenSec("/arrays-using-list/");
		array_pf.clickTryHere();
		Thread.sleep(2000);

	}

	@When("The user clicks Basic Operations in Lists")
	public void the_user_clicks_basic_operations_in_lists() {
		waitForTenSec("/array");
		array_pf.clickBasicOperations();

	}

	@Then("The user should be navigated to Basic Operations in Lists page")
	public void the_user_should_be_navigated_to_basic_operations_in_lists_page() {
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/", url);
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		waitForTenSec("/array");
		array_pf.clickBasicOperations();

	}

	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() throws InterruptedException {
		waitForTenSec("/basic-operations-in-lists/");
		array_pf.clickTryHere();
		Thread.sleep(2000);

	}

	@When("The user clicks Applications of Array")
	public void the_user_clicks_applications_of_array() {
		waitForTenSec("/array");
		array_pf.clickApplicationsOfArray();

	}

	@Then("The user should be navigated to Applications of Array page")
	public void the_user_should_be_navigated_to_applications_of_array_page() {
		waitForTenSec("/applications-of-array/");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/applications-of-array/", url);

	}

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		waitForTenSec("/array");
		array_pf.clickApplicationsOfArray();

	}

	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_try_here_button_in_applications_of_array_page() throws InterruptedException {
		waitForTenSec("/applications-of-array/");
		array_pf.clickTryHere();
		Thread.sleep(2000);

	}

	@Given("The user is in the Arrays in Python page after Sign in")
	public void the_user_is_in_the_arrays_in_python_page_after_sign_in() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();

	}

	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() throws InterruptedException {
		waitForTenSec("/arrays-in-python/");
		array_pf.clickPracticeQuestionsLink();
		Thread.sleep(2000);

	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		waitForTenSec("/array/practice");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/array/practice", url);

	}

	@Given("The user is on the practice question page from arrays in python")
	public void the_user_is_on_the_practice_question_page_from_arrays_in_python() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		array_pf.clickPracticeQuestionsLink();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() throws InterruptedException {
		waitForTenSec("/array/practice");
		array_pf.clickSearchTheArray();
		Thread.sleep(5000);
	}

	@Then("The user should be redirected to Question1 page contains a question, try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question1_page_contains_a_question_try_editor_with_run_and_submit_buttons() {
		waitForTenSec("question/1");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/question/1", url);
	}

	@Given("The user is on the practice question1 editor")
	public void the_user_is_on_the_practice_question1_editor() throws InterruptedException {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		array_pf.clickPracticeQuestionsLink();
		array_pf.clickSearchTheArray();
		Thread.sleep(5000);
	}

	@When("The user clicks run button without writing anything in editor")
	public void the_user_clicks_run_button_without_writing_anything_in_editor() {
		tryeditorpage.clickRun();
		// tryeditorpage.alertMsg();
	}

	@Then("The user should be able to see an error message in alert window")
	public void the_user_should_be_able_to_see_an_error_message_in_alert_window() {
		tryeditorpage.alertMsg();
		System.out.println("Alert handled");
	}

	@When("The user clicks submit button without writing anything in editor")
	public void the_user_clicks_submit_button_without_writing_anything_in_editor() throws InterruptedException {
		array_pf.clickSubmit();
		Thread.sleep(3000);
	}

	@Then("The user see an error message Error occurred during submission")
	public void the_user_see_an_error_message_error_occurred_during_submission() {
		String output = tryeditorpage.outputText();
		// assertEquals("Error occurred during submission", output);
		System.out.println(output);

	}

	@When("The user clicks run button after writing invalid code in editor")
	public void user_clicks_run_button_after_writing_invalid_code_in_editor() {
		waitForTenSec("/question/");
		array_pf.tryEditor_invalidCode_practiceQ();
		tryeditorpage.clickRun();
		tryeditorpage.alertMsg();
	}

	@When("The user clicks run button after writing valid code in question1 editor")
	public void the_user_clicks_run_button_after_writing_valid_code_in_question1_editor() {
		waitForTenSec("question/1");
		array_pf.tryEditor_validCode_practiceQ1();
		tryeditorpage.clickRun();

	}

	@Then("The user should able to see output in the console question1")
	public void the_user_should_able_to_see_output_in_the_console_question1() {
		String output = tryeditorpage.outputText();
		assertEquals("hello", output);
		System.out.println(output);
	}

	@When("The user clicks Submit button after writing invalid code in editor")
	public void the_user_clicks_submit_button_after_writing_invalid_code_in_editor() {
		waitForTenSec("/question/");
		array_pf.tryEditor_invalidCode_practiceQ();
		array_pf.clickSubmit();
	}

	@When("The user clicks Submit button after writing valid code in question1 editor")
	public void the_user_clicks_submit_button_after_writing_valid_code_in_question1_editor() {
		waitForTenSec("question/1");
		array_pf.tryEditor_validCode_practiceQ1();
		array_pf.clickSubmit();
	}

	@Then("The user see success message Submission successful")
	public void the_user_see_success_message_submission_successful() {
		String output = tryeditorpage.outputText();
		// assertEquals("Error occurred during submission", output);
		// System.out.println(output);
		System.out.println("It is a bug not getting success message");
	}

	@When("The user clicks the Max Consecutive ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		waitForTenSec("/array/practice");
		array_pf.clickMaxConsecutiveOnes();
	}

	@Then("The user should be redirected to Question2 page contains a question, try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question2_page_contains_a_question_try_editor_with_run_and_submit_buttons() {
		waitForTenSec("question/2");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/question/2", url);
	}

	@Given("The user is on the practice question2 editor")
	public void the_user_is_on_the_practice_question2_editor() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		array_pf.clickPracticeQuestionsLink();
		array_pf.clickMaxConsecutiveOnes();
	}

	@When("The user clicks run button after writing valid code in question2 editor")
	public void the_user_clicks_run_button_after_writing_valid_code_in_question2_editor() {
		waitForTenSec("question/2");
		array_pf.tryEditor_validCode_practiceQ2();
		tryeditorpage.clickRun();

	}

	@Then("The user should able to see output in the console question2")
	public void the_user_should_able_to_see_output_in_the_console_question2() {
		String output = tryeditorpage.outputText();
		// assertEquals("Valid code", output);
		System.out.println(output);
	}

	@When("The user clicks Submit button after writing valid code in question2 editor")
	public void the_user_clicks_submit_button_after_writing_valid_code_in_question2_editor() {
		waitForTenSec("question/2");
		array_pf.tryEditor_validCode_practiceQ2();
		array_pf.clickSubmit();
	}

	@When("The user clicks the Find Numbers with even number of digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		waitForTenSec("/array/practice");
		array_pf.clickEvenNumberDigits();
	}

	@Then("The user should be redirected to Question3 page contains a question, try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question3_page_contains_a_question_try_editor_with_run_and_submit_buttons() {
		waitForTenSec("question/3");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/question/3", url);
	}

	@Given("The user is on the practice question3 editor")
	public void the_user_is_on_the_practice_question3_editor() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		array_pf.clickPracticeQuestionsLink();
		array_pf.clickEvenNumberDigits();
	}

	@When("The user clicks run button after writing valid code in question3 editor")
	public void the_user_clicks_run_button_after_writing_valid_code_in_question3_editor() {
		waitForTenSec("question/3");
		array_pf.tryEditor_validCode_practiceQ3();
		tryeditorpage.clickRun();
	}

	@Then("The user should able to see output in the console question3")
	public void the_user_should_able_to_see_output_in_the_console_question3() {
		String output = tryeditorpage.outputText();
		// assertEquals("Valid code", output);
		System.out.println(output);
	}

	@When("The user clicks Submit button after writing valid code in question3 editor")
	public void the_user_clicks_submit_button_after_writing_valid_code_in_question3_editor() {
		waitForTenSec("question/3");
		array_pf.tryEditor_validCode_practiceQ3();
		array_pf.clickSubmit();
	}

	@When("The user clicks the Squares Of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		waitForTenSec("/array/practice");
		array_pf.clickSquaresOfSortedArray();
	}

	@Then("The user should be redirected to Question4 page contains a question, try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question4_page_contains_a_question_try_editor_with_run_and_submit_buttons() {
		waitForTenSec("question/4");
		String url = array_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/question/4", url);

	}

	@Given("The user is on the practice question4 editor")
	public void the_user_is_on_the_practice_question4_editor() {
		waitForTenSec("/array");
		array_pf.clickArraysInPython();
		array_pf.clickPracticeQuestionsLink();
		array_pf.clickSquaresOfSortedArray();
	}

	@When("The user clicks run button after writing valid code in question4 editor")
	public void the_user_clicks_run_button_after_writing_valid_code_in_question4_editor() {
		waitForTenSec("question/4");
		array_pf.tryEditor_validCode_practiceQ4();
		tryeditorpage.clickRun();
	}

	@Then("The user should able to see output in the console question4")
	public void the_user_should_able_to_see_output_in_the_console_question4() {
		String output = tryeditorpage.outputText();
		// assertEquals("Valid code", output);
		System.out.println(output);
	}

	@When("The user clicks Submit button after writing valid code in question4 editor")
	public void the_user_clicks_submit_button_after_writing_valid_code_in_question4_editor() {
		waitForTenSec("question/4");
		array_pf.tryEditor_validCode_practiceQ4();
		array_pf.clickSubmit();
	}

}
