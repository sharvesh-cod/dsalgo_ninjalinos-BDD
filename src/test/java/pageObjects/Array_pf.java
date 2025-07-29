
//============  FINAL WORKING CODE ==============================

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
import utils.ExcelReaderFile;

public class Array_pf {

	private WebDriver driver;
	private WebDriverWait wait;
	ExcelReaderFile excelReader;
	private CommonMethod cmnMethod;

	public Array_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();

		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.cmnMethod = new CommonMethod(passdr);

		this.excelReader = new ExcelReaderFile();
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

	// ============ BACKGROUND ===============

	public void background_array() throws IOException {
		cmnMethod.get_testUrl();
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

	public void enterValidCodeInPracticeEditor(String code) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestionEditor);
		wait.until(ExpectedConditions.visibilityOf(practiceQuestionEditor));
		practiceQuestionEditor.click();

		// Use Actions to clear and type code like a user
		Actions actions = new Actions(driver);
		actions.moveToElement(practiceQuestionEditor).click().keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
				.sendKeys(Keys.DELETE).sendKeys(code).perform();
	}

	public void tryEditor_validCode_practiceQ1() throws IOException {

		String validCode1 = excelReader.getData("TextEditor", 1, 0);

		enterValidCodeInPracticeEditor(validCode1);
	}

	public void tryEditor_validCode_practiceQ2() throws IOException {
		String validCode2 = excelReader.getData("TextEditor", 1, 0);
		enterValidCodeInPracticeEditor(validCode2);
	}

	public void tryEditor_validCode_practiceQ3() throws IOException {
		String validCode3 = excelReader.getData("TextEditor", 1, 0);
		enterValidCodeInPracticeEditor(validCode3);
	}

	public void tryEditor_validCode_practiceQ4() throws IOException {
		String validCode4 = excelReader.getData("TextEditor", 1, 0);
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
