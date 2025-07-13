package pageObjects;

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

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
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
		PageFactory.initElements(driver, this);

	}

	public void txtEditor_invalidCode() {

		action.scrollToElement(textEditor).perform();
		textEditor.sendKeys("prin('Hello World')");
	}

	public void txtEditor_correctCode() {

		action.scrollToElement(textEditor).perform();
		textEditor.sendKeys("print('Hello World')");
	}

	public void run() {

		action.scrollToElement(runBtn).perform();
		action.click(runBtn).perform();
	}

	public void output() {

		action.scrollToElement(outputTxt).perform();
		// ele.getText(); can be used if required
		// here we may write code to capture the screenshot of the output after clicking
		// on run button
	}

	// have to add code to handle alert while giving invalid code
}
