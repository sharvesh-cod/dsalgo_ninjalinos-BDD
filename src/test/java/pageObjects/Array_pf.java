//AS SUGGESTED BY CHATGPT FOR FIREFOX

package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;
import utils.ExcelReader;

public class Array_pf {

	private WebDriver driver;
	private WebDriverWait wait;
	ExcelReader excelReader;
	String path;
	ConfigReader config;

	public Array_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReader(path);
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

	// ========== Elements ==========

	@FindBy(xpath = "//h5[text()='Array']/../a[text()='Get Started']")
	WebElement arrayGetStarted;

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

	// Practice Questions Page
	@FindBy(xpath = "//a[text()='Search the array']")
	WebElement searchTheArrayLink;

	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveOnesLink;

	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	WebElement evenNumberDigitsLink;

	@FindBy(xpath = "//a[contains(text(),'Squares')]")
	WebElement squaresOfSortedArrayLink;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
	WebElement practiceQuestionEditor;

	@FindBy(css = "input[value='Submit']")
	WebElement submitBtn;

	// ========== Helper ==========

	private void safeClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// ========== Actions ==========

	// ============ BACKGROUND ===============

	public void background_array() throws IOException {
		driver.get(config.get_prop_value("testurl"));
		launchBtn.click();
		signinBtn.click();
		String data1 = excelReader.getData("credentials", 1, 0);
		userName.sendKeys(data1);
		String data2 = excelReader.getData("credentials", 1, 1);
		pwd.sendKeys(data2);
		logInBtn.click();

	}

	public void clickArrayGetStarted() {
		safeClick(arrayGetStarted);
	}

	public void clickArraysInPython() {
		safeClick(arraysInPythonLink);
	}

	public void clickArraysUsingList() {
		safeClick(arraysUsingListLink);
	}

	public void clickBasicOperations() {
		safeClick(basicOperationsLink);
	}

	public void clickApplicationsOfArray() {
		safeClick(applicationsOfArrayLink);
	}

	public void clickPracticeQuestionsLink() {
		safeClick(practiceQuestionsLink);
	}

	public void clickTryHere() {
		safeClick(tryHereLink);
	}

	public void clickSearchTheArray() {
		safeClick(searchTheArrayLink);
	}

	public void clickMaxConsecutiveOnes() {
		safeClick(maxConsecutiveOnesLink);
	}

	public void clickEvenNumberDigits() {
		safeClick(evenNumberDigitsLink);
	}

	public void clickSquaresOfSortedArray() {
		safeClick(squaresOfSortedArrayLink);
	}

	// General reusable method for valid code input
//	public void enterValidCodeInPracticeEditor(String code) {
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestionEditor);
//		wait.until(ExpectedConditions.visibilityOf(practiceQuestionEditor));
//		practiceQuestionEditor.click();
//
//		// Clear and enter code using JavaScript
//		((JavascriptExecutor) driver).executeScript(
//				"var editor = arguments[0]; editor.innerText=''; editor.textContent=arguments[1];",
//				practiceQuestionEditor, code);
//	}
	public void enterValidCodeInPracticeEditor(String code) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestionEditor);
		wait.until(ExpectedConditions.visibilityOf(practiceQuestionEditor));
		practiceQuestionEditor.click();

		// Use Actions to clear and type code like a user
		Actions actions = new Actions(driver);
		actions.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
				.sendKeys(Keys.DELETE).sendKeys(code).perform();
	}

	// Old method 1 → now calls reusable
	public void tryEditor_validCode_practiceQ1() {
		String validCode1 = "print('hello')";

		enterValidCodeInPracticeEditor(validCode1);
	}

	public void tryEditor_validCode_practiceQ2() {
		String validCode2 = "print 'hello'";
		enterValidCodeInPracticeEditor(validCode2);
	}

	public void tryEditor_validCode_practiceQ3() {
		String validCode3 = "print 'hello'";
		enterValidCodeInPracticeEditor(validCode3);
	}

	public void tryEditor_validCode_practiceQ4() {
		String validCode4 = "print 'hello'";
		enterValidCodeInPracticeEditor(validCode4);
	}

	public void tryEditor_invalidCode_practiceQ() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestionEditor);
		practiceQuestionEditor.click();
		practiceQuestionEditor.sendKeys("abc");
	}

	public void clickSubmit() {
		safeClick(submitBtn);
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}
}

//***********************     ORIGINAL CODE             ****************************************

