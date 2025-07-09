package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplementationOfQueue_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//li/a[text()='Implementation using collections.deque']")
	WebElement implementationUseCollectionLink;

	@FindBy(xpath = "//li/a[text()='Implementation using array']")
	WebElement implementationUseArrayLink;

	@FindBy(xpath = "//li/a[text()='Queue Operations']")
	WebElement queueOperationsLink;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement queuePracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereQueue;

	public ImplementationOfQueue_pf(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void implementation_q_python() {

		action.scrollToElement(implementationUseCollectionLink).perform();
		action.click(implementationUseCollectionLink).perform();
	}

	public void implementation_array() {

		action.scrollToElement(implementationUseArrayLink).perform();
		action.click(implementationUseArrayLink).perform();
	}

	public void queue_operations() {

		action.scrollToElement(queueOperationsLink).perform();
		action.click(queueOperationsLink).perform();
	}

	public void practice_queue() {

		action.scrollToElement(queuePracticeQ).perform();
		action.click(queuePracticeQ).perform();
	}

	public void tryhere_queue() {

		action.scrollToElement(tryHereQueue).perform();
		action.click(tryHereQueue).perform();
	}

}
