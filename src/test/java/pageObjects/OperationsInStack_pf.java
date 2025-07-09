package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsInStack_pf {

	private WebDriver driver;
	Actions action = new Actions(driver);

	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationStackLInk;

	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationStackLink;

	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practiceQ;

	@FindBy(xpath = "//div[2]/following::*/div[2]/a")
	WebElement tryHereStack;

	public OperationsInStack_pf(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public OperationsInStack_pf(WebElement ele) {

		action.scrollToElement(ele).perform();
		action.click(ele).perform();
	}

}
