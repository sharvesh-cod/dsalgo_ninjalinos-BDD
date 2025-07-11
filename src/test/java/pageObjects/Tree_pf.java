package pageObjects;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Tree_pf {

	private WebDriver driver;
	private Wait<WebDriver> wait;

	Actions action = new Actions(driver);

	@FindBy(xpath = "//h5[text()='Tree']/../../..//a[text()='Get Started']")
	WebElement getStartedButton;

	@FindBy(xpath = "//a[text()='Overview of Trees']")
	WebElement overviewOfTree;

	@FindBy(xpath = "//a[text()='Terminologies']")
	WebElement terminologies;

	@FindBy(xpath = "//a[text()='Types of Trees']")
	WebElement typeofTrees;

	@FindBy(xpath = "//a[text()='Tree Traversals']")
	WebElement traversals;

	@FindBy(xpath = "//a[text()='Traversals-Illustration']")
	WebElement traIllustration;

	@FindBy(xpath = "//a[text()='Binary Trees']")
	WebElement binaryTrees;

	@FindBy(xpath = "//a[text()='Types of Binary']")
	WebElement typofBinary;

	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement impPython;

	@FindBy(xpath = "//a[text()='Binary Tree Traversals']")
	WebElement binaryTraversal;

	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement appofBinary;

	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement impOfBinary;

	@FindBy(xpath = "//a[text()='Binary Search']")
	WebElement binarySearch;
	@FindBy(xpath = "//a[text()='Implementation of BST']")
	WebElement impOfBST;

	@FindBy(tagName = "a")
	List<WebElement> treeLinks;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryHereButton;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;

	@FindBy(css = "div.CodeMirror-measure")
	WebElement textEditor;

	@FindBy(id = "output")
	WebElement outputTxt;

	@FindBy(xpath = "//*[text()='Practice Questions']")

	WebElement practQuestTree;

	public void Tree_pf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickGetStartedTree() {
		action.scrollToElement(getStartedButton).perform();
		action.click(getStartedButton).perform();

	}

	public void practice_Tree() {

		action.scrollToElement(practQuestTree).perform();
		action.click(practQuestTree).perform();
	}

	public void verifyLinks() {

		List<String> expectedLinks = Arrays.asList("Overview of trees", "Terminologies", "Types of Tree",
				"Tree Traversals", "Traversals-Illustration", "Binary Trees", "Types of Binary",
				"Implementation in Python", "Binary Tree Traversals", "Applications of Binary trees",
				"Implementation of Binary Trees", "Binary Search", "Implementation of BST");
		for (WebElement treeLink : treeLinks) {
			String treeData = treeLink.getText().trim();
			if (expectedLinks.contains(treeData)) {
				System.out.println("The listed links in tree page are" + treeData);
				System.out.println("The url are " + treeLink.getAttribute("href"));

			}
		}

	}

	public void navigate_OverviewofTree() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(overviewOfTree).perform();
		action.click(overviewOfTree).perform();
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.urlContains("/tree/overview-of-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
	}

	public void click_TryEditor() {
		tryHereButton.click();
		wait.until(ExpectedConditions.urlContains("/tryEditor"));
	}

	public String tryEditorPage(String tryEditorUrl) {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("Check the url of TryEditor Page" + afterNavigation);
		return tryEditorUrl;
	}

	public void clickRun_WithOutCode() {
		runButton.click();
	}

	public void txtEditor_correctCode() {

		action.scrollToElement(textEditor).perform();
		textEditor.sendKeys("print('Hello World')");
	}

	public void txtEditor_invalidCode() {

		action.scrollToElement(textEditor).perform();
		textEditor.sendKeys("('Hello World';)");
	}

	public void navigate_Terminilogy() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(terminologies).perform();
		action.click(terminologies).perform();
		wait.until(ExpectedConditions.urlContains("/tree/terminologies/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void typesOfTrees() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(typeofTrees).perform();
		action.click(typeofTrees).perform();
		wait.until(ExpectedConditions.urlContains("/tree/types-of-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void tree_Trav() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(traversals).perform();
		action.click(traversals).perform();
		wait.until(ExpectedConditions.urlContains("/tree-traversals/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void Traversal_Illustra() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(traIllustration).perform();
		action.click(traIllustration).perform();
		wait.until(ExpectedConditions.urlContains("/traversals-illustration/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void binary_Tree() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(binaryTrees).perform();
		action.click(binaryTrees).perform();
		wait.until(ExpectedConditions.urlContains("/binary-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void types_ofBinary() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(typofBinary).perform();
		action.click(typofBinary).perform();
		wait.until(ExpectedConditions.urlContains("/types-of-binary-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void Impl_in_Python() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(impPython).perform();
		action.click(impPython).perform();
		wait.until(ExpectedConditions.urlContains("/implementation-in-python/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void binary_Tree_Travers() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(binaryTraversal).perform();
		action.click(binaryTraversal).perform();
		wait.until(ExpectedConditions.urlContains("/binary-tree-traversals/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void app_of_binaryTrees() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(appofBinary).perform();
		action.click(appofBinary).perform();
		wait.until(ExpectedConditions.urlContains("/applications-of-binary-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void imp_of_binaryTrees() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(impOfBinary).perform();
		action.click(impOfBinary).perform();
		wait.until(ExpectedConditions.urlContains("/implementation-of-binary-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void binary_Search() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(binarySearch).perform();
		action.click(binarySearch).perform();
		wait.until(ExpectedConditions.urlContains("/binary-search-trees/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	public void Implement_OfBst() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "The current page url");
		action.scrollToElement(impOfBST).perform();
		action.click(impOfBST).perform();
		wait.until(ExpectedConditions.urlContains("/implementation-of-bst/"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);

	}

	// @T67
//	  Scenario: Navigate to Practice Questions page
//	    When The user clicks Practice Questions link
//	    Then The user should be navigated to the Practice Questions page
//
//	  @T68
//	  Scenario: View Practice Questions
//	   When The user clicks Practice Questions link
//	   Then The user should see the practice questions  

}
