// SUGGESTED BY CHATGPT FOR FIREFOX

package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;
import utils.ExcelReaderFile;

public class LinkedListPage_pf {

	private WebDriver driver;
	private Actions action;
	WebDriverWait wait;
	ExcelReaderFile excelReader;
	String path;
	ConfigReader config;

	public LinkedListPage_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReaderFile(path);
	}

	// =========== LOGIN ELEMENTS ============

	@FindBy(className = "btn")
	WebElement launchBtn;

	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement signinBtn;

	@FindBy(id = "id_username")
	WebElement userName;

	@FindBy(id = "id_password")
	WebElement pwd;

	@FindBy(xpath = "//input[4]")
	WebElement logInBtn;

	@FindBy(xpath = "//*[text()='Sign out']")
	WebElement signOut;

	// ========== ELEMENTS ==================

	@FindBy(xpath = "//h5[text()='Linked List']/../a[text()='Get Started']")
	WebElement llGetStarted; // ADDING NEW ELEMENT REMOVE IT AFTER MOCK TESTING

	@FindBy(xpath = "//a[text()='Introduction']")
	public WebElement introductionLink;

	@FindBy(xpath = "//a[text()='Creating Linked LIst']")
	public WebElement creatingLinkedListLink;

	@FindBy(xpath = "//a[text()='Types of Linked List']")
	public WebElement typesOfLinkedListLink;

	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	public WebElement implementLL_Link;

	@FindBy(xpath = "//a[text()='Traversal']")
	public WebElement traversalLink;

	@FindBy(xpath = "//a[text()='Insertion']")
	public WebElement insertionLink;

	@FindBy(xpath = "//a[text()='Deletion']")
	public WebElement deletionLink;

	@FindBy(xpath = "//a[contains(text(), 'Try here')]")
	WebElement tryHereLink;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;

	// ========== Helper method ================

	private void safeClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// ========== Actions =====================

	// ============ BACKGROUND ===============

	public void background_linkedList() throws IOException {
		driver.get(config.get_prop_value("testurl"));
		launchBtn.click();
		signinBtn.click();
		String data1 = excelReader.getData("credentials", 1, 0);
		userName.sendKeys(data1);
		String data2 = excelReader.getData("credentials", 1, 1);
		pwd.sendKeys(data2);
		logInBtn.click();

	}

	public void clickllGetStarted() {
		safeClick(llGetStarted);
	}

	public void clickIntroduction() {
		safeClick(introductionLink);
	}

	public void clickCreatingLinkedList() {
		safeClick(creatingLinkedListLink);
	}

	public void clickTypesOfLinkedList() {
		safeClick(typesOfLinkedListLink);
	}

	public void clickImplementLinkedListInPython() {
		safeClick(implementLL_Link);
	}

	public void clickTraversal() {
		safeClick(traversalLink);
	}

	public void clickInsertion() {
		safeClick(insertionLink);
	}

	public void clickDeletion() {
		safeClick(deletionLink);
	}

	public void clickPracticeQuestionsLink_LL() {
		safeClick(practiceQuestionsLink);
	}

	public void clickTryHere_LL() {
		safeClick(tryHereLink);
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}
}

//****************************        ORIGINAL CODE      ********************************

//package pageObjects;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import driverManager.Passing_Driver;
//
//public class LinkedListPage_pf {
//
//	private WebDriver driver;
//	private Actions action;
//	String browser;
//	WebDriverWait wait;
//
//	public LinkedListPage_pf(Passing_Driver passdr) {
//
//		this.driver = passdr.getDriver(); // uses THREADLOCAL TO GET DRIVER
//		PageFactory.initElements(driver, this); // Initialize the elements defined in this Array_pf class using the
//												// driver provided.
//		this.action = new Actions(driver); // this refers to the current instance of the class.
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	}
//	// Main Linked List Page
//
//	@FindBy(xpath = "//h5[text()='Linked List']/../a[text()='Get Started']")
//	WebElement llGetStarted; // ADDING NEW ELEMENT REMOVE IT AFTER MOCK TESTING
//
//	@FindBy(xpath = "//a[text()='Introduction']")
//	public WebElement introductionLink;
//
//	@FindBy(xpath = "//a[text()='Creating Linked LIst']")
//	public WebElement creatingLinkedListLink;
//
//	@FindBy(xpath = "//a[text()='Types of Linked List']")
//	public WebElement typesOfLinkedListLink;
//
//	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
//	public WebElement implementLL_Link;
//
//	@FindBy(xpath = "//a[text()='Traversal']")
//	public WebElement traversalLink;
//
//	@FindBy(xpath = "//a[text()='Insertion']")
//	public WebElement insertionLink;
//
//	@FindBy(xpath = "//a[text()='Deletion']")
//	public WebElement deletionLink;
//
//	@FindBy(xpath = "//a[contains(text(), 'Try here')]")
//	WebElement tryHereLink;
//
//	@FindBy(xpath = "//a[text()='Practice Questions']")
//	WebElement practiceQuestionsLink;
//
//	// practice questions link also common
//
//	// Common for each page HAS TO BE WRITTEN IN COMMON METHODS
////	TRYHERE, CODE EDITOR, RUN BUTTON ,SUBMIT BTN ALREADY WRITTEN
//
//	public void clickllGetStarted() {
//		action.scrollToElement(llGetStarted).perform();
//		action.click(llGetStarted).perform();
//
//	}
//
//	public void clickIntroduction() {
//		action.scrollToElement(introductionLink).perform();
//		action.click(introductionLink).perform();
//
//	}
//
//	public void clickCreatingLinkedList() {
//		action.scrollToElement(creatingLinkedListLink).perform();
//		action.click(creatingLinkedListLink).perform();
//
//	}
//
//	public void clickTypesOfLinkedList() {
//		action.scrollToElement(typesOfLinkedListLink).perform();
//		action.click(typesOfLinkedListLink).perform();
//
//	}
//
//	public void clickImplementLinkedListInPython() {
//		action.scrollToElement(implementLL_Link).perform();
//		action.click(implementLL_Link).perform();
//
//	}
//
//	public void clickTraversal() {
//		action.scrollToElement(traversalLink).perform();
//		action.click(traversalLink).perform();
//
//	}
//
//	public void clickInsertion() {
//		action.scrollToElement(insertionLink).perform();
//		action.click(insertionLink).perform();
//
//	}
//
//	public void clickDeletion() {
//		action.scrollToElement(deletionLink).perform();
//		action.click(deletionLink).perform();
//
//	}
//
//	public void clickPracticeQuestionsLink_LL() {
//		action.scrollToElement(practiceQuestionsLink).perform();
//		action.click(practiceQuestionsLink).perform();
//
//	}
//
//	public void clickTryHere_LL() {
//		action.scrollToElement(tryHereLink).perform();
//		action.click(tryHereLink).perform();
//	}
//
//	public String getURL() {
//		String afterNavigation = driver.getCurrentUrl();
//		return afterNavigation;
//	}
//
//}
