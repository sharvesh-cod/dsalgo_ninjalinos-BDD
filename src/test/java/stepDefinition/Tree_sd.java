package stepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethod;
import pageObjects.Tree_pf;
import utils.LoggerLoad;

public class Tree_sd {

	private WebDriver driver;
	private Actions action;
	String browser;
	WebDriverWait wait;
	Tree_pf tf;
	CommonMethod cmnMethod;
	LoggerLoad log;

	public Tree_sd(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.cmnMethod = new CommonMethod(passdr);
		PageFactory.initElements(driver, this);
		this.tf = new Tree_pf(passdr);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.log = new LoggerLoad();

	}

	@Given("the user is in Tree page after logged in")
	public void the_user_is_in_tree_page_after_logged_in() throws InterruptedException, IOException {
		tf.background_getToTree();
	}

	@When("The user scroll down the page")
	public void the_user_scroll_down_the_page() throws InterruptedException {
		tf.scrollDownTree();
	}

	@Then("User should view all the links available in page")
	public void user_should_view_all_the_links_available_in_page() {
		tf.verifyLinks();
	}

	@When("user clicks on overview button of Tree module")
	public void user_clicks_on_overview_button_of_tree_module() throws InterruptedException {
		tf.click_Overview();

	}

	@Then("user successfully navigates to the Overview of Tree page")
	public void navigates_to_the_overview_of_tree_page() throws InterruptedException {

		String actualUrl = tf.navigate_OverviewofTree();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/overview-of-trees/";
		Assert.assertEquals(actualUrl, expectedUrl, "You are not landed on overview page");
	}

	@Given("The user in the overview page of tree module")
	public void the_user_in_the_overview_page_of_tree_module() throws InterruptedException {
		tf.click_Overview();
	}

	@When("user clicks on try here button in Overview of Tree page")
	public void user_clicks_on_try_here_button_in_overview_of_tree_page() {
		tf.click_TryEditor();
	}

	@Then("user successfully navigates to code editor of the Overview of Tree page")
	public void user_successfully_navigates_to_code_editor_of_the_overview_of_tree_page() throws IOException {
		String actualUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(actualUrl, expectedUrl, "Not landed in Try Editor page");
	}

	@Given("The user in tryEditor page")
	public void the_user_in_try_editor_page() throws InterruptedException {

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
		cmnMethod.alert_message();

	}

	@Then("An alert message should appear for without code")
	public void an_alert_message_withoutcode() {
		cmnMethod.alert_message();
		log.error(
				"There is no alert message displayed when we click on run button without entering any code in the code editor in Tree module");

	}

	@When("The user clicks Run after entering valid code")
	public void the_user_clicks_run_after_entering_valid_code() throws IOException, InterruptedException {
		cmnMethod.txtEditor_correctCode();
		tf.clickRun_WithOutCode();
	}

	@Then("The output should be displayed in the console")
	public void the_output_should_be_displayed_in_the_console() {

		String output = tf.outputText();
		Assert.assertEquals(output, "Hello World", "output not matched");

	}

	@When("The user clicks run after entering invalid code")
	public void the_user_clicks_run_after_entering_invalid_code() throws IOException, InterruptedException {
		cmnMethod.txtEditor_invalidCode();

	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		tf.click_Terminilogy();

	}

	@Then("The user should be navigated to the Terminologies page")
	public void navigated_to_the_terminologies_page() {
		String terminilogyUrl = tf.navigate_To_Terminilogy();
		System.out.println("Customer navigated to :" + terminilogyUrl);
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/terminologies/";
		Assert.assertEquals(terminilogyUrl, expectedUrl, "Not landed in Terminology page");

	}

	@When("The user clicks Try here in Terminologies")
	public void the_user_clicks_try_here_in_terminologies() {
		tf.click_Terminilogy();
		tf.click_TryEditor();

	}

	@Then("The user should be navigated to the text editor")
	public void the_user_should_be_navigated_to_the_text_editor() throws IOException {
		String textEditorUrl = cmnMethod.currentUrl();
		System.out.println("Customer in :" + textEditorUrl + "page");
		String expectedUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(textEditorUrl, expectedUrl, "Not landed in Try Editor page");

	}

	@When("The user clicks Run after entering invalid code")
	public void the_user_clicks_run_after_entering_invalidcode() throws IOException, InterruptedException {
		cmnMethod.txtEditor_invalidCode();

	}

	@When("The user clicks Types of Tree link")
	public void the_user_clicks_types_of_tree_link() throws InterruptedException {
		tf.typesOfTrees();

	}

	@Then("The user should be navigated to the Types of Tree page")
	public void the_user_should_be_navigated_to_the_types_of_tree_page() {
		String typesOfTreesUrl = tf.navigation_typeOfTrees();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/types-of-trees/";
		System.out.println("user logged into " + typesOfTreesUrl);
		Assert.assertEquals(typesOfTreesUrl, expectedUrl, "Not landed in Types of tree page");

	}

