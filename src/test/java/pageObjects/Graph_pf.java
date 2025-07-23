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

	public Graph_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.config = new ConfigReader();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// background given
	public void background_getTograph() throws InterruptedException {
		driver.get(config.get_prop_value("testurl"));
		action.scrollToElement(loginGetStarted).perform();
		action.click(loginGetStarted).perform();
		wait.until(ExpectedConditions.visibilityOf(signin));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signin);
		action.click(signin).perform();
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", usernameField);
		action.click(usernameField).perform();
		action.sendKeys(usernameField, config.get_prop_value("username")).perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordField);
		passwordField.sendKeys(config.get_prop_value("password"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(graphGetStarted));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graphGetStarted);
		action.click(graphGetStarted).perform();
	}

	public void practice_Grpah() {
		action.scrollToElement(practQuestGraph).perform();
		action.click(practQuestGraph).perform();
	}

	public String outputText() {
		String OuputResult = outputTxt.getText();
		System.out.println(OuputResult);
		return OuputResult;
	}

	public void click_Graph() {
		action.scrollToElement(graph).perform();
		action.click(graph).perform();
	}

	public void click_TryEditor() throws InterruptedException {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereButton);
		action.click(tryHereButton).perform();
	}

	public void clickRun_WithOutCode() {
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
	}

	public String outputMsgGraph() {
		action.scrollToElement(outputTxt).perform();
		String text = outputTxt.getText();
		return text;
	}

	public String practicePage() {
		action.scrollToElement(practicePage).perform();
		String practiceQuestion = practicePage.getText();
		System.out.println(practiceQuestion);
		return practiceQuestion;

	}

	public void graphRepresent() throws InterruptedException {
		action.scrollToElement(graphRepr).perform();
		action.click(graphRepr).perform();

	}

	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

}
