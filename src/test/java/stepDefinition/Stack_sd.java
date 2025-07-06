package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CommonMethods;

public class Stack_sd extends CommonMethods {

	@Given("user signs into the portal using valid username {string} and password {string}")
	public void user_signs_into_the_portal_using_valid_username_and_password(String userName, String password) {
		initializeDriver();

		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		driver.findElement(By.id("id_username")).sendKeys(userName);
		driver.findElement(By.id("id_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[4]")).click();
		String signOutDisplay = driver.findElement(By.xpath("//*[text()='Sign out']")).getText();
		assertEquals("Sign out", signOutDisplay);

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in home page of ds algo portal after signing in")
	public void user_is_in_home_page_of_ds_algo_portal_after_signing_in() {
		initializeDriver();
		String currentPageUrl = driver.getCurrentUrl();
		assertEquals("https://dsportalapp.herokuapp.com/home", currentPageUrl);

		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Get started button of Stack module")
	public void user_clicks_on_get_started_button_of_stack_module() {

		WebElement ele1 = driver.findElement(By.xpath("//h5[text()='Stack']/../../..//a[text()='Get Started']"));
		action.scrollToElement(ele1).perform();
		action.click(ele1).perform();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the stack page in ds algo portal")
	public void user_successfully_navigates_to_the_stack_page_in_ds_algo_portal() {

		String currentPageUrl = driver.getCurrentUrl();
		assertEquals("https://dsportalapp.herokuapp.com/stack/", currentPageUrl);

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in stack page of ds algo portal")
	public void user_is_in_stack_page_of_ds_algo_portal() {
		initializeDriver();
		WebElement ele2 = driver.findElement(By.xpath("//h5[text()='Stack']/../../..//a[text()='Get Started']"));
		action.scrollToElement(ele2).perform();
		action.click(ele2).perform();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on operations in stack button of Stack module")
	public void user_clicks_on_operations_in_stack_button_of_stack_module() {

		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Operations in Stack']"));
		action.scrollToElement(ele3).perform();
		action.click(ele3).perform();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the operations in stack page")
	public void user_successfully_navigates_to_the_operations_in_stack_page() {

		String currentPageUrl = driver.getCurrentUrl();
		assertEquals("https://dsportalapp.herokuapp.com/stack/operations-in-stack/", currentPageUrl);

		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in operations in stack page")
	public void user_is_in_operations_in_stack_page() {
		initializeDriver();
		WebElement ele4 = driver.findElement(By.xpath("//h5[text()='Stack']/../../..//a[text()='Get Started']"));
		action.scrollToElement(ele4).perform();
		action.click(ele4).perform();
		WebElement ele5 = driver.findElement(By.xpath("//a[text()='Operations in Stack']"));
		action.scrollToElement(ele5).perform();
		action.click(ele5).perform();
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in operations in stack page")
	public void user_clicks_on_try_here_button_in_operations_in_stack_page() {

		WebElement ele6 = driver.findElement(By.xpath("//div[2]/following::*/div[2]/a"));
		action.scrollToElement(ele6).perform();
		action.click(ele6).perform();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to code editor of the operations in stack page")
	public void user_successfully_navigates_to_code_editor_of_the_operations_in_stack_page() {

		String currentPageUrl = driver.getCurrentUrl();
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", currentPageUrl);
		driver.navigate().to("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of operations in stack page")
	public void user_is_in_try_here_page_of_operations_in_stack_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page without entering any code in the editor")
	public void user_clicks_on_run_button_in_try_here_page_without_entering_any_code_in_the_editor() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user does not see any alert message saying code eitor is empty")
	public void user_does_not_see_any_alert_message_saying_code_eitor_is_empty() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page after entering a code with error in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_code_with_error_in_the_editor() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user gets an alert message about the error in code")
	public void user_gets_an_alert_message_about_the_error_in_code() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Run button in Try here page after entering a correct code in the editor")
	public void user_clicks_on_run_button_in_try_here_page_after_entering_a_correct_code_in_the_editor() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation link")
	public void user_clicks_on_implementation_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Implementation page")
	public void user_sucessfully_navigates_to_the_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in implementation page")
	public void user_is_in_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in implementation page")
	public void user_clicks_on_try_here_button_in_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of implementation page")
	public void user_successfully_navigates_to_the_code_editor_of_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementation page")
	public void user_is_in_try_here_page_of_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of implementaiton page")
	public void user_is_in_try_here_page_of_implementaiton_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on application link")
	public void user_clicks_on_application_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the applicaiton page")
	public void user_sucessfully_navigates_to_the_applicaiton_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in applicaiton page")
	public void user_is_in_applicaiton_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on try here button in application page")
	public void user_clicks_on_try_here_button_in_application_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user successfully navigates to the code editor of application page")
	public void user_successfully_navigates_to_the_code_editor_of_application_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of applicaiton page")
	public void user_is_in_try_here_page_of_applicaiton_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in try here page of application page")
	public void user_is_in_try_here_page_of_application_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in stack page")
	public void user_is_in_stack_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Implementation button")
	public void user_clicks_on_implementation_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the  Implementation page")
	public void user_sucessfully_navigates_to_implementation_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Application button")
	public void user_clicks_on_application_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Application page")
	public void user_sucessfully_navigates_to_the_application_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("user is in the home page of ds algo portal")
	public void user_is_in_the_home_page_of_ds_algo_portal() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Data Structures dropdown and clicks on Stack")
	public void user_clicks_on_data_structures_dropdown_and_clicks_on_stack() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user sucessfully navigates to the Stack page")
	public void user_sucessfully_navigates_to_the_stack_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@After("@stack")

	public void user_sucessfully_logs_out_of_the_ds_algo_portal() {

		WebElement ele7 = driver.findElement(By.xpath("//*[text()='Sign out']"));
		action.scrollToElement(ele7).perform();
		action.click(ele7).perform();
		tearDownDriver();
		// throw new io.cucumber.java.PendingException();
	}

}
