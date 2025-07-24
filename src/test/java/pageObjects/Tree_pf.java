package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.Passing_Driver;
import utils.ConfigReader;

public class Tree_pf {

	private WebDriver driver;
	private Actions action;
	String browser;
	WebDriverWait wait;

	@FindBy(xpath = "//h5[text()='Tree']/../../..//a[contains(text(),'Get Started' )]")
	WebElement treegetStartedButton;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Overview of Trees']")
	WebElement overviewOfTree;
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signin;
	@FindBy(id = "id_username")
	private WebElement usernameField;
	@FindBy(id = "id_password")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement loginGetStarted;
	@FindBy(xpath = "//a[contains(text(),'Terminologies')]")
	WebElement terminologies;
	@FindBy(xpath = "//h4[text()='Tree']/../../../..//div[2]//a[text()='Types of Trees']")
	WebElement typeofTrees;
	@FindBy(xpath = "//a[contains(text(),'Tree Traversals')]")
	WebElement traversals;
	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]")
	WebElement traIllustration;
	@FindBy(xpath = "//a[contains(text(),'Binary Trees')]")
	WebElement binaryTrees;
	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")
	WebElement typofBinary;
	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement impPython;
	@FindBy(xpath = "//a[text()='Binary Tree Traversals']")
	WebElement binaryTraversal;
	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement appofBinary;
	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement impOfBinary;
	@FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")
	WebElement binarySearch;
	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]")
	WebElement impOfBST;
	@FindBy(tagName = "a")
	List<WebElement> treeLinks;
	@FindBy(xpath = "//a[contains(text(),'Try here')]")
	WebElement tryHereButton;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;
	@FindBy(xpath = "//div[@class='CodeMirror-measure']//span")
	WebElement textEditor;
	@FindBy(id = "output")
	WebElement outputTxt;
	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement practQuestTree;
	CodeEditor_pf codeEditor;
	ConfigReader config;

	public Tree_pf(Passing_Driver passdr) throws IOException {
		this.driver = passdr.getDriver();
		this.action = new Actions(driver);
		this.config = new ConfigReader();
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	// background given
	public void background_getToTree() throws InterruptedException {
		driver.get(config.get_prop_value("testurl"));
		action.scrollToElement(loginGetStarted).perform();
		action.click(loginGetStarted).perform();
		wait.until(ExpectedConditions.visibilityOf(signin));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signin);
		action.click(signin).perform();
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", usernameField);
		action.click(usernameField).perform();
		action.sendKeys(usernameField, config.get_prop_value("username")).perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordField);
		passwordField.sendKeys(config.get_prop_value("password"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(treegetStartedButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treegetStartedButton);
		action.click(treegetStartedButton).perform();
	}

	public void practice_Tree() {

		action.scrollToElement(practQuestTree).perform();
		action.click(practQuestTree).perform();
	}

	public String outputText() {
		String OuputResult = outputTxt.getText();
		System.out.println(OuputResult);
		return OuputResult;
	}

	public void scrollDownTree() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 600);");
		Thread.sleep(3000);
	}

	public void verifyLinks() {
		List<String> expectedLinks = Arrays.asList("Overview of trees", "Terminologies", "Types of Tree",
				"Tree Traversals", "Traversals-Illustration", "Binary Trees", "Types of Binary",
				"Implementation in Python", "Binary Tree Traversals", "Applications of Binary trees",
				"Implementation of Binary Trees", "Binary Search", "Implementation of BST");
		for (WebElement treeLink : treeLinks) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeLink);
			String treeData = treeLink.getText().trim();
			if (expectedLinks.contains(treeData)) {
				System.out.println("The listed links in tree page are" + treeData);
				System.out.println("The url are " + treeLink.getAttribute("href"));

			}
		}

	}

	public void click_Overview() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(overviewOfTree));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300);");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTree);
		action.scrollToElement(overviewOfTree).perform();
		action.click(overviewOfTree).perform();
	}

	public String navigate_OverviewofTree() throws InterruptedException {
		wait.until(ExpectedConditions.titleContains("Overview of Trees"));
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

//given for TryHere
	public void click_TryEditor() {
		wait.until(ExpectedConditions.visibilityOf(tryHereButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereButton);
		action.scrollToElement(tryHereButton).perform();
		action.click(tryHereButton).perform();
		wait.until(ExpectedConditions.titleContains("Assessment"));
	}

	public void clickRun_WithOutCode() {
		wait.until(ExpectedConditions.visibilityOf(runButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", runButton);
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
	}

	public void click_Terminilogy() {
		wait.until(ExpectedConditions.visibilityOf(terminologies));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", terminologies);
		action.scrollToElement(terminologies).perform();
		action.click(terminologies).perform();
		wait.until(ExpectedConditions.urlContains("/tree/terminologies/"));

	}

	public String navigate_To_Terminilogy() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;

	}

	public void typesOfTrees() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(typeofTrees));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typeofTrees);
		action.scrollToElement(typeofTrees).perform();
		action.click(typeofTrees).perform();
		wait.until(ExpectedConditions.urlContains("/tree/types-of-trees/"));
	}

	public String navigation_typeOfTrees() {
		String afterNavigation = driver.getCurrentUrl();
		return afterNavigation;
	}

	public void tree_Trav() {
		wait.until(ExpectedConditions.visibilityOf(traversals));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traversals);
		action.scrollToElement(traversals).perform();
		action.click(traversals).perform();
		wait.until(ExpectedConditions.urlContains("/tree/tree-traversals/"));

	}

	public String navigation_treeTrav() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

	public void Traversal_Illustra() {
		wait.until(ExpectedConditions.visibilityOf(traIllustration));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traIllustration);
		action.scrollToElement(traIllustration).perform();
		action.click(traIllustration).perform();
		// wait.until(ExpectedConditions.urlContains("/tree/traversals-illustration/"));

	}

	public String navigate_Trave_Ill() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;

	}

	public void binary_Tree() {
		wait.until(ExpectedConditions.visibilityOf(binaryTrees));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTrees);
		action.scrollToElement(binaryTrees).perform();
		action.click(binaryTrees).perform();
		wait.until(ExpectedConditions.urlContains("/tree/binary-trees/"));
	}

	public String navigate_binaryTree() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

	public void types_ofBinary() {
		wait.until(ExpectedConditions.visibilityOf(typofBinary));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typofBinary);
		action.scrollToElement(typofBinary).perform();
		action.click(typofBinary).perform();
		wait.until(ExpectedConditions.urlContains("tree/types-of-binary-trees/"));
	}

	public String navigate_typesOfBinary() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

	public void Impl_in_Python() {
		wait.until(ExpectedConditions.visibilityOf(impPython));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", impPython);
		action.scrollToElement(impPython).perform();
		action.click(impPython).perform();
		wait.until(ExpectedConditions.urlContains("/tree/implementation-in-python/"));
	}

	public void navigat_Imp_in_Python() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
	}

	public void binary_Tree_Travers() {
		wait.until(ExpectedConditions.visibilityOf(binaryTraversal));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTraversal);
		action.scrollToElement(binaryTraversal).perform();
		action.click(binaryTraversal).perform();
		wait.until(ExpectedConditions.urlContains("/tree/binary-tree-traversals/"));
	}

	public String navigate() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

	public void app_of_binaryTrees() {
		wait.until(ExpectedConditions.visibilityOf(appofBinary));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appofBinary);
		action.scrollToElement(appofBinary).perform();
		action.click(appofBinary).perform();

	}

	public void imp_of_binaryTrees() {
		wait.until(ExpectedConditions.visibilityOf(impOfBinary));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", impOfBinary);
		action.scrollToElement(impOfBinary).perform();
		action.click(impOfBinary).perform();

	}

	public void binary_Search() {
		wait.until(ExpectedConditions.visibilityOf(binarySearch));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(20, 13);");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binarySearch);
		action.scrollToElement(binarySearch).perform();
		action.click(binarySearch).perform();

	}

	public void Implement_OfBst() {
		wait.until(ExpectedConditions.visibilityOf(impOfBST));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", impOfBST);
		action.scrollToElement(impOfBST).perform();
		action.click(impOfBST).perform();

	}

	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

	public void clickTryHere_travIllu() {
		wait.until(ExpectedConditions.visibilityOf(traIllustration));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traIllustration);
		action.scrollToElement(traIllustration).perform();
		action.click(traIllustration).perform();
		wait.until(ExpectedConditions.visibilityOf(tryHereButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHereButton);
		action.click(tryHereButton).perform();
	}

}
