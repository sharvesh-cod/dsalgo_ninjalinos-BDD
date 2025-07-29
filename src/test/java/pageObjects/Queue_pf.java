package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ExcelReaderFile;

public class Queue_pf {

	private WebDriver driver;
	Actions action;
	String browser;
	WebDriverWait wait;
	ExcelReaderFile excelReader;
	JavascriptExecutor js;
	CommonMethod cmnMethod;

	@FindBy(xpath = "//h5[text()='Queue']/../../..//a[text()='Get Started']")
	WebElement QueueBtn;

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement implementationQueuePythonBtn;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement implementationUseCollectionBtn;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement implementationUseArrayBtn;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement queueOperationsBtn;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement queuePracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereQueue;
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

	public Queue_pf(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		this.cmnMethod = new CommonMethod(passdr);
		this.excelReader = new ExcelReaderFile();
//		this.path = excelReader.get_xlpath();

	}

	public void background_queue() throws IOException {
		cmnMethod.get_testUrl();
		launchBtn.click();
		signinBtn.click();
		String data1 = excelReader.getData("Credentials", 1, 0);
		userName.sendKeys(data1);
		String data2 = excelReader.getData("Credentials", 1, 1);
		pwd.sendKeys(data2);
		logInBtn.click();

	}

	public void queue_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QueueBtn);

		action.scrollToElement(QueueBtn).perform();
		action.click(QueueBtn).perform();
	}

	public void implementation_queue_python_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationQueuePythonBtn);

		action.scrollToElement(implementationQueuePythonBtn).perform();
		action.click(implementationQueuePythonBtn).perform();
	}

	public void implementation_collection_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				implementationUseCollectionBtn);
		action.scrollToElement(implementationUseCollectionBtn).perform();
		action.click(implementationUseCollectionBtn).perform();
	}

	public void implementation_array_btn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationUseArrayBtn);
		action.scrollToElement(implementationUseArrayBtn).perform();
		action.click(implementationUseArrayBtn).perform();
	}

	public void queue_operations_btn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", queueOperationsBtn);
		action.scrollToElement(queueOperationsBtn).perform();
		action.click(queueOperationsBtn).perform();
	}

	public void practice_queue() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", queuePracticeQ);
		action.scrollToElement(queuePracticeQ).perform();
		action.click(queuePracticeQ).perform();
	}

	public void tryhere_queue() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereQueue);
		action.scrollToElement(tryHereQueue).perform();
		action.click(tryHereQueue).perform();
	}

	public void logout_queue() {
		signOut.click();

	}

}
