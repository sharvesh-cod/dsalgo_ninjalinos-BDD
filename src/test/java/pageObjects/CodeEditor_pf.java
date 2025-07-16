package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.Passing_Driver;

public class CodeEditor_pf {

	private WebDriver driver;
	private Actions action;
	String browser;
	Alert alert;
	JavascriptExecutor js;

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

		PageFactory.initElements(driver, this);

	}

	public void txtEditor_invalidCode() {
		js.executeScript("let editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue('prin(hello world\")');");

	}

	public void txtEditor_correctCode() {

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

	public void handle_alert() {
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

	// have to add code to handle alert while giving invalid code
}
