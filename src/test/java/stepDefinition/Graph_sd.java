package stepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CodeEditor_pf;
import pageObjects.CommonMethods;
import pageObjects.Graph_pf;
import utils.LoggerLoad;

public class Graph_sd {

	private WebDriver driver;
	private Actions action;
	CodeEditor_pf codeEditor;
	String browser;
	CommonMethods common;
	Graph_pf gr;
	WebDriverWait wait;
	LoggerLoad log;

	public Graph_sd(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.codeEditor = new CodeEditor_pf(passdr);
		this.common = new CommonMethods(passdr);
		this.gr = new Graph_pf(passdr);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.log = new LoggerLoad();

	}

	@Given("the user is in Graph page after logged in")
	public void the_user_is_in_graph_page_after_logged_in() throws InterruptedException, IOException {
		gr.background_getTograph();

	}

	@When("user click on try here link on graph module")
	public void user_click_on_try_here_link_on_graph_module() throws InterruptedException {
		gr.click_Graph();
		gr.click_TryEditor();

	}

	@Given("The user in tryEditor page of graphlink section")
	public void the_user_in_try_editor_page_of_graphlink_section() throws InterruptedException {
		gr.click_Graph();
		gr.click_TryEditor();

	}

	@Given("The user in tryEditor page of graph representation section")
	public void the_user_in_tryeditor_page_of_graph_section() throws InterruptedException {
		gr.graphRepresent();
		gr.click_TryEditor();

	}

	@When("user click on run button without code")
	public void user_click_on_run_button_without_code() {

		gr.clickRun_WithOutCode();

	}

	@Then("user should be able to see alert message to enter the valid code")
	public void user_should_be_able_to_see_alert_message_to_enter_the_valid_code() {
		System.out.println("Unable to see the alert pop-up");
		codeEditor.handle_alert();
		log.error(
				"There is no alert message displayed when we click on run button without entering any code in the code editor in Graph module");

	}

	@When("user click button after entering the valid python code on the text editor")
	public void user_click_button_after_entering_the_valid_python_code_on_the_text_editor()
			throws IOException, InterruptedException {

		codeEditor.txtEditor_correctCode();

	}

	@Then("user should be able to see ouput in the console")
	public void user_should_be_able_to_see_ouput_in_the_console() {
		codeEditor.output_text();

	}

	@When("user click button after entering the invalid python code on the text editor")
	public void user_click_button_after_entering_the_invalid_pythoncode_on_the_text_editor()
			throws IOException, InterruptedException {
		codeEditor.txtEditor_invalidCode();

	}

	@Then("user should be able to see alert message in window")
	public void user_should_be_able_to_see_alert_message_in_window() {
		codeEditor.handle_alert();
	}

	@When("user click on Graph Representation link")
	public void user_click_on_graph_representation_link() throws InterruptedException {
		gr.graphRepresent();

	}

	@Then("user should navigate to Graph Representation page")
	public void user_should_navigate_to_graph_representation_page() {
		String title = common.getTitle();
		String expectedTitle = "Graph Representations";
		Assert.assertEquals(title, expectedTitle, "User not landed on Graph Representation page");

	}

	@When("user click on try here link on Graph Representation section")
	public void user_click_on_try_here_link_on_graph_representation_section() throws InterruptedException {
		gr.graphRepresent();
		gr.click_TryEditor();

	}

	@Given("user is in Graph sections page")
	public void user_is_in_graph_sections_page() {
		gr.click_Graph();

	}

	@When("user clicks on the practice questions link in Graph module")
	public void user_clicks_on_the_practice_questions_link_in_graph_module() {
		gr.practice_Grpah();

	}

	@Then("user sucessfully navigates to practice questions of Graph module")
	public void user_sucessfully_navigates_to_practice_questions_of_graph_module() {
		String title = common.getTitle();
		String expectedPartial = "Practice Questions";

		Assert.assertTrue(title.contains(expectedPartial),
				"Expected title to contain: " + expectedPartial + ", but got: " + title);

	}

	@Then("user find blank page")
	public void user_find_blank_page() {
		log.error("There are no practice questions available in the Graph module");
		System.out.println("Blank Page");
		log.error("There is no practice questions displayed on Practice Question Page");
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/graph/", common.currentUrl(),
				"blank page in Practice Question section");

	}

	@When("user clicks on Graphlink on graph module")
	public void user_clicks_on_graphlink_on_graph_module() {
		gr.click_Graph();
	}

	@Then("user should navigate to Graphlink page")
	public void user_should_navigate_to_graphlink_page() {
		String graphtitle = common.getTitle();
		String expectedTitle = "Graph";
		Assert.assertEquals(graphtitle, expectedTitle, "You are not landed on Graph page");

	}

	@Then("user should navigate to text editor page of graph section")
	public void user_should_navigate_to_text_editor_page_of_graph_section() {

		String title = common.getTitle();
		String expectedPartial = "Assessment";
		Assert.assertTrue(title.contains(expectedPartial),
				"Expected title to contain: " + expectedPartial + ", but got: " + title);

	}

	@Then("user should navigate to text editor page")
	public void user_should_navigate_to_text_editor_page_() {

		String title = common.getTitle();
		String expectedPartial = "Assessment";
		Assert.assertTrue(title.contains(expectedPartial),
				"Expected title to contain: " + expectedPartial + ", but got: " + title);

	}

}
