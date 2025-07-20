//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import driverManager.DriverFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//
//public class LoginPage_sd {
////
////	WebDriver driver = DriverFactory.getBrowser();
////	private LoginPage loginPage = new LoginPage(driver);
////
////	@Given("User launches the browser, navigates to {string}")
////	public void user_launches_the_browser_navigates_to(String url) {
////		driver = DriverFactory.getBrowser(); // Uses ThreadLocal driver
////		driver.get(url);
////		loginPage = new LoginPage(driver); // Initialize LoginPage after driver is ready
////	}
////
////	@And("the user click the get started button")
////	public void the_user_click_the_get_started_button() {
////		loginPage.clickStart();
////	}
////
////	@When("User clikc the signin button")
////	public void user_click_the_signin_button() {
////		loginPage.signIn();
////	}
//
//	@Then("User should navigated to login page")
//	public void user_should_navigated_to_login_page() {
//		String title = driver.getTitle();
//		System.out.println("Login page title: " + title);
//		Assert.assertTrue(title.toLowerCase().contains("login"), "Actual title was: " + title);
//	}
//
//	@When("User provides the valid username {string}, valid password {string}")
//	public void user_provides_valid_credentials(String username, String password) {
//		loginPage.enterUserName(username);
//		loginPage.passwordField(password); // Make sure this method is fixed in LoginPage
//	}
//
//	@And("User should click the login button")
//	public void user_clicks_login_button() {
//		loginPage.clickLogin();
//	}
//
//	@Then("User should see the message {string}")
//	public void user_should_see_success_message(String expectedMessage) {
//		String text = driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
//		System.out.println("Post-login message: " + text);
//		Assert.assertTrue(text.contains(expectedMessage), "Expected message not found. Actual: " + text);
//	}
//
//}
