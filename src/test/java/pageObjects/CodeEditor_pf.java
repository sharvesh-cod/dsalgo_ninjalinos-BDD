//**************       AS SUFFESTED BY CHATGPT FOR FIREFOX    ******************************

package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
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

public class CodeEditor_pf {

	private WebDriver driver;
	private Actions action;
	JavascriptExecutor js;
	WebDriverWait wait;
	ConfigReader config;
	ExcelReaderFile excelReader;
	String path;

	public CodeEditor_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
		this.config = new ConfigReader();
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReaderFile(path);
	}

	// Elements
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]/div")
	WebElement textEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;

	@FindBy(id = "output")
	WebElement outputTxt;

	// Helper methods
	// have to keep this
	private void safeType(WebElement element, String code) {
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click().sendKeys(code).perform();
	}

	// keep this
	private void safeClick(WebElement element) {
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// Actions //keep this
	public void tryEditor_validCode() throws IOException {
		// String path = config.get_prop_value("path");
		// ExcelReader reader = new ExcelReader(path, "TextEditor");
		String data = excelReader.getData("textEditor", 1, 0);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));

//		js.executeScript(
//				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
//				data);
		safeType(textEditor, data);
	}

	// keep this
	public void tryEditor_invalidCode() throws IOException {
		// String path = config.get_prop_value("path");
		// ExcelReader reader = new ExcelReader(path, "TextEditor");
		String data = excelReader.getData("textEditor", 1, 1);
		// String data = ExcelReader.getData(path, "TextEditor", 1, 1);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));

//		js.executeScript(
//				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
//				data);
		safeType(textEditor, data);
	}

	// keep this
	public void clickRun() {
		safeClick(runBtn);
	}

	// keep this
	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

	public String output_text() {
		wait.until(ExpectedConditions.visibilityOf(outputTxt));
		String outputText = outputTxt.getText();
		return outputText;
	}

	// keep it
	public String alertMsg() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			System.out.println("No alert appeared: " + e.getMessage());
			return null;
		}
	}
}
