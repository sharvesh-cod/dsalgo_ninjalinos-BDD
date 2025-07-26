package stepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverManager.Passing_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import pageObjects.CommonMethods;
import pageObjects.Launch_pf;
import utils.ConfigReader;

public class Launch_sd {

	private WebDriver driver;
	private Launch_pf Launch_pf;

	String browser;
	ConfigReader config;
	CommonMethods common;

	public Launch_sd(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.Launch_pf = new Launch_pf(passdr);

		this.config = new ConfigReader();

	}

	private void waitForTenSec(String partialUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}

	@Given("the user is on the Dsalgo portal after entering Url")
	public void the_user_is_on_browser() {
		Launch_pf.geturl();
		// driver.get("https://dsportalapp.herokuapp.com/");

	}

	@Then("The user should be able to land on DsAlgo portal with the message {string}")
	public void the_user_should_be_able_to_land_on_ds_algo_portal_with_the_message(String expmsg)
			throws InterruptedException {
		String actmsg = Launch_pf.gettextmsg();
		Assert.assertEquals(actmsg, expmsg, "user is not able see the message 'you are at rightplace' ");
	}

	@When("the user clicks Get started button")
	public void the_user_clicks_get_started_button() {

		Launch_pf.clickgetstarted();
	}

	@Then("the user lands on Home page")
	public void the_user_lands_on_home_page() throws InterruptedException {
		String actmsg = Launch_pf.gettitle();
		String expmsg = "NumpyNinja";
		Assert.assertEquals(actmsg, expmsg, "user is not on the homepage with title numpyninja");
	}
}