package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverFactory;

public class Graph_pf {

	private WebDriver driver;
	private Wait<WebDriver> wait;
	private Actions action;

	@FindBy(xpath = "//a[text()='Get Started' and @href='graph']")
	WebElement graphGetStarted;
	@FindBy(xpath = "//a[@href='graph' and text()='Graph']")
	WebElement graph;
	@FindBy(xpath = "//a[contains(text(),'Graph Representations')]")
	WebElement graphRepr;
	@FindBy(tagName = "a")
	List<WebElement> graphLinks;
	@FindBy(xpath = "//a[contains(text(),'Try here')]")
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

	public Graph_pf() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	// background given
	public void background_getTograph() throws InterruptedException {
		driver.get("https://dsportalapp.herokuapp.com/");
		loginGetStarted.click();
		signin.click();
		usernameField.sendKeys("ninjalinos@work.com");
		passwordField.sendKeys("sdet218920@");
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(graphGetStarted));
		action.scrollToElement(graphGetStarted).perform();
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

	public void click_TryEditor() {
		action.scrollToElement(tryHereButton).perform();
		action.click(tryHereButton).perform();
	}

	public void clickRun_WithOutCode() {
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
	}

//	public void clickRun_InvalidCode() {
//		action.scrollToElement(runButton).perform();
//		action.click(runButton).perform();
//		wait.until(ExpectedConditions.alertIsPresent());
//
//	}

//	public void txtEditor_correctCode() throws IOException, InterruptedException {
//
//		action.scrollToElement(textEditor).perform();
//		action.sendKeys(ExcelReaderFile.getData(path, "TextEditor", 1, 0)).perform();
//		Thread.sleep(5000);
//		action.click(runButton).perform();
//		Thread.sleep(5000);
//	}

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
