package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array_pf {

	WebDriver driver;
	Actions action;

	public Array_pf(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Array']/../a[text()='Get Started']")
	WebElement arrayGetStarted; // ADDING NEW ELEMENT REMOVE IT AFTER MOCK TESTING

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysInPythonLink;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraysUsingListLink;

	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperationsLink;

	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applicationsOfArrayLink;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;

	@FindBy(xpath = "//a[contains(text(), 'Try here')]")
	WebElement tryHereLink;

	public void clickArrayGetStarted() {
		action.scrollToElement(arrayGetStarted).perform();
		action.click(arrayGetStarted).perform();

	}

	public void clickArraysInPython() {
		action.scrollToElement(arraysInPythonLink).perform();
		action.click(arraysInPythonLink).perform();

	}

	public void clickArraysUsingList() {
		action.scrollToElement(arraysUsingListLink).perform();
		action.click(arraysUsingListLink).perform();

	}

	public void clickBasicOperations() {
		action.scrollToElement(basicOperationsLink).perform();
		action.click(basicOperationsLink).perform();
	}

	public void clickApplicationsOfArray() {
		action.scrollToElement(applicationsOfArrayLink).perform();
		action.click(applicationsOfArrayLink).perform();
	}

	public void clickPracticeQuestionsLink() {
		action.scrollToElement(practiceQuestionsLink).perform();
		action.click(practiceQuestionsLink).perform();

	}

	public void clickTryHere() {
		action.scrollToElement(tryHereLink).perform();
		action.click(tryHereLink).perform();
	}

}
