package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;

public class TryEditorPage_pf {

	private WebDriver driver;
	private Actions action;
	WebDriverWait wait;

	public TryEditorPage_pf(Passing_Driver passdr) {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);

	}

//	public TryEditorPage_pf(WebDriver driver) {
//		this.driver = driver;
//		this.action = new Actions(driver);
//		PageFactory.initElements(driver, this);
//	}

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
	WebElement codeEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;

	@FindBy(id = "output")
	WebElement outputTxt;

	// we will have to check for dynamic output here
// we have to Implement Data Driven with excel to enter code

	public void tryEditor_validCode() {
		action.scrollToElement(codeEditor).perform();
		action.sendKeys(codeEditor, "print('Hello World')").perform();
	}

	public void tryEditor_invalidCode() {
		action.scrollToElement(codeEditor).perform();
		action.sendKeys(codeEditor, "abc").perform();
	}

	public void clickRun() {
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
		// runButton.click();
	}

	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

	public String outputText() {
		wait.until(ExpectedConditions.visibilityOf(outputTxt));
		String OutputResult = outputTxt.getText();
		// System.out.println(OutputResult);
		return OutputResult;
	}

	// New method to handle alert and return alert message text
	public String alertMsg() {
		try {
			// Wait until alert is present
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			// Get alert text
			String alertText = alert.getText();
			// Accept (close) the alert
			alert.accept();
			return alertText;

		} catch (Exception e) {
			System.out.println("No alert appeared: " + e.getMessage());
			return null;
		}
	}

//*****************************************************************************************
//	public void tryEditor_validCode() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(codeEditor));
//		action.scrollToElement(codeEditor).perform();
//		action.sendKeys(codeEditor, "print('Hello World')").perform();
//	}
//
//	public void tryEditor_invalidCode() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(codeEditor));
//		action.scrollToElement(codeEditor).perform();
//		action.sendKeys(codeEditor, "abc").perform();
//	}
//
//	public void clickRun() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(runButton));
//		action.scrollToElement(runButton).perform();
//		action.click(runButton).perform();
//		// runButton.click();
//	}
//
//	public void getErrMsg_NoCode() {
//		System.out.println("No Error Alert Found, report bug");
//	}
//
//	public String outputText() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(outputTxt));
//		String OutputResult = outputTxt.getText();
//		// System.out.println(OutputResult);
//		return OutputResult;
//	}
//
//	// New method to handle alert and return alert message text
//	public String alertMsg() {
//		try {
//			// Wait until alert is present
//			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//			// Get alert text
//			String alertText = alert.getText();
//			// Accept (close) the alert
//			alert.accept();
//			return alertText;
//
//		} catch (Exception e) {
//			System.out.println("No alert appeared: " + e.getMessage());
//			return null;
//		}
//	}

}
