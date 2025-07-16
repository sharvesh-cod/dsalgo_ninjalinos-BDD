package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;

public class Stack_pf {

	private WebDriver driver;
	private Actions action;
	String browser;
	WebDriverWait wait;

	@FindBy(xpath = "//h5[text()='Stack']/../../..//a[text()='Get Started']")
	WebElement stackBtn; // temporarily adding this web element

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationsStackBtn;

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackBtn;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationStackBtn;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement stackPracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereStack;

	public Stack_pf(Passing_Driver passdr) {

//		this.browser = obj.return_browser();
//		this.driver = obj.initBrowser(browser);
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);

		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public void stack_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stackBtn);

		action.scrollToElement(stackBtn).perform();
		action.click(stackBtn).perform();
	}

	public void opreations_stack_btn() {
		// wait.until(ExpectedConditions.visibilityOf(operationsStackBtn));
		// wait.until(ExpectedConditions.elementToBeClickable(operationsStackBtn));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);",
		// operationsStackBtn);
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400);");
		// operationsStackBtn.click();
		action.scrollToElement(operationsStackBtn).perform();
		action.click(operationsStackBtn).perform();
	}

	public void implementation_stack_btn() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);",
		// implementationStackBtn);
		action.scrollToElement(implementationStackBtn).perform();
		action.click(implementationStackBtn).perform();
	}

	public void application_stack_btn() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);",
		// applicationStackBtn);
		action.scrollToElement(applicationStackBtn).perform();
		action.click(applicationStackBtn).perform();
	}

	public void practice_stack() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", stackPracticeQ);
		action.scrollToElement(stackPracticeQ).perform();
		action.click(stackPracticeQ).perform();
	}

	public void tryhere_stack() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereStack);
		action.scrollToElement(tryHereStack).perform();
		action.click(tryHereStack).perform();
	}

	public String url() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

	public void refreshElements() {
		PageFactory.initElements(driver, this);
	}

}
