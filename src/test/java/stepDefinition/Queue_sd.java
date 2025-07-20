
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
import pageObjects.Queue_pf;
import utils.LoggerLoad;

public class Queue_sd {

	private WebDriver driver;
	private Queue_pf queuepf;
	private LoginPage loginpage;
	private CodeEditor_pf codeeditor;
	String browserName;
	// ConfigReader config;
	CommonMethods common;

	public Queue_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.queuepf = new Queue_pf(passdr);
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

	@Given("user signs into the portal using valid username and password following which navigates to the queue page")
	public void user_signs_into_the_portal_using_valid_username_and_password_following_which_navigates_to_the_queue_page() {

		loginpage.launch();
		loginpage.login();
		queuepf.queue_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation of queue in python button of queue module")
	public void user_clicks_on_implementation_of_queue_in_python_button_of_queue_module() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the Implementation of queue in python page")
	public void user_successfully_navigates_to_the_implementation_of_queue_in_python_page() {
		waitForTenSec("/implementation-lists/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/implementation-lists/", common.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in Implementation of queue in python page")
	public void user_is_in_implementation_of_queue_in_python_page() {

		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in Implementation of queue in python page")
	public void user_clicks_on_try_here_button_in_implementation_of_queue_in_python_page() {
		waitForTenSec("/implementation-lists/");
		queuepf.tryhere_queue();

		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to code editor of Implementation of queue in python page")
	public void user_successfully_navigates_to_code_editor_of_implementation_of_queue_in_python_page() { // Write code
																											// here that
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of Implementation of queue in python page")
	public void user_is_in_try_here_page_of_implementation_of_queue_in_python_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.tryhere_queue();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page without entering any code in the editor queue")
	public void user_clicks_on_run_button_in_try_here_page_without_entering_any_code_in_the_editor_q() {
		waitForTenSec("/tryEditor");
		codeeditor.run();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user does not see any alert message saying code eitor is empty queue")
	public void user_does_not_see_any_alert_message_saying_code_eitor_is_empty_q() throws IOException {

		// common.bug_screenshot("QueueEmptyCodeEditor", browserName);
		// System.out.println("No alert message seen when clicking on run without
		// entering code");
		assertEquals("Type code in the editor", codeeditor.alert_message());
		codeeditor.handle_alert();
		LoggerLoad.error(
				"There is no alert message displayed when we click on run button without entering any code in the code editor in queue module");
	}

	@Given("user is in try here page of Implementation of queue in python")
	public void user_is_in_try_here_page_of_implementation_of_queue_in_python() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.tryhere_queue();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here of queue module after entering code with error in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_code_with_error_in_the_editor_q() {

		waitForTenSec("/tryEditor");
		codeeditor.txtEditor_invalidCode();
		codeeditor.run();

		// throw new io.cucumber.java.PendingException();
	}

	@Then("user gets an alert message about the error in code queue")
	public void user_gets_an_alert_message_about_the_error_in_code_queue() {

		codeeditor.handle_alert();
		System.out.println("Alert handled successfully");

	}

	@When("user clicks on Run button in Try here of queue module after entering a correct code in the editor")
	public void user_clicks_on_the_run_button_in_try_here_page_after_entering_a_correct_code_in_the_editor_q() {
		waitForTenSec("/tryEditor");
		codeeditor.txtEditor_correctCode();
		codeeditor.run();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the output in the queue try editor console")
	public void user_is_able_to_see_output_in_the_console_q() {

		String outTxt = codeeditor.output_text();
		assertEquals("Hello World", outTxt);
		// have to add assert statement here
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in implementation of queue in python page")
	public void user_is_in_the_implementation_of_queue_in_python_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();

	}

	@When("user clicks on implementation using collections.deque link")
	public void user_clicks_on_implementation_using_collections_deque_link() {
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_collection_btn();

	}

	@Then("user sucessfully navigates to the implementation using collections.deque page")
	public void user_sucessfully_navigates_to_implementation_using_collections_deque_page() {
		waitForTenSec("/implementation-collections/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/implementation-collections/", common.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in implementation using collections.deque page")
	public void user_is_in_implementation_using_collections_deque_page() {

		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_collection_btn();

	}

	@When("user clicks on try here button in implementation using collections.deque page")
	public void user_clicks_on_try_here_button_in_implementation_using_collections_deque_page() {

		waitForTenSec("/implementation-collections/");
		queuepf.tryhere_queue();

		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of implementation using collections.deque page")
	public void user_successfully_navigates_to_the_code_editor_of_implementation_using_collections_deque_page() {

		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementation using collections.deque page")
	public void user_is_in_try_here_page_of_implementation_using_collections_deque_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_collection_btn();
		waitForTenSec("/implementation-collections/");
		queuepf.tryhere_queue();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation using array link")
	public void user_clicks_on_implementation_using_array_link() {
		waitForTenSec("/implementation-collections/");
		queuepf.implementation_array_btn();

	}

	@Then("user sucessfully navigates to the Implementation using array page")
	public void user_sucessfully_navigates_to_the_implementation_using_array_page() {
		waitForTenSec("/Implementation-array/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/Implementation-array/", common.url());

	}

	@Given("user is in Implementation using array page")
	public void user_is_in_implementation_using_array_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_collection_btn();
		waitForTenSec("/implementation-collections/");
		queuepf.implementation_array_btn();

	}

	@When("user clicks on try here button in Implementation using array page")
	public void user_clicks_on_try_here_button_in_implementation_using_array_page() {
		waitForTenSec("/Implementation-array/");
		queuepf.tryhere_queue();

	}

	@Then("user successfully navigates to the code editor of Implementation using array page")
	public void user_successfully_navigates_to_the_code_editor_of_implementation_using_array_page() {
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());

	}

	@Given("user is in try here page of Implementation using array page")
	public void user_is_in_try_here_page_of_implementation_using_array_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_array_btn();
		waitForTenSec("/Implementation-array/");
		queuepf.tryhere_queue();

	}

	@Given("user is in Implementation Using array page")
	public void user_is_in_the_implementation_using_array_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.implementation_array_btn();

	}

	@When("user clicks on queue operations link")
	public void user_clicks_on_queue_operations_link() {
		waitForTenSec("/Implementation-array/");
		queuepf.queue_operations_btn();

	}

	@Then("user sucessfully navigates to the queue operations page")
	public void user_sucessfully_navigates_to_the_queue_operations_page() {
		waitForTenSec("/QueueOp/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/QueueOp/", common.url());

	}

	@Given("user is in queue operations page")
	public void user_is_in_queue_operations_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.queue_operations_btn();

	}

	@When("user clicks on try here button in queue operations page")
	public void user_clicks_on_try_here_button_in_queue_operations_page() {
		waitForTenSec("/QueueOp/");
		queuepf.tryhere_queue();

	}

	@Then("user successfully navigates to the code editor of queue operations page")
	public void user_successfully_navigates_to_the_code_editor_of_queue_operations_page_q() {
		waitForTenSec("/tryEditor");
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", common.url());

	}

	@Given("user is in try here page of queue operations page")
	public void user_is_in_try_here_page_of_queue_operations_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.queue_operations_btn();
		waitForTenSec("/QueueOp/");
		queuepf.tryhere_queue();

	}

	@Given("user is in queue page")
	public void user_is_in_queue_page() {
		waitForTenSec("/queue/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/", common.url());

	}

	@When("user clicks on ImplementationUsingCollections.deque button")
	public void user_clicks_on_implementation_using_collections_deque_button() {
		queuepf.implementation_collection_btn();

	}

	@Then("user sucessfully navigates to the  ImplementationUsingCollections.deque page")
	public void user_sucessfully_navigates_to_the_implementation_using_collections_deque_page() {
		waitForTenSec("/implementation-collections/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/implementation-collections/", common.url());
	}

	@When("user clicks on  button implementation using array")
	public void user_clicks_on_button_implementation_using_array() {
		queuepf.implementation_array_btn();
	}

	@Then("user sucessfully navigates to the implementation using array page")
	public void user_sucessfully_navigates_to_implementation_using_array_page() {
		waitForTenSec("/Implementation-array/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/Implementation-array/", common.url());

	}

	@When("user clicks on queue operations button")
	public void user_clicks_on_queue_operations_button() {
		queuepf.queue_operations_btn();

	}

	@Then("user sucessfully navigates to the  queue operations page")
	public void user_sucessfully_navigates_to_queue_operations_page() {
		waitForTenSec("/QueueOp/");
		assertEquals("https://dsportalapp.herokuapp.com/queue/QueueOp/", common.url());

	}

	@Given("User is in operations in queue page")
	public void user_is_in_operations_in_queue_page() {
		waitForTenSec("/queue/");
		queuepf.implementation_queue_python_btn();
		waitForTenSec("/implementation-lists/");
		queuepf.queue_operations_btn();

	}

	@When("user clicks on the practice questions link in queue module")
	public void user_clicks_on_the_practice_questions_link_in_queue_module() {
		waitForTenSec("/QueueOp/");
		queuepf.practice_queue();

	}

	@Then("user sucessfully navigates to practice questions of queue module however the page is empty")
	public void user_sucessfully_navigates_to_practice_questions_of_queue_module_however_the_page_is_empty() {
		waitForTenSec("/practice");
		assertEquals("https://dsportalapp.herokuapp.com/queue/", common.url());// Failing the scenario purposefully to
		// report the bug, which is, there are
		// not any links to practice questions
		// at all im stack module
		LoggerLoad.error("There are no practice questions available in the queue module");
	}

}
