package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage_pf {

	WebDriver driver;
	Actions action = new Actions(driver);

	public LinkedListPage_pf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Main Linked List Page
	@FindBy(linkText = "Introduction")
	public WebElement introductionLink;

	@FindBy(linkText = "Creating Linked List")
	public WebElement creatingLinkedListLink;

	@FindBy(linkText = "Types of Linked List")
	public WebElement typesOfLinkedListLink;

	@FindBy(linkText = "Implement Linked List in Python")
	public WebElement implementLL_Link;

	@FindBy(linkText = "Traversal")
	public WebElement traversalLink;

	@FindBy(linkText = "Insertion")
	public WebElement insertionLink;

	@FindBy(linkText = "Deletion")
	public WebElement deletionLink;

	// practice questions link also common

	// Common for each page HAS TO BE WRITTEN IN COMMON METHODS
//	TRYHERE, CODE EDITOR, RUN BUTTON ,SUBMIT BTN ALREADY WRITTEN

	public void clickIntroduction() {
		action.scrollToElement(introductionLink).perform();
		action.click(introductionLink).perform();

	}

	public void clickCreatingLinkedList() {
		action.scrollToElement(creatingLinkedListLink).perform();
		action.click(creatingLinkedListLink).perform();

	}

	public void clickTypesOfLinkedList() {
		action.scrollToElement(typesOfLinkedListLink).perform();
		action.click(typesOfLinkedListLink).perform();

	}

	public void clickImplementLinkedListInPython() {
		action.scrollToElement(implementLL_Link).perform();
		action.click(implementLL_Link).perform();

	}

	public void clickTraversal() {
		action.scrollToElement(traversalLink).perform();
		action.click(traversalLink).perform();

	}

	public void clickInsertion() {
		action.scrollToElement(insertionLink).perform();
		action.click(insertionLink).perform();

	}

	public void clickDeletion() {
		action.scrollToElement(deletionLink).perform();
		action.click(deletionLink).perform();

	}

}
