package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeEditor_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div[6]")
	WebElement textEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;

	@FindBy(id = "output")
	WebElement outputTxt;

	public CodeEditor_pf(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void txtEditor_invalidCode(WebElement ele) {

		action.scrollToElement(ele).perform();
		action.sendKeys("prin('Hello World')").perform();
	}

	public void txtEditor_correctCode(WebElement ele) {

		action.scrollToElement(ele).perform();
		action.sendKeys("print('Hello World')").perform();
	}

	public void runStack(WebElement ele) {

		action.scrollToElement(ele).perform();
		action.click(ele).perform();
	}

	public void output(WebElement ele) {

		action.scrollToElement(ele).perform();
		// ele.getText(); can be used if required
		// here we may write code to capture the screenshot of the output after clicking
		// on run button
	}

	// have to add code to handle alert while giving invalid code
}
