package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	String browser;
	Alert alert;
	JavascriptExecutor js;
	WebDriverWait wait;
	ConfigReader config;
	ExcelReaderFile excelReader;
	String path;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]/div")
	WebElement textEditor;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement runBtn;
	@FindBy(id = "output")
	WebElement outputTxt;

	public CodeEditor_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		this.config = new ConfigReader();
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReaderFile(path);
	}

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
		String data = excelReader.getData("textEditor", 1, 0);
		safeType(textEditor, data);
	}

	// keep this
	public void tryEditor_invalidCode() throws IOException {
		String data = excelReader.getData("textEditor", 1, 1);
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

	public void txtEditor_invalidCode() throws IOException, InterruptedException {
		String data = excelReader.getData("TextEditor", 1, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", runBtn);
		Thread.sleep(3000);
		action.scrollToElement(runBtn).perform();
		action.click(runBtn).perform();

	}

	public void txtEditor_correctCode() throws IOException, InterruptedException {
		String data = excelReader.getData("TextEditor", 1, 0);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", runBtn);
		action.click(runBtn).perform();
	}

	public void clickRunBtn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", runBtn);
		action.scrollToElement(runBtn).perform();
		action.click(runBtn).perform();
	}

	public String output_text() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", outputTxt);
		wait.until(ExpectedConditions.visibilityOf(outputTxt));
		action.scrollToElement(outputTxt).perform();
		String outputText = outputTxt.getText();
		return outputText;

	}

	public String alert_message() {
		alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		return alertMsg;
	}

	public void handle_alert() {
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.accept();

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