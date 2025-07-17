package stepDefinitionTree;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethods;
import pageObjects.Tree_pf;

public class Tree_sd {

	CommonMethods cm = new CommonMethods();
	Tree_pf tf = new Tree_pf();

	@Given("the user is in Tree page after logged in")
	public void the_user_is_in_tree_page_after_logged_in() throws InterruptedException {

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
	public void user_successfully_navigates_to_code_editor_of_the_overview_of_tree_page() throws IOException {
		cm.getCurrentUrl();
	}

	@Given("The user in tryEditor page")
	public void the_user_in_try_editor_page() {

		tf.click_Overview();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page of Types of Tree")
	public void the_user_in_try_editor_page_TypesOfT() throws InterruptedException {

		tf.typesOfTrees();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page of Terminologies")
	public void the_user_in_try_editor_page_Term() {

		tf.click_Terminilogy();
		tf.click_TryEditor();

	}

	@When("The user clicks Run without entering code")
	public void the_user_clicks_run_without_entering_code() {

		tf.clickRun_WithOutCode();

	}

	@When("The user clicks Run without entering code TTT")
	public void the_user_clicks_run_without_entering_code_ttt() throws InterruptedException {

		tf.typesOfTrees();
		tf.click_TryEditor();
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

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		tf.click_Terminilogy();

	}

	@Then("The user should be navigated to the Terminologies page")
	public void the_user_should_be_navigated_to_the_terminologies_page() {
		tf.navigate_To_Terminilogy();

	}

	@When("The user clicks Try here in Terminologies")
	public void the_user_clicks_try_here_in_terminologies() {
		tf.click_Terminilogy();
		tf.click_TryEditor();

	}

	@Then("The user should be navigated to the text editor")
	public void the_user_should_be_navigated_to_the_text_editor() throws IOException {
		cm.getCurrentUrl();

	}

	@When("The user clicks Run after entering invalid code")
	public void the_user_clicks_run_after_entering_invalidcode() {
		tf.txtEditor_invalidCode();
		tf.clickRun_WithOutCode();

	}

	@When("The user clicks Types of Tree link")
	public void the_user_clicks_types_of_tree_link() throws InterruptedException {
		tf.typesOfTrees();

	}

	@Then("The user should be navigated to the Types of Tree page")
	public void the_user_should_be_navigated_to_the_types_of_tree_page() {
		String typesOfTreesurl = tf.navigation_typeOfTrees();
		System.out.println("user logged into " + typesOfTreesurl);

	}

	@When("The user clicks Try here in Types of Tree")
	public void the_user_clicks_try_here_in_types_of_tree() throws InterruptedException {
		tf.typesOfTrees();
		tf.click_TryEditor();

	}

	/*************************************************************************************************************/

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		tf.tree_Trav();

	}

	@Then("The user should be navigated to the Tree Traversals page")
	public void the_user_should_be_navigated_to_the_tree_traversals_page() {

		String navigation_treeTrav = tf.navigation_treeTrav();
		System.out.println("Navigated to :" + navigation_treeTrav);

	}

	@When("The user clicks Try here in Tree Traversals")
	public void the_user_clicks_try_here_in_tree_traversals() {
		tf.tree_Trav();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page of Tree Traversals")
	public void the_user_on_try_editor_page_of_tree_traversals() {
		tf.tree_Trav();
		tf.click_TryEditor();

	}

	@When("The user enters valid Python code, clicks Run")
	public void the_user_enters_valid_python_code_clicks_run() {
		tf.txtEditor_correctCode();
		tf.clickRun_WithOutCode();

	}

	@When("The user enters invalid Python code and clicks Run")
	public void the_user_enters_invalid_python_code_and_clicks_run() {
		tf.txtEditor_invalidCode();
		tf.clickRun_WithOutCode();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		tf.Traversal_Illustra();
	}

	@When("The user enters valid Python code and clicks Run")
	public void the_user_enters_valid_python_code_and_clicks_run() {
		tf.txtEditor_correctCode();
		tf.clickRun_WithOutCode();

	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		tf.binary_Tree();

	}

	@Then("The user should be navigated to the Binary Trees page")
	public void the_user_should_be_navigated_to_the_binary_trees_page() {

		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Types of Binary Tree link")
	public void the_user_clicks_types_of_binary_tree_link() {

		tf.types_ofBinary();
	}

	@Then("The user should be navigated to the Types of Binary Tree page")
	public void the_user_should_be_navigated_to_the_types_of_binary_tree_page() {
		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Implementation of Python link")
	public void the_user_clicks_implementation_of_python_link() {

		tf.Impl_in_Python();
	}

	@Then("The user should be navigated to the Implementation of Python page")
	public void the_user_should_be_navigated_to_the_implementation_of_python_page() {
		System.out.println(cm.getCurrentUrl());

	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		tf.binary_Tree();

	}

	@Then("The user should be navigated to the Binary Tree Traversals page")
	public void the_user_should_be_navigated_to_the_binary_tree_traversals_page() {
		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Applications of Binary Trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		tf.app_of_binaryTrees();

	}

	@Then("The user should be navigated to the Applications of Binary Trees  page")
	public void the_user_should_be_navigated_to_the_applications_of_binary_trees_page() {
		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Try here in Applications of Binary Trees")
	public void the_user_clicks_try_here_in_applications_of_binary_trees() {
		tf.app_of_binaryTrees();
	}

	@When("The user clicks Binary Search link")
	public void the_user_clicks_binary_search_link() {
		System.out.println(cm.getCurrentUrl());

	}

	@Then("The user should be navigated to the Binary Search page")
	public void the_user_should_be_navigated_to_the_binary_search_page() {
		tf.binary_Search();

	}

	@When("The user clicks Try here in Binary Search")
	public void the_user_clicks_try_here_in_binary_search() {
		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Implementation of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		tf.Implement_OfBst();
	}

	@Then("The user should be navigated to the Implementation of BST page")
	public void the_user_should_be_navigated_to_the_implementation_of_bst_page() {
		System.out.println(cm.getCurrentUrl());
	}

	@When("The user clicks Try here in Implementation of BST")
	public void the_user_clicks_try_here_in_implementation_of_bst() {
		tf.Implement_OfBst();
		tf.click_TryEditor();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		tf.practice_Tree();
	}

	@Then("The user should be navigated to the Practice Questions page")
	public void the_user_should_be_navigated_to_the_practice_questions_page() {
		System.out.println(cm.getCurrentUrl());
	}

	@Then("The user should see the practice questions")
	public void the_user_should_see_the_practice_questions() {
		System.out.println("Practice Question page is blank and need to report bug ");
	}

}
