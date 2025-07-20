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
import pageObjects.CodeEditor_pf;
import pageObjects.CommonMethods;
import pageObjects.LoginPage;
import pageObjects.Stack_pf;
import utils.LoggerLoad;

public class Stack_sd {
	private WebDriver driver;
	private Stack_pf stackpf;
	private LoginPage loginpage;
	private CodeEditor_pf codeeditor;
	String browserName;
	// ConfigReader config;
	CommonMethods common;

	public Stack_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.stackpf = new Stack_pf(passdr);
		this.loginpage = new LoginPage(passdr);
		this.codeeditor = new CodeEditor_pf(passdr);
		// this.config = new ConfigReader();
		// this.browserName = config.get_prop_value("browser");
		this.common = new CommonMethods(passdr);

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}
//	private void waitForExactUrl(String expectedUrl) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlToBe(expectedUrl));
//	}

	@Given("user signs into the portal using valid username and password following which navigates to the stack page")
	public void user_signs_into_the_portal_using_valid_username_and_password_following_which_navigates_to_the_stack_page() {

		loginpage.launch();
		loginpage.login();
		stackpf.stack_btn();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on operations in stack button of Stack module")
	public void user_clicks_on_operations_in_stack_button_of_stack_module() {
		waitForTenSec("/stack");
		// waitForExactUrl("https://dsportalapp.herokuapp.com/stack/");
		// stackpf.refreshElements();
		stackpf.opreations_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the operations in stack page")
	public void user_successfully_navigates_to_the_operations_in_stack_page() {
		waitForTenSec("/operations-in-stack/");
		// waitForExactUrl("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		assertEquals("https://dsportalapp.herokuapp.com/stack/operations-in-stack/", common.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in operations in stack page")
	public void user_is_in_operations_in_stack_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in operations in stack page")
	public void user_clicks_on_try_here_button_in_operations_in_stack_page() {
		waitForTenSec("/operations-in-stack/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to code editor of the operations in stack page")
	public void user_successfully_navigates_to_code_editor_of_the_operations_in_stack_page() {
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of operations in stack page")
	public void user_is_in_try_here_page_of_operations_in_stack_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();
		waitForTenSec("/operations-in-stack/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page without entering any code in the editor")
	public void user_clicks_on_run_button_in_try_here_page_without_entering_any_code_in_the_editor() {
		waitForTenSec("/tryEditor");
		codeeditor.run();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user does not see any alert message saying code eitor is empty")
	public void user_does_not_see_any_alert_message_saying_code_eitor_is_empty() throws IOException {
		// common.bug_screenshot("StackEmptyCodeEditor", browserName);
		// System.out.println("No alert message seen when clicking on run without
		// entering code");// will later have code
		// here to take a
		// screenshot
		assertEquals("Type code in the editor", codeeditor.alert_message());
		codeeditor.handle_alert();
		LoggerLoad.error(
				"There is no alert message displayed when we click on run button without entering any code in the code editor in stack module");
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page after entering a code with error in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_code_with_error_in_the_editor() {
		waitForTenSec("/tryEditor");
		codeeditor.txtEditor_invalidCode();
		codeeditor.run();
//		codeeditor.handle_alert();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user gets an alert message about the error in code")
	public void user_gets_an_alert_message_about_the_error_in_code() {

		codeeditor.handle_alert();
		System.out.println("Alert handled successfully");

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page after entering a correct code in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_correct_code_in_the_editor() {
		waitForTenSec("/tryEditor");
		codeeditor.txtEditor_correctCode();
		codeeditor.run();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		// have to include assert statement here
		String outTxt = codeeditor.output_text();
		assertEquals("Hello World", outTxt);

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation link")
	public void user_clicks_on_implementation_link() {
		waitForTenSec("/operations-in-stack/");
		stackpf.implementation_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Implementation page")
	public void user_sucessfully_navigates_to_the_implementation_page() {
		waitForTenSec("/implementation/");
		assertEquals("https://dsportalapp.herokuapp.com/stack/implementation/", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in implementation page")
	public void user_is_in_implementation_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();
		waitForTenSec("/operations-in-stack/");
		stackpf.implementation_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in implementation page")
	public void user_clicks_on_try_here_button_in_implementation_page() {

		waitForTenSec("/implementation/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of implementation page")
	public void user_successfully_navigates_to_the_code_editor_of_implementation_page() {
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementation page")
	public void user_is_in_try_here_page_of_implementation_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();
		waitForTenSec("/operations-in-stack/");
		stackpf.implementation_stack_btn();
		waitForTenSec("/implementation");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementaiton page")
	public void user_is_in_try_here_page_of_implementaiton_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();
		waitForTenSec("/operations-in-stack/");
		stackpf.implementation_stack_btn();
		waitForTenSec("/implementation");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on application link")
	public void user_clicks_on_application_link() {
		waitForTenSec("/implementation");
		stackpf.application_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the applicaiton page")
	public void user_sucessfully_navigates_to_the_applicaiton_page() {
		waitForTenSec("/stack-applications/");
		assertEquals("https://dsportalapp.herokuapp.com/stack/stack-applications/", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in applicaiton page")
	public void user_is_in_applicaiton_page() {
		waitForTenSec("/stack");
		stackpf.opreations_stack_btn();
		waitForTenSec("/operations-in-stack/");
		stackpf.application_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in application page")
	public void user_clicks_on_try_here_button_in_application_page() {
		waitForTenSec("/stack-applications/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of application page")
	public void user_successfully_navigates_to_the_code_editor_of_application_page() {
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of applicaiton page")
	public void user_is_in_try_here_page_of_applicaiton_page() {
		waitForTenSec("/stack");
		stackpf.application_stack_btn();
		waitForTenSec("/stack-applications/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of application page")
	public void user_is_in_try_here_page_of_application_page() {
		waitForTenSec("/stack");
		stackpf.application_stack_btn();
		waitForTenSec("/stack-applications/");
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in stack page")
	public void user_is_in_stack_page() {
		waitForTenSec("/stack");
		assertEquals("https://dsportalapp.herokuapp.com/stack/", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation button")
	public void user_clicks_on_implementation_button() {
		waitForTenSec("/stack");
		stackpf.implementation_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the  Implementation page")
	public void user_sucessfully_navigates_to_implementation_page() {
		waitForTenSec("/implementation");
		assertEquals("https://dsportalapp.herokuapp.com/stack/implementation/", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Application button")
	public void user_clicks_on_application_button() {
		waitForTenSec("/stack");
		stackpf.application_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Application page")
	public void user_sucessfully_navigates_to_the_application_page() {
		waitForTenSec("/stack-applications/");
		assertEquals("https://dsportalapp.herokuapp.com/stack/stack-applications/", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in the application page")
	public void user_is_in_the_application_page() {
		waitForTenSec("/stack");
		stackpf.application_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the practice questions link in stack module")
	public void user_clicks_on_the_practice_questions_link_in_stack_module() {
		waitForTenSec("/stack-applications/");
		stackpf.practice_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to practice questions of stack module however the page is empty")
	public void user_sucessfully_navigates_to_practice_questions_of_stack_module_however_the_page_is_empty()
			throws IOException {
		waitForTenSec("/practice");
		assertEquals("https://dsportalapp.herokuapp.com/stack/", common.url());// Failing the scenario purposefully to
																				// report the bug, which is, there are
																				// not any links to practice questions
																				// at all im stack module
		LoggerLoad.error("There are no practice questions available in the stack module");
		// common.bug_screenshot("StackPracticeQuestions", browserName);
		// throw new io.cucumber.java.PendingException();
	}

}
