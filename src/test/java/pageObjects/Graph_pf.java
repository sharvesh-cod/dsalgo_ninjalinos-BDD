package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class Graph_pf {

	private WebDriver driver;
	WebDriverWait wait;
	private Actions action;
	String browser;

	@FindBy(xpath = "//a[text()='Get Started' and @href='graph']")
	WebElement graphGetStarted;
	@FindBy(xpath = "//a[@href='graph' and text()='Graph']")
	WebElement graph;
	@FindBy(xpath = "//a[contains(text(),'Graph Representations')]")
	WebElement graphRepr;
	@FindBy(tagName = "a")
	List<WebElement> graphLinks;
	@FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
	WebElement tryHereButton;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement runButton;
	@FindBy(xpath = "//div[@class='CodeMirror-measure']//span")
	WebElement textEditor;
	@FindBy(id = "output")
	WebElement outputTxt;
	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practQuestGraph;
	// background
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signin;
	@FindBy(id = "id_username")
	private WebElement usernameField;
	@FindBy(id = "id_password")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement loginGetStarted;
	@FindBy(id = "content")
	WebElement practicePage;
	CodeEditor_pf codeEditor;
	ConfigReader config;
	ExcelReaderFile excelReader;
	String path;
	JavascriptExecutor js;

	public Graph_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.config = new ConfigReader();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		this.path = config.get_prop_value("path");
		this.excelReader = new ExcelReaderFile(path);
	}

	// background given
	public void background_getTograph() throws InterruptedException, IOException {
		driver.get(config.get_prop_value("testurl"));
		action.scrollToElement(loginGetStarted).perform();
		action.click(loginGetStarted).perform();
		wait.until(ExpectedConditions.visibilityOf(signin));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signin);
		action.click(signin).perform();
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", usernameField);
		action.click(usernameField).perform();
		String data1 = excelReader.getData("Credentials", 1, 0);
		usernameField.sendKeys(data1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordField);
		String data2 = excelReader.getData("Credentials", 1, 1);
		passwordField.sendKeys(data2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(graphGetStarted));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graphGetStarted);
		action.click(graphGetStarted).perform();
	}

	public void practice_Grpah() {
		wait.until(ExpectedConditions.visibilityOf(practQuestGraph));
		action.scrollToElement(practQuestGraph).perform();
		action.click(practQuestGraph).perform();
	}

	public String outputText() {
		String OuputResult = outputTxt.getText();
		System.out.println(OuputResult);
		return OuputResult;
	}

	public void click_Graph() {
		wait.until(ExpectedConditions.visibilityOf(graph));
		action.scrollToElement(graph).perform();
		action.click(graph).perform();
	}

	public void click_TryEditor() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tryHereButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereButton);
		action.scrollToElement(tryHereButton).perform();
		action.click(tryHereButton).perform();
		wait.until(ExpectedConditions.titleContains("Assessment"));
	}

	public void clickRun_WithOutCode() {
		wait.until(ExpectedConditions.visibilityOf(runButton));
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
	}

	public String outputMsgGraph() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", outputTxt);
		action.scrollToElement(outputTxt).perform();
		String text = outputTxt.getText();
		return text;
	}

	public String practicePage() {
		wait.until(ExpectedConditions.visibilityOf(practicePage));
		action.scrollToElement(practicePage).perform();
		String practiceQuestion = practicePage.getText();
		System.out.println(practiceQuestion);
		return practiceQuestion;

	}

	public void graphRepresent() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(graphRepr));
		action.scrollToElement(graphRepr).perform();
		action.click(graphRepr).perform();
		wait.until(ExpectedConditions.titleContains("Graph Representations"));

	}

	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

}
