package stepDefinitionTree;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethods;
import pageObjects.Tree_pf;

public class Tree_sd {

	Tree_pf tf;

	@Given("the user is in Tree page after logged in")
	public void the_user_is_in_tree_page_after_logged_in() throws InterruptedException {
		tf = new Tree_pf();
		tf.background_getToTree();

	}

	@When("The user scroll down the page")
	public void the_user_scroll_down_the_page() {
		tf.scrollDownTree();
	}

	@Then("User should view all the links available in page")
	public void user_should_view_all_the_links_available_in_page() {
		tf.verifyLinks();
	}

	@When("user clicks on overview button of Tree module")
	public void user_clicks_on_overview_button_of_tree_module() {
		tf.click_Overview();

	}

	@Then("user successfully navigates to the Overview of Tree page")
	public void user_successfully_navigates_to_the_overview_of_tree_page() {

		String actualUrl = tf.navigate_OverviewofTree();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/overview-of-trees/";
		Assert.assertEquals(actualUrl, expectedUrl, "Successfully, You are landed in overview page");
	}

	@Given("The user in the overview page of tree module")
	public void the_user_in_the_overview_page_of_tree_module() {
		tf.click_Overview();

	}

	@When("user clicks on try here button in Overview of Tree page")
	public void user_clicks_on_try_here_button_in_overview_of_tree_page() {
		tf.click_TryEditor();
	}

	@Then("user successfully navigates to code editor of the Overview of Tree page")
	public void user_successfully_navigates_to_code_editor_of_the_overview_of_tree_page() {
		CommonMethods cm = new CommonMethods();
		cm.VerifyTryEditorUrl();
	}

	@Given("The user in tryEditor page")
	public void the_user_in_try_editor_page() {

		tf.click_Overview();
		tf.click_TryEditor();

	}

	@When("The user clicks Run without entering code")
	public void the_user_clicks_run_without_entering_code() {

		tf.clickRun_WithOutCode();

	}

	@Then("An alert message should appear")
	public void an_alert_message_should_appear() {
		tf.getErrMsg_NoCode();
	}

	@When("The user clicks Run after entering valid code")
	public void the_user_clicks_run_after_entering_valid_code() {

		tf.txtEditor_correctCode();
		tf.clickRun_WithOutCode();
	}

	@Then("The output should be displayed in the console")
	public void the_output_should_be_displayed_in_the_console() {

		String output = tf.outputText();

		Assert.assertEquals(output, "Hello World", "output successfully is matched");

	}

	@When("The user clicks run after entering invalid code")
	public void the_user_clicks_run_after_entering_invalid_code() {
		tf.txtEditor_invalidCode();
		tf.clickRun_WithOutCode();
	}

	@Given("The user in Tree Home Page")
	public void TreeHomePage() throws InterruptedException {
		// tf.background_getToTree();
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		// tf.click_Terminilogy();

	}

	@Then("The user should be navigated to the Terminologies page")
	public void the_user_should_be_navigated_to_the_terminologies_page() {
		// tf.navigate_To_Terminilogy();

	}

	@When("The user clicks Try here in Terminologies")
	public void the_user_clicks_try_here_in_terminologies() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Run after entering invalid code")
	public void the_user_clicks_run_after_entering_invalidcode() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Types of Tree link")
	public void the_user_clicks_types_of_tree_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Types of Tree page")
	public void the_user_should_be_navigated_to_the_types_of_tree_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try here in Types of Tree")
	public void the_user_clicks_try_here_in_types_of_tree() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Tree Traversals page")
	public void the_user_should_be_navigated_to_the_tree_traversals_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try here in Tree Traversals")
	public void the_user_clicks_try_here_in_tree_traversals() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user enters valid Python code, clicks Run")
	public void the_user_enters_valid_python_code_clicks_run() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user enters invalid Python code and clicks Run")
	public void the_user_enters_invalid_python_code_and_clicks_run() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user enters valid Python code and clicks Run")
	public void the_user_enters_valid_python_code_and_clicks_run() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Binary Trees page")
	public void the_user_should_be_navigated_to_the_binary_trees_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Types of Binary Tree link")
	public void the_user_clicks_types_of_binary_tree_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Types of Binary Tree page")
	public void the_user_should_be_navigated_to_the_types_of_binary_tree_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Implementation of Python link")
	public void the_user_clicks_implementation_of_python_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Implementation of Python page")
	public void the_user_should_be_navigated_to_the_implementation_of_python_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Binary Tree Traversals page")
	public void the_user_should_be_navigated_to_the_binary_tree_traversals_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Applications of Binary Trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Applications of Binary Trees  page")
	public void the_user_should_be_navigated_to_the_applications_of_binary_trees_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try here in Applications of Binary Trees")
	public void the_user_clicks_try_here_in_applications_of_binary_trees() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Search link")
	public void the_user_clicks_binary_search_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Binary Search page")
	public void the_user_should_be_navigated_to_the_binary_search_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try here in Binary Search")
	public void the_user_clicks_try_here_in_binary_search() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Implementation of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Implementation of BST page")
	public void the_user_should_be_navigated_to_the_implementation_of_bst_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try here in Implementation of BST")
	public void the_user_clicks_try_here_in_implementation_of_bst() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to the Practice Questions page")
	public void the_user_should_be_navigated_to_the_practice_questions_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see the practice questions")
	public void the_user_should_see_the_practice_questions() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
