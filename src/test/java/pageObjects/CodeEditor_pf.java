package pageObjects;

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

//		this.browser = obj.return_browser();
//		this.driver = obj.initBrowser(browser);
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);

	}

	public void txtEditor_invalidCode() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));

		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue('prin(hello world\")');");

	}

	public void txtEditor_correctCode() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".CodeMirror")));
		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue('print(\"hello world\")');");
	}

	public void run() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", runBtn);
		action.scrollToElement(runBtn).perform();
		action.click(runBtn).perform();
	}

	public void output() {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", outputTxt);
		action.scrollToElement(outputTxt).perform();
		System.out.println(outputTxt.getText());
		// ele.getText(); can be used if required
		// here we may write code to capture the screenshot of the output after clicking
		// on run button
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

	// have to add code to handle alert while giving invalid code
}
