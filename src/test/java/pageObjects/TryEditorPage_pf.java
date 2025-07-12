package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditorPage_pf {

	WebDriver driver;
	Actions action = new Actions(driver);

	public TryEditorPage_pf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "input") // Check with others to know whether its correct id locator
	WebElement codeEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;

	// we will have to check for dynamic output here

	public void enterCode(String code) {
		codeEditor.clear();
		codeEditor.sendKeys(code);
	}
// we have to Implement Data Driven with excel to enter code

	public void clickRun() {
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
		runButton.click();
	}

	public void checkOutput() {
		// We have to check whether we are getting output according to the data entered
		// dynamically
	}

}

//create weblememnt for output