//package pageObjects;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import driverManager.Passing_Driver;
//
//public class Array_pf {
//
//	private WebDriver driver;
//	private Actions action;
//	String browser;
//	WebDriverWait wait;
//
//	public Array_pf(Passing_Driver passdr) {
//
//		this.driver = passdr.getDriver(); // uses THREADLOCAL TO GET DRIVER
//		PageFactory.initElements(driver, this); // Initialize the elements defined in this Array_pf class using the
//												// driver provided.
//		this.action = new Actions(driver); // this refers to the current instance of the class.
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	}
//
////	public Array_pf(WebDriver driver) {       *****[Custom Constructor for Dependency Injection ]***********
////		this.driver = driver;
////		this.action = new Actions(driver); // Creates a new Actions object using the current WebDriver instance
////		PageFactory.initElements(driver, this); // And assigns it to the action field of your class.
////	}
//
//	@FindBy(xpath = "//h5[text()='Array']/../a[text()='Get Started']")
//	WebElement arrayGetStarted; // ADDING NEW ELEMENT REMOVE IT AFTER MOCK TESTING
//
//	@FindBy(xpath = "//a[text()='Arrays in Python']")
//	WebElement arraysInPythonLink;
//
//	@FindBy(xpath = "//a[text()='Arrays Using List']")
//	WebElement arraysUsingListLink;
//
//	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
//	WebElement basicOperationsLink;
//
//	@FindBy(xpath = "//a[text()='Applications of Array']")
//	WebElement applicationsOfArrayLink;
//
//	@FindBy(xpath = "//a[text()='Practice Questions']")
//	WebElement practiceQuestionsLink;
//
//	@FindBy(xpath = "//a[contains(text(), 'Try here')]")
//	WebElement tryHereLink;
//
//	// PRACTICE QUESTIONS PAGE
//
//	@FindBy(xpath = "//a[text()='Search the array']")
//	WebElement searchTheArrayLink;
//
//	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
//	WebElement maxConsecutiveOnesLink;
//
//	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
//	WebElement evenNumberDigitsLink;
//
//	@FindBy(xpath = "//a[contains(text(),'Squares')]")
//	WebElement squaresOfSortedArrayLink;
//
//	// FOR RUN BTN AND CODEEDITOR WE CAN USE THE SAME CODE AS THERE IN TRYEDITOR
//	// PAGE
//
//	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
//	WebElement practiceQuestionEditor;
//
//	@FindBy(css = "input[value='Submit']") // RUN BUTTON IS SAME FOR EDITOR ALSO
//	WebElement submitBtn; // OUTPUT ID LOCATOR IS SAME TOO
//
//	public void clickArrayGetStarted() {
//		action.scrollToElement(arrayGetStarted).perform();
//		action.click(arrayGetStarted).perform();
//
//	}
//
//	public void clickArraysInPython() {
//		action.scrollToElement(arraysInPythonLink).perform();
//		action.click(arraysInPythonLink).perform();
//
//	}
//
//	public void clickArraysUsingList() {
//		action.scrollToElement(arraysUsingListLink).perform();
//		action.click(arraysUsingListLink).perform();
//
//	}
//
//	public void clickBasicOperations() {
//		action.scrollToElement(basicOperationsLink).perform();
//		action.click(basicOperationsLink).perform();
//	}
//
//	public void clickApplicationsOfArray() {
//		action.scrollToElement(applicationsOfArrayLink).perform();
//		action.click(applicationsOfArrayLink).perform();
//	}
//
//	public void clickPracticeQuestionsLink() {
//		action.scrollToElement(practiceQuestionsLink).perform();
//		action.click(practiceQuestionsLink).perform();
//
//	}
//
//	public void clickTryHere() {
//		action.scrollToElement(tryHereLink).perform();
//		action.click(tryHereLink).perform();
//	}
//
//	// PRACTICE QUESTIONS PAGE LINK
//	public void clickSearchTheArray() {
//		action.scrollToElement(searchTheArrayLink).perform();
//		action.click(searchTheArrayLink).perform();
//
//	}
//
//	public void clickMaxConsecutiveOnes() {
//		action.scrollToElement(maxConsecutiveOnesLink).perform();
//		action.click(maxConsecutiveOnesLink).perform();
//	}
//
//	public void clickEvenNumberDigits() {
//		action.scrollToElement(evenNumberDigitsLink).perform();
//		action.click(evenNumberDigitsLink).perform();
//
//	}
//
//	public void clickSquaresOfSortedArray() {
//		action.scrollToElement(squaresOfSortedArrayLink).perform();
//		action.click(squaresOfSortedArrayLink).perform();
//
//	}
//
//	public void tryEditor_validCode_practiceQ1() {
//
////		String validCode1 = "def search(lst, value):\n" + "    if value in lst:\n"
////				+ "        print(\"Element Found\")\n" + "    else:\n" + "        print(\"Not Found\")\n" + "\n"
////				+ "# Example usage:\n" + "search([12, 23, 45, 67, 6, 90], 12)\n"
////				+ "search([12, 23, 45, 67, 6, 90], 25) #";
//
//		String validCode1 = "print 'hello'";
//		action.scrollToElement(practiceQuestionEditor).perform();
//
//		action.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND) // Use CONTROL if Windows
//				.sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();
//
//		action.sendKeys(practiceQuestionEditor, validCode1).perform();
//
//	}
//
//	public void tryEditor_validCode_practiceQ2() {
//		String validCode2 = "print 'hello'";
//		action.scrollToElement(practiceQuestionEditor).perform();
//		action.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND) // Use CONTROL if Windows
//				.sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();
//
//		action.sendKeys(practiceQuestionEditor, validCode2).perform();
//
//	}
//
//	public void tryEditor_validCode_practiceQ3() {
//		String validCode3 = "print 'hello'";
//		action.scrollToElement(practiceQuestionEditor).perform();
//		action.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND) // Use CONTROL if Windows
//				.sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();
//		action.sendKeys(practiceQuestionEditor, validCode3).perform();
//
//	}
//
//	public void tryEditor_validCode_practiceQ4() {
//		String validCode4 = "print 'hello'";
//		action.scrollToElement(practiceQuestionEditor).perform();
//		action.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND) // Use CONTROL if Windows
//				.sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();
//		action.sendKeys(practiceQuestionEditor, validCode4).perform();
//
//	}
//
//	public void tryEditor_invalidCode_practiceQ() {
//
//		action.scrollToElement(practiceQuestionEditor).perform();
//		action.sendKeys(practiceQuestionEditor, "abc").perform();
//	}
//
//	public void clickSubmit() {
//		action.scrollToElement(submitBtn).perform();
//		action.click(submitBtn).perform();
//
//	}
//
//	public String getURL() {
//		String afterNavigation = driver.getCurrentUrl();
//		return afterNavigation;
//	}
//
//
//
//}
