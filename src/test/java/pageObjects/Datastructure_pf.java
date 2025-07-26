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

public class Datastructure_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;
//
	ExcelReaderFile excelReader;

	ConfigReader config;
	JavascriptExecutor js;
	String path;
	Alert alert;
	// Locators

	@FindBy(xpath = "//*[text()='Data Structures-Introduction']//../a")
	WebElement getstartedButton_dataStructures;

	@FindBy(xpath = "//*[text()='Time Complexity']")
	WebElement timecomplexityLink;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practiceQuestionsLink;

	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement tryhereLink;

	@FindBy(xpath = "//div[@class='CodeMirror-lines']")
	WebElement tryEditorbox;

	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;

	@FindBy(xpath = "//h4[text()='Data Structures-Introduction']")
	WebElement datastructuresPagetitle;

	@FindBy(xpath = "//p[text()='Time Complexity']")
	WebElement timecomplexitytitle;

	@FindBy(xpath = "//div[@align='left'] ")
	WebElement consoleoutpt;

	// div[@align='left']

	public Datastructure_pf(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.config = new ConfigReader();
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReaderFile(path);

		js = (JavascriptExecutor) driver;

	}

	public String datastructurespagetitle() {
		String text = datastructuresPagetitle.getText();
		return text;
	}

	public String timecomplexitytitle() {
		String text = timecomplexitytitle.getText();
		return text;
	}

	public void clickgetstartedDatastructures() {
		getstartedButton_dataStructures.click();
	}

	public void clickTimecomplexityLink() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		timecomplexityLink.click();
	}

	public String alert_message() {
		alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		return alertMsg;
	}

	public void clickPracticeQuestionsLink() {
		practiceQuestionsLink.click();
	}

	public void navigateback() {
		driver.navigate().back();
	}

	public void clickTryhereLink() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		tryhereLink.click();
	}

	public void tryeditorboxwithinvaliddata() {

		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue('prin(hello world\")');");
	}

	public void tryeditorboxvaliddata() {

		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue('print(\"hello world\")');");
	}

	public String editortxt() {
		String txt = tryEditorbox.getText();
		return txt;
	}

	public String tryeditorurl() {
		String tryeditorurl1 = driver.getCurrentUrl();
		return tryeditorurl1;
	}

	public String practiceQueURl() {
		String tryeditorurl = driver.getCurrentUrl();
		return tryeditorurl;
	}

	public void closealert() {
		driver.switchTo().alert().accept();
	}

	public void clickRunButton() {
		runButton.click();
	}

	public String alertconfim() {
		String msg = "NameError: name 'DsAlgoNew' is not defined on line 1";
		return msg;
	}

	public String consoletxt() {
		String msg = consoleoutpt.getText();
		return msg;
	}

	public void setinvalidcodefromExcel() throws IOException {
		String data = excelReader.getData("TextEditor", 1, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
	}

	public void setvalidcodefromExcel() throws IOException {
		String data = excelReader.getData("TextEditor", 1, 0);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
		js.executeScript(
				"let editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue(arguments[0]);",
				data);
	}
}