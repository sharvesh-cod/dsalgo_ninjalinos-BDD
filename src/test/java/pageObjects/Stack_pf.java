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

public class Stack_pf {

	private WebDriver driver;
	private Actions action;
	String browser;
	WebDriverWait wait;
	ExcelReaderFile excelReader;
	JavascriptExecutor js;
	CommonMethod cmnMethod;

	@FindBy(xpath = "//h5[text()='Stack']/../../..//a[text()='Get Started']")
	WebElement stackBtn;

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationsStackBtn;

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackBtn;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationStackBtn;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement stackPracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereStack;

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

	public Stack_pf(Passing_Driver passdr) throws IOException {

		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		this.cmnMethod = new CommonMethod(passdr);
		this.excelReader = new ExcelReaderFile();

	}

	public void background_stack() throws IOException {
		cmnMethod.get_testUrl();
		launchBtn.click();
		signinBtn.click();
		String data1 = excelReader.getData("Credentials", 1, 0);
		userName.sendKeys(data1);
		String data2 = excelReader.getData("Credentials", 1, 1);
		pwd.sendKeys(data2);
		logInBtn.click();

	}

	public void stack_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stackBtn);

		action.scrollToElement(stackBtn).perform();
		action.click(stackBtn).perform();
	}

	public void opreations_stack_btn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", operationsStackBtn);

		action.scrollToElement(operationsStackBtn).perform();
		action.click(operationsStackBtn).perform();
	}

	public void implementation_stack_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationStackBtn);
		action.scrollToElement(implementationStackBtn).perform();
		action.click(implementationStackBtn).perform();
	}

	public void application_stack_btn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationStackBtn);
		action.scrollToElement(applicationStackBtn).perform();
		action.click(applicationStackBtn).perform();
	}

	public void practice_stack() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stackPracticeQ);
		action.scrollToElement(stackPracticeQ).perform();
		action.click(stackPracticeQ).perform();
	}

	public void tryhere_stack() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereStack);
		action.scrollToElement(tryHereStack).perform();
		action.click(tryHereStack).perform();
	}

	public void logout_stack() {
		signOut.click();

	}

}
