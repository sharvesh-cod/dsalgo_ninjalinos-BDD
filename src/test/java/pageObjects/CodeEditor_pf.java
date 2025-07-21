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
import utils.ExcelReaderFile;

public class CodeEditor_pf {

	private WebDriver driver;
	private Actions action;
	String browser;
	Alert alert;
	JavascriptExecutor js;
	WebDriverWait wait;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]/div")
	WebElement textEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;

	@FindBy(id = "output")
	WebElement outputTxt;

	public CodeEditor_pf(Passing_Driver passdr) {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);

	}

//	public void txtEditor_invalidCode() {
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
//
//		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
//				+ "editor.setValue('prin(hello world\")');");
	public void txtEditor_invalidCode() throws IOException {
		// String path = configReader.get_prop_value("path");
		String path = "C:\\Users\\HP\\git\\dsalgo_ninjalinos-BDD\\src\\test\\resources\\testdata.xlsx";
		String data = ExcelReaderFile.getData(path, "textEditor", 1, 0);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));

		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
		action.scrollToElement(textEditor).perform();
		action.click(runBtn).perform();

	}

//	public void txtEditor_correctCode() {
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
//		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
//				+ "editor.setValue('print(\"Hello World\")');");
	public void txtEditor_correctCode() throws IOException, InterruptedException {
		// String path = configReader.get_prop_value("path");
		String path = "C:\\Users\\HP\\git\\dsalgo_ninjalinos-BDD\\src\\test\\resources\\testdata.xlsx";
		String data = ExcelReaderFile.getData(path, "textEditor", 1, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));

		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
		action.scrollToElement(textEditor).perform();
		action.click(runBtn).perform();
	}

	public void clickRunBtn() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", runBtn);
		action.scrollToElement(runBtn).perform();
		action.click(runBtn).perform();
	}

	public String output_text() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", outputTxt);
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
		alert = driver.switchTo().alert();

		alert.accept();

	}

}
