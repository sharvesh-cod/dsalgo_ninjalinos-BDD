package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeQuestionsPage_pf {

	WebDriver driver;
	Actions action = new Actions(driver);

	public PracticeQuestionsPage_pf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(css = "textarea#editor")
//	WebElement practiceQuestionEditor;

	@FindBy(xpath = "//a[text()='Search the array']")
	WebElement searchTheArrayLink;

	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveOnesLink;

	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	WebElement evenNumberDigitsLink;

	@FindBy(xpath = "//a[text()='Squares of a Sorted Array']")
	WebElement squaresOfSortedArrayLink;

	// FOR RUN BTN AND CODEEDITOR WE CAN USE THE SAME CODE AS THERE IN TRYEDITOR
	// PAGE

	@FindBy(css = "textarea#editor")
	WebElement practiceQuestionEditor;

	@FindBy(css = "input[value='Submit']")
	WebElement submitBtn;

	public void clickSearchTheArray() {
		action.scrollToElement(searchTheArrayLink).perform();
		action.click(searchTheArrayLink).perform();

	}

	public void clickMaxConsecutiveOnes() {
		action.scrollToElement(maxConsecutiveOnesLink).perform();
		action.click(maxConsecutiveOnesLink).perform();
	}

	public void clickEvenNumberDigits() {
		action.scrollToElement(evenNumberDigitsLink).perform();
		action.click(evenNumberDigitsLink).perform();

	}

	public void clickSquaresOfSortedArray() {
		action.scrollToElement(squaresOfSortedArrayLink).perform();
		action.click(squaresOfSortedArrayLink).perform();

	}

	// For writing question can we use codeEditor and run button from Try Editor
	// page

}
