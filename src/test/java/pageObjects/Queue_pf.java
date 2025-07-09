package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement implementationQueuePythonBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement implementationUseCollectionBtn;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement implementationUseArrayBtn;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement queueOperationsBtn;

	public Queue_pf(WebDriver driver) {

		this.driver = driver;
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

}
