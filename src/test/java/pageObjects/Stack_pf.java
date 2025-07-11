package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//h5[text()='Stack']/../../..//a[text()='Get Started']")
	WebElement stackBtn; // temporarily adding this web element

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationsStackBtn;

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackBtn;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationStackBtn;

	public Stack_pf(WebDriver driver, Actions action) {

		this.driver = driver;
		this.action = action;
		PageFactory.initElements(driver, this);

	}

	public void stack_btn() {

		action.scrollToElement(stackBtn).perform();
		action.click(stackBtn).perform();
	}

	public void opreations_stack_btn() {

		action.scrollToElement(operationsStackBtn).perform();
		action.click(operationsStackBtn).perform();
	}

	public void implementation_stack_btn() {

		action.scrollToElement(implementationStackBtn).perform();
		action.click(implementationStackBtn).perform();
	}

	public void application_stack_btn() {

		action.scrollToElement(applicationStackBtn).perform();
		action.click(applicationStackBtn).perform();
	}

	public String url() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

}
