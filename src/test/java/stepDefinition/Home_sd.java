
package stepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverManager.Passing_Driver;
//import junit.framework.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethods;
import pageObjects.Home_pf;
import pageObjects.Launch_pf;
import utils.ConfigReader;
import utils.LoggerLoad;

public class Home_sd {
	private WebDriver driver;

	String browser;
	ConfigReader config;
	CommonMethods common;
	private Launch_pf Launch_pf;
	private Home_pf Home_pf;
	LoggerLoad log;

	public Home_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.Launch_pf = new Launch_pf(passdr);
		this.Home_pf = new Home_pf(passdr);
		this.config = new ConfigReader();

		this.log = new LoggerLoad();

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("the user is on DsAlgo portal")
	public void the_user_is_on_ds_algo_portal() {
		Launch_pf.geturl();

	}

	@When("the user clicks on Get started button")
	public void the_user_clicks_on_get_started_button() {
		Launch_pf.clickgetstarted();
	}

	@Given("the user is on Home page")
	public void the_user_is_on_home_page() {
		Assert.assertEquals(Home_pf.homepagetext(), "NumpyNinja");
	}

	@When("the user clicks on Get started button  in Data strucures-Introduction without signin")
	public void the_user_clicks_on_get_started_button_in_data_strucures_introduction_without_signin() {
		Home_pf.clickgetstartedDatastructures();
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String Expmsg) {
		String actmsg = Home_pf.notloggedinmesg();
		log.error("There are no Datastructures option in dropdown box");
		Assert.assertEquals(actmsg, Expmsg,
				"the user is not able to see mesg your are not logged in because no option in the dropdown");
	}

	@When("the user clicks on Get started button in Array without signin")
	public void the_user_clicks_on_get_started_button_in_array_without_signin() {
		Home_pf.clickgetstartedArray();
	}

	@When("the user clicks on Get started button in Linked List without signin")
	public void the_user_clicks_on_get_started_button_in_linked_list_without_signin() {
		Home_pf.clickgetstartedLinkedList();
	}

	@When("the user clicks on Get started button in Stack without signin")
	public void the_user_clicks_on_get_started_button_in_stack_without_signin() {
		Home_pf.clickgetstartedStack();
	}

	@When("the user clicks on Get started button in Queue without signin")
	public void the_user_clicks_on_get_started_button_in_queue_without_signin() {
		Home_pf.clickgetstartedQueue();
	}

	@When("the user clicks on Get started button Tree without signin")
	public void the_user_clicks_on_get_started_button_tree_without_signin() {
		Home_pf.clickgetstartedTree();
	}

	@When("the user clicks on Get started button in Graph without signin")
	public void the_user_clicks_on_get_started_button_in_graph_without_signin() {
		Home_pf.clickgetstartedGraph();
	}

	@When("the user clicks dropdown and select datastructures")
	public void the_user_clicks_dropdown_and_select_datastructures() {
		Home_pf.clickDropdownbox();

	}

	@When("the user clicks dropdown and select Array")
	public void the_user_clicks_dropdown_and_select_array() {
		Home_pf.clickDropdownbox();
		Home_pf.clickDropdownArrays();
	}

	@When("the user clicks dropdown and select Linkedlist")
	public void the_user_clicks_dropdown_and_select_linkedlist() {
		Home_pf.clickDropdownbox();
		Home_pf.clickDropdownLinkedList();
	}

	@When("the user clicks dropdown and select Stack")
	public void the_user_clicks_dropdown_and_select_stack() {
		Home_pf.clickDropdownbox();
		Home_pf.clickDropdownStack();
	}

	@When("the user clicks dropdown and select Queue")
	public void the_user_clicks_dropdown_and_select_queue() {
		Home_pf.clickDropdownbox();
		Home_pf.clickDropdownQueue();
	}

	@When("the user clicks dropdown and select Tree")
	public void the_user_clicks_dropdown_and_select_tree() {
		Home_pf.clickDropdownbox();
		Home_pf.clickDropdownTree();
	}

	@When("the user clicks dropdown and select Graph")
	public void the_user_clicks_dropdown_and_select_graph() {
		Home_pf.clickDropdownbox();
		Home_pf.clickgetstartedGraph();
	}

	@When("the user clicks on Register")
	public void the_user_clicks_on_register() {
		Home_pf.clickRegister();
	}

	@Then("The user should land on registration page")
	public void the_user_should_land_on_registration_page() {

	}

}