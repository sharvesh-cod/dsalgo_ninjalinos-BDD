package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CodeEditor_pf;
import pageObjects.LoginPage;
import pageObjects.Stack_pf;

public class Stack_sd {
	private WebDriver driver;
	private Stack_pf stackpf;
	private LoginPage loginpage;
	private CodeEditor_pf codeeditor;
	String browser;

	public Stack_sd(Passing_Driver passdr) throws IOException {
//		this.browser = obj.return_browser();
//		this.driver = obj.initBrowser(browser);
		this.driver = passdr.getDriver();
		this.stackpf = new Stack_pf(passdr);
		this.loginpage = new LoginPage(passdr);
		this.codeeditor = new CodeEditor_pf(passdr);
	}

	@Given("user signs into the portal using valid username and password following which navigates to the stack page")
	public void user_signs_into_the_portal_using_valid_username_and_password_following_which_navigates_to_the_stack_page() {

		loginpage.launch();
		loginpage.login();
		stackpf.stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on operations in stack button of Stack module")
	public void user_clicks_on_operations_in_stack_button_of_stack_module() {

		stackpf.opreations_stack_btn();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the operations in stack page")
	public void user_successfully_navigates_to_the_operations_in_stack_page() {

		assertEquals("https://dsportalapp.herokuapp.com/stack/operations-in-stack/", stackpf.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in operations in stack page")
	public void user_is_in_operations_in_stack_page() {

		stackpf.opreations_stack_btn();

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in operations in stack page")
	public void user_clicks_on_try_here_button_in_operations_in_stack_page() {
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to code editor of the operations in stack page")
	public void user_successfully_navigates_to_code_editor_of_the_operations_in_stack_page() {
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", stackpf.url());

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of operations in stack page")
	public void user_is_in_try_here_page_of_operations_in_stack_page() {
		stackpf.opreations_stack_btn();
		stackpf.tryhere_stack();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page without entering any code in the editor")
	public void user_clicks_on_run_button_in_try_here_page_without_entering_any_code_in_the_editor() {
		codeeditor.run();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user does not see any alert message saying code eitor is empty")
	public void user_does_not_see_any_alert_message_saying_code_eitor_is_empty() {
		System.out.println("No alert message seen when clicking on run without entering code");// will later have code
																								// here to take a
																								// screenshot
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page after entering a code with error in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_code_with_error_in_the_editor() {
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
		codeeditor.txtEditor_correctCode();
		codeeditor.run();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		// can add code for screenshot later
		codeeditor.output();
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation link")
	public void user_clicks_on_implementation_link() {
		stackpf.implementation_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Implementation page")
	public void user_sucessfully_navigates_to_the_implementation_page() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/implementation/", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in implementation page")
	public void user_is_in_implementation_page() {
		stackpf.opreations_stack_btn();
		stackpf.implementation_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in implementation page")
	public void user_clicks_on_try_here_button_in_implementation_page() {
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of implementation page")
	public void user_successfully_navigates_to_the_code_editor_of_implementation_page() {
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementation page")
	public void user_is_in_try_here_page_of_implementation_page() {
		stackpf.opreations_stack_btn();
		stackpf.implementation_stack_btn();
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementaiton page")
	public void user_is_in_try_here_page_of_implementaiton_page() {
		stackpf.opreations_stack_btn();
		stackpf.implementation_stack_btn();
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on application link")
	public void user_clicks_on_application_link() {
		stackpf.application_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the applicaiton page")
	public void user_sucessfully_navigates_to_the_applicaiton_page() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/stack-applications/", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in applicaiton page")
	public void user_is_in_applicaiton_page() {
		stackpf.opreations_stack_btn();
		stackpf.application_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in application page")
	public void user_clicks_on_try_here_button_in_application_page() {
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of application page")
	public void user_successfully_navigates_to_the_code_editor_of_application_page() {
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of applicaiton page")
	public void user_is_in_try_here_page_of_applicaiton_page() {
		stackpf.application_stack_btn();
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of application page")
	public void user_is_in_try_here_page_of_application_page() {
		stackpf.application_stack_btn();
		stackpf.tryhere_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in stack page")
	public void user_is_in_stack_page() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation button")
	public void user_clicks_on_implementation_button() {
		stackpf.implementation_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the  Implementation page")
	public void user_sucessfully_navigates_to_implementation_page() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/implementation/", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Application button")
	public void user_clicks_on_application_button() {
		stackpf.application_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Application page")
	public void user_sucessfully_navigates_to_the_application_page() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/stack-applications/", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is in the application page")
	public void user_is_in_the_application_page() {
		stackpf.application_stack_btn();
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the practice questions link in stack module")
	public void user_clicks_on_the_practice_questions_link_in_stack_module() {
		stackpf.practice_stack();
		throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to practice questions of stack module however the page is empty")
	public void user_sucessfully_navigates_to_practice_questions_of_stack_module_however_the_page_is_empty() {
		assertEquals("https://dsportalapp.herokuapp.com/stack/practice", stackpf.url());
		throw new io.cucumber.java.PendingException();
	}

}
