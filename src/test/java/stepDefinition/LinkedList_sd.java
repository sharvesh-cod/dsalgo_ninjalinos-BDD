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
import pageObjects.LinkedListPage_pf;
//import pageObjects.LoginPage_ArrayAndLinkedLists;
import utils.ConfigReader;
import utils.LoggerLoad;

public class LinkedList_sd {

	private WebDriver driver; // CODE CHANGES FOR FIREFOX
	// private LoginPage_ArrayAndLinkedLists loginpage;
	private LinkedListPage_pf ll_pf;
	private CodeEditor_pf tryeditorpage;
	String browserName;
	ConfigReader config;
	// CommonMethods common;
	LoggerLoad log;

	public LinkedList_sd(Passing_Driver passdr) throws IOException { // This is the constructor for your step definition
																		// class Array_sd.
		this.driver = passdr.getDriver();
		this.ll_pf = new LinkedListPage_pf(passdr); // Cucumber creates a new instance of this class every time it runs
													// a
		// this.loginpage = new LoginPage_ArrayAndLinkedLists(passdr);
		this.tryeditorpage = new CodeEditor_pf(passdr);
		this.config = new ConfigReader();
		this.browserName = config.get_prop_value("browser");
		// this.common = new CommonMethods(passdr);
		this.log = new LoggerLoad();
	}

	// CODE CHANGES FOR FIREFOX
	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("The user is in linked list page after logging in") // BACKGROUND
	public void the_user_is_in_linked_list_page_after_logging_in() throws IOException, InterruptedException {
//		loginpage.launch();
//		loginpage.signin_btn();
//		loginpage.user_name();
//		loginpage.password();
//		loginpage.login_btn();
		ll_pf.background_linkedList();
		ll_pf.clickllGetStarted();
	}

