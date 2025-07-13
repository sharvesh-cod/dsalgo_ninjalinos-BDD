package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;

public class Queue_pf {

	private WebDriver driver;
	Actions action;
	String browser;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement implementationQueuePythonBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement implementationUseCollectionBtn;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement implementationUseArrayBtn;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement queueOperationsBtn;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement queuePracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereQueue;

	public Queue_pf(Hooks hooks) {

//		this.browser = obj.return_browser();
//		this.driver = obj.initBrowser(browser);
		this.driver = hooks.getDriver_fromHooks();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);

	}

	public void implementation_queue_python_btn() {

		action.scrollToElement(implementationQueuePythonBtn).perform();
		action.click(implementationQueuePythonBtn).perform();
	}

	public void implementation_collection_btn() {

		action.scrollToElement(implementationUseCollectionBtn).perform();
		action.click(implementationUseCollectionBtn).perform();
	}

	public void implementation_array_btn() {

		action.scrollToElement(implementationUseArrayBtn).perform();
		action.click(implementationUseArrayBtn).perform();
	}

	public void queue_operations_btn() {

		action.scrollToElement(queueOperationsBtn).perform();
		action.click(queueOperationsBtn).perform();
	}

	public void practice_queue() {

		action.scrollToElement(queuePracticeQ).perform();
		action.click(queuePracticeQ).perform();
	}

	public void tryhere_queue() {

		action.scrollToElement(tryHereQueue).perform();
		action.click(tryHereQueue).perform();
	}

	public String url() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

}