	@When("The user clicks Try here in Types of Tree")
	public void the_user_clicks_try_here_in_types_of_tree() throws InterruptedException {
		tf.typesOfTrees();
		tf.click_TryEditor();

	}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		tf.tree_Trav();

	}

	@Then("The user should be navigated to the Traversals-Illustration page")
	public void navigate_TraversalsIllustration() throws InterruptedException {
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/traversals-illustration/";
		tf.waitElement(expectedUrl);
		String treesUrl = cmnMethod.currentUrl();
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on traversalas-illustaration page");

	}

	@Then("The user should be navigated to the Tree Traversals page")
	public void the_user_should_be_navigated_to_the_tree_traversals_page() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/tree-traversals/";
		System.out.println("user logged into " + treesUrl + "Tree Traversals page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on tree traversalas page");

	}

	@When("The user clicks Try here in Tree Traversals")
	public void the_user_clicks_try_here_in_tree_traversals() {
		tf.tree_Trav();
		tf.click_TryEditor();

	}

	@When("The user clicks Try here in BinaryTree page")
	public void clicks_tryhere_BinaryTree() {
		tf.binary_Tree();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page of Tree Traversals")
	public void the_user_on_try_editor_page_of_tree_traversals() {
		tf.tree_Trav();
		tf.click_TryEditor();

	}

	@When("The user enters valid Python code, clicks Run")
	public void the_user_enters_valid_python_code_clicks_run() throws IOException, InterruptedException {
		cmnMethod.txtEditor_correctCode();

	}

	@When("The user enters invalid Python code and clicks Run")
	public void the_user_enters_invalid_python_code_and_clicks_run() throws IOException, InterruptedException {
		cmnMethod.txtEditor_invalidCode();

	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() throws InterruptedException {
		tf.Traversal_Illustra();

	}

	@When("The user clicks Try here in Tree Traversals-Illustration")
	public void the_user_clicks_try_here_in_tree_traversals_illustration() throws InterruptedException {
		tf.Traversal_Illustra();
		tf.click_TryEditor();

	}

	@When("The user enters valid Python code and clicks Run")
	public void the_user_enters_valid_python_code_and_clicks_run() throws IOException, InterruptedException {
		cmnMethod.txtEditor_correctCode();

	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		tf.binary_Tree();
	}

	@Given("The user on tryEditor page of Binary Tree")
	public void user_is_tryEditorBinaryTree() {
		tf.binary_Tree();
		tf.click_TryEditor();
	}

	@Given("The user on tryEditor page of Types of Binary Tree")
	public void user_is_tryEditorTypesBinaryTree() {
		tf.types_ofBinary();
		tf.click_TryEditor();
	}

	@Then("The user should be navigated to the Binary Trees page")
	public void navigated_to_the_binary_trees_page() {
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/binary-trees/";
		tf.waitElement(expectedUrl);
		String treesUrl = cmnMethod.currentUrl();
		System.out.println("user logged into " + treesUrl + "Binary Tree page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Binary Tree page");

	}

	@When("The user clicks Types of Binary Tree link")
	public void the_user_clicks_types_of_binary_tree_link() {

		tf.types_ofBinary();
	}

	@Then("The user should be navigated to the Types of Binary Tree page")
	public void the_user_should_be_navigated_to_the_types_of_binary_tree_page() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/";
		System.out.println("user logged into " + treesUrl + "Tyeps of Binary Tree page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Tyepes of Binary Tree page");

	}

	@When("The user clicks Implementation of Python link")
	public void the_user_clicks_implementation_of_python_link() {

		tf.Impl_in_Python();
	}

	@Then("The user should be navigated to the Implementation of Python page")
	public void the_user_should_be_navigated_to_the_implementation_of_python_page() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/implementation-in-python/";
		System.out.println(
				"user logged into " + treesUrl + "https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Implementation of Python page");

	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		tf.binary_Tree_Travers();

	}

	@Then("The user should be navigated to the Binary Tree Traversals page")
	public void the_user_should_be_navigated_to_the_binary_tree_traversals_page() {
		String treeTitle = cmnMethod.getTitle();
		String expectedUrl = "Binary Tree Traversals";
		System.out.println("user logged into " + treeTitle + "binary tree traversalas");
		Assert.assertEquals(treeTitle, expectedUrl, "Not landed on Binary Tree Traversals page");
	}

	@When("The user clicks Applications of Binary Trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		tf.app_of_binaryTrees();

	}

	@Then("The user should be navigated to the Applications of Binary Trees  page")
	public void the_user_should_be_navigated_to_the_applications_of_binary_trees_page() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/";
		System.out.println("user logged into " + treesUrl + "Applications of Binary Trees Page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Application of binary tree page");

	}

	@When("The user clicks Try here in Applications of Binary Trees")
	public void the_user_clicks_try_here_in_applications_of_binary_trees() {
		tf.app_of_binaryTrees();
		tf.click_TryEditor();
	}

	@When("The user clicks Binary Search link")
	public void the_user_clicks_binary_search_link() {
		tf.binary_Search();

	}

	@Then("The user should be navigated to the Binary Search page")
	public void the_user_should_be_navigated_to_the_binary_search_page() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/binary-search-trees/";
		System.out.println("user logged into " + treesUrl + "Binary Search Page");

	}

	@When("The user clicks Try here in Binary Search")
	public void the_user_clicks_try_here_in_binary_search() {
		tf.binary_Search();
		tf.click_TryEditor();

	}

	@When("The user clicks Implementation of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		tf.Implement_OfBst();
	}

	@Then("The user should be navigated to the Implementation of BST page")
	public void the_user_should_be_navigated_to_the_implementation_of_bst_page() {
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/";
		tf.waitElement(expectedUrl);
		String treesUrl = cmnMethod.currentUrl();
		System.out.println("user logged into " + treesUrl + "Implementation of bst");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Implementation of bst");
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

	@Then("user find blank pageTree")
	public void the_user_should_see_the_practice_questions() {
		String outputText = tf.outputText();
		if (outputText != null) {
			System.out.println("Questions loaded");
		} else
			System.out.println("Error, Page is blank");
		log.error("There are no practice questions available in the Tree module");
	}

	@Given("user is in Tree sections page")
	public void user_is_in_tree_sections_page() throws InterruptedException {
		try {
			tf.click_Overview();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("user clicks on the practice questions link in Tree module")
	public void user_clicks_on_the_practice_questions_link_in_tree_module() throws InterruptedException {
		Thread.sleep(1000);
		tf.practice_Tree();

	}

	@Then("user sucessfully navigates to practice questions of Tree module")
	public void user_sucessfully_navigates_to_practice_questions_of_tree_module() {
		String treesUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/practice";
		System.out.println("user logged into " + treesUrl + "Practice Questions page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Practice Questions page");
	}

	@Given("The user on tryEditor page of Traversals-Illustration")
	public void tryHereTrav_Ill() {
		tf.clickTryHere_travIllu();

	}

	@When("The user clicks Try here on Types of Binary Tree link")
	public void user_clicks_on_TryhereTypeOfBinaryTree() {
		tf.types_ofBinary();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page of Binary Trees")
	public void the_user_on_try_editor_page_of_binary_trees() {
		tf.binary_Tree();
		tf.click_TryEditor();

	}

	@When("The user clicks Try here in Implementation of Python page")
	public void the_user_clicks_try_here_in_implementation_of_python_page() {
		tf.Impl_in_Python();
		tf.click_TryEditor();
	}

	@Given("The user in tryEditor page of Implementation of Python")
	public void the_user_in_try_editor_page_of_implementation_of_python() {
		tf.Impl_in_Python();
		tf.click_TryEditor();
	}

	@When("The user clicks Try here in Binary Tree Traversals")
	public void the_user_clicks_try_here_in_binary_tree_traversals() {
		tf.binary_Tree_Travers();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page in Binary Tree Traversals")
	public void the_user_on_try_editor_page_in_binary_tree_traversals() {
		tf.binary_Tree_Travers();
		tf.click_TryEditor();

	}

	@Given("The user on tryEditor page on Applications of Binary Trees")
	public void the_user_on_try_editor_page_on_applications_of_binary_trees() {

		tf.app_of_binaryTrees();
		tf.click_TryEditor();

	}

	@When("The user clicks on Implementation of Binary Trees page")
	public void the_user_clicks_on_implementation_of_binary_trees_page() {
		tf.imp_of_binaryTrees();

	}

	@Then("The user should be navigated to Implementation of Binary Trees page")
	public void the_user_should_be_navigated_to_implementation_of_binary_trees_page() {
		String expectedUrl = "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/";
		tf.waitElement(expectedUrl);
		String treesUrl = cmnMethod.currentUrl();
		System.out.println("user logged into " + treesUrl + "Implementation of Binary Trees page");
		Assert.assertEquals(treesUrl, expectedUrl, "Not landed on Implementation of Binary Trees page");

	}

	@When("The user clicks Try here on Implementation of Binary Trees page")
	public void the_user_clicks_try_here_on_implementation_of_binary_trees_page() {
		tf.imp_of_binaryTrees();
		tf.click_TryEditor();
	}

	@Given("The user on tryEditor page of Implementation of Binary Trees")
	public void the_user_on_try_editor_page_of_implementation_of_binary_trees() {
		tf.imp_of_binaryTrees();
		tf.click_TryEditor();
	}

	@Given("The user on tryEditor page of Binary Search")
	public void the_user_on_try_editor_page_of_binary_search() {
		tf.binary_Search();
		tf.click_TryEditor();
	}

	@When("The user clicks Try here on Implementation of BST")
	public void the_user_clicks_try_here_on_implementation_of_bst() {
		tf.Implement_OfBst();
		tf.click_TryEditor();
	}

	@Given("The user on tryEditor page of Implementation of BST")
	public void the_user_on_try_editor_page_of_implementation_of_bst() {
		tf.Implement_OfBst();
		tf.click_TryEditor();

	}

	@Then("The user should be navigated to the text editor of Implementation of Binary Trees page")
	public void the_user_should_be_navigated_to_the_text_editor_of_implementation_of_binary_trees_page() {
		String actualUrl = cmnMethod.currentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(actualUrl, expectedUrl, "Not landed in Try Editor page");

	}

}
