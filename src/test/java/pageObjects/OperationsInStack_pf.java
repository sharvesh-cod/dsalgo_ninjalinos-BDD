package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooks;

public class OperationsInStack_pf {

	private WebDriver driver;
	private Actions action;

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackLink;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationStackLink;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement stackPracticeQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereStack;

	public OperationsInStack_pf(Hooks hooks) {

		driver = hooks.getDriver();
		action = new Actions(driver);
		PageFactory.initElements(driver, this);

	}

	public void implementation_stack() {

		action.scrollToElement(implementationStackLink).perform();
		action.click(implementationStackLink).perform();
	}

	public void appliation_stack() {

		action.scrollToElement(applicationStackLink).perform();
		action.click(applicationStackLink).perform();
	}

	public void practice_stack() {

		action.scrollToElement(stackPracticeQ).perform();
		action.click(stackPracticeQ).perform();
	}

	public void tryhere_stack() {

		action.scrollToElement(tryHereStack).perform();
		action.click(tryHereStack).perform();
	}

	public String url() {
		String currentPageUrl = driver.getCurrentUrl();
		return currentPageUrl;
	}

}
