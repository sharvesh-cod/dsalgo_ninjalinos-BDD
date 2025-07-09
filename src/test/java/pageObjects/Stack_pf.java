package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationsStackBtn;

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackBtn;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement pplicationStackBtn;

	public Stack_pf(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public Stack_pf(WebElement ele) {

		action.scrollToElement(ele).perform();
		action.click(ele).perform();
	}

}
