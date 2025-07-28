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
import utils.ExcelReaderFile;

public class LinkedListPage_pf {

	private WebDriver driver;
	private Actions action;
	WebDriverWait wait;
	ExcelReaderFile excelReader;
	String path;
	CommonMethod cmnMethod;

	public LinkedListPage_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();

		PageFactory.initElements(driver, this);
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.cmnMethod = new CommonMethod(passdr);

		this.excelReader = new ExcelReaderFile();
		this.path = excelReader.get_xlpath();
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
		cmnMethod.get_testUrl();
		launchBtn.click();
		signinBtn.click();
		String data1 = excelReader.getData(path, "credentials", 1, 0);
		userName.sendKeys(data1);
		String data2 = excelReader.getData(path, "credentials", 1, 1);
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