	@Given("The user is in the Linked list page after Sign in")
	public void user_is_in_the_linked_list_page_after_sign_in() {
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/", url);
	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickIntroduction();
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
		waitForTenSec("/linked-list/introduction/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/introduction/", url);

	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickIntroduction();

	}

	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		waitForTenSec("/linked-list/introduction/");
		ll_pf.clickTryHere_LL();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in LL")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_ll() {
		waitForTenSec("/tryEditor");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", url);
	}

	@Given("The user is in the tryEditor page in LL Introduction")
	public void the_user_is_in_the_try_editor_page_in_ll_introduction() {
		waitForTenSec("/linked-list/");
		ll_pf.clickIntroduction();
		waitForTenSec("/linked-list/introduction/");
		ll_pf.clickTryHere_LL();
	}

	@When("The user clicks the Run button without entering the code in the Editor in LL")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_ll() {
		waitForTenSec("/tryEditor");
		tryeditorpage.clickRun();
	}

	@Then("The user should see an error message in alert window for no code in LL")
	public void the_user_should_see_an_error_message_in_alert_window_for_no_code_in_ll() {
		tryeditorpage.getErrMsg_NoCode();
		log.error(
				"There is no alert message displayed when we click on run button without entering any code in the code editor in linked list module");
		// tryeditorpage.alertMsg();
		String errorMsg = tryeditorpage.alertMsg();
		assertEquals("Enter code", errorMsg);
	}

	@When("The user clicks run button after writing invalid code in editor in LL")
	public void the_user_clicks_run_button_after_writing_invalid_code_in_editor_in_ll() throws IOException {
		waitForTenSec("/tryEditor");
		tryeditorpage.tryEditor_invalidCode();
		tryeditorpage.clickRun();
		tryeditorpage.alertMsg();
	}

	@Then("The user should be able to see an error message in alert window in LL")
	public void the_user_should_be_able_to_see_an_error_message_in_alert_window_in_ll() {
		System.out.println("Alert Handled");
	}

	@When("The user clicks run button after writing valid code in editor in LL")
	public void the_user_clicks_run_button_after_writing_valid_code_in_editor_in_ll()
			throws InterruptedException, IOException {
		waitForTenSec("/tryEditor");
		tryeditorpage.tryEditor_validCode();
		tryeditorpage.clickRun();
		Thread.sleep(2000);
	}

	@Then("The user should see output in the console in LL")
	public void the_user_should_see_output_in_the_console_in_ll() {
		String output = tryeditorpage.output_text();
		assertEquals("Hello World", output);
	}

	@Given("The user is in the Linked list page after Sign In")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		waitForTenSec("/linked-list/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/", url);
	}

	@When("The user clicks Creating Linked List button")
	public void the_user_clicks_creating_linked_list_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickCreatingLinkedList();
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		waitForTenSec("/creating-linked-list/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/", url);
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickCreatingLinkedList();
	}

	@When("The user clicks Try Here button in Creating Linked List page")
	public void the_user_clicks_try_here_button_in_creating_linked_list_page() {
		waitForTenSec("/creating-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Creating Linked List page")
	public void the_user_is_in_the_try_editor_page_in_ll_via_creating_linked_list_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickCreatingLinkedList();
		waitForTenSec("/creating-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@When("The user clicks Types Of Linked List button")
	public void the_user_clicks_types_of_linked_list_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTypesOfLinkedList();
	}

	@Then("The user should be redirected to Types Of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/", url);
	}

	@Given("The user is on the Types Of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTypesOfLinkedList();
	}

	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
		waitForTenSec("/types-of-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Types Of Linked List page")
	public void the_user_is_in_the_try_editor_page_in_ll_via_types_of_linked_list_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTypesOfLinkedList();
		waitForTenSec("/types-of-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@When("The user clicks Implement Linked List in Python button")
	public void the_user_clicks_implement_linked_list_in_python_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickImplementLinkedListInPython();
	}

	@Then("The user should be redirected to Implement Linked List in Python page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		waitForTenSec("/implement-linked-list-in-python/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/", url);
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickImplementLinkedListInPython();
	}

	@When("The user clicks Try Here button in Implement Linked List in Python page")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
		waitForTenSec("/implement-linked-list-in-python/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Implement Page")
	public void the_user_is_in_the_try_editor_page_in_ll_via_implement_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickImplementLinkedListInPython();
		waitForTenSec("/implement-linked-list-in-python/");
		ll_pf.clickTryHere_LL();
	}

	@When("TThe user clicks the Run button without entering the code in the Editor in LL")
	public void t_the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_ll() {
		waitForTenSec("/tryEditor");
		tryeditorpage.clickRun();
	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_traversal_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTraversal();
	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() {
		waitForTenSec("/traversal/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/traversal/", url);

	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTraversal();
	}

	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_try_here_button_in_traversal_page() {
		waitForTenSec("/traversal/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Traversal")
	public void the_user_is_in_the_try_editor_page_in_ll_via_traversal() {
		waitForTenSec("/linked-list/");
		ll_pf.clickTraversal();
		waitForTenSec("/traversal/");
		ll_pf.clickTryHere_LL();
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_insertion_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickInsertion();

	}

	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_insertion_page() {
		waitForTenSec("/insertion-in-linked-list/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/", url);

	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickInsertion();
	}

	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_try_here_button_in_insertion_page() {
		waitForTenSec("/insertion-in-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Insertion")
	public void the_user_is_in_the_try_editor_page_in_ll_via_insertion() {
		waitForTenSec("/linked-list/");
		ll_pf.clickInsertion();
		waitForTenSec("/insertion-in-linked-list/");
		ll_pf.clickTryHere_LL();

	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_deletion_button() {
		waitForTenSec("/linked-list/");
		ll_pf.clickDeletion();
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {
		waitForTenSec("/deletion-in-linked-list/");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/", url);

	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickDeletion();
	}

	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_try_here_button_in_deletion_page() {
		waitForTenSec("/deletion-in-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the tryEditor page in LL via Deletion")
	public void the_user_is_in_the_try_editor_page_in_ll_via_deletion() {
		waitForTenSec("/linked-list/");
		ll_pf.clickDeletion();
		waitForTenSec("/deletion-in-linked-list/");
		ll_pf.clickTryHere_LL();
	}

	@Given("The user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
		waitForTenSec("/linked-list/");
		ll_pf.clickDeletion();
	}

	@When("User clicks on practice questions button")
	public void user_clicks_on_practice_questions_button() {
		waitForTenSec("/deletion-in-linked-list/");
		ll_pf.clickPracticeQuestionsLink_LL();
	}

	@Then("The user should be redirected to practice questions page of linked lists")
	public void the_user_should_be_redirected_to_practice_questions_page_of_linked_lists() {
		waitForTenSec("/linked-list/practice");
		String url = ll_pf.getURL();
		assertEquals("https://dsportalapp.herokuapp.com/linked-list/", url);
		log.error("There are no practice questions available in the linked List module");
	}

}
