package pageObjects;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverFactory;

public class Tree_pf {

	private WebDriver driver;
	private Wait<WebDriver> wait;
	private Actions action;

	@FindBy(xpath = "//h5[text()='Tree']/../../..//a[contains(text(),'Get Started' )]")
	WebElement treegetStartedButton;
	@FindBy(xpath = "//a[contains(text(),'Overview of Trees')]")
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
	@FindBy(xpath = "//a[contains(text(),'Types of Binary')]")
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

	public Tree_pf() {
		// DsAlgoHooks hooks = new DsAlgoHooks();
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	// background given
	public void background_getToTree() throws InterruptedException {
		driver.get("https://dsportalapp.herokuapp.com/");
		loginGetStarted.click();
		signin.click();
		usernameField.sendKeys("ninjalinos@work.com");
		passwordField.sendKeys("sdet218920@");
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(treegetStartedButton));
		action.scrollToElement(treegetStartedButton).perform();
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

	public void scrollDownTree() {
		action.scrollToElement(overviewOfTree).perform();
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

	public void click_Overview() {
		action.scrollToElement(overviewOfTree).perform();
		action.click(overviewOfTree).perform();
		wait.until(ExpectedConditions.urlContains("/tree/overview-of-trees/"));
	}

	public String navigate_OverviewofTree() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

//given for TryHere
	public void click_TryEditor() {
		action.scrollToElement(tryHereButton).perform();
		action.click(tryHereButton).perform();
	}

	public void clickRun_WithOutCode() {
		action.scrollToElement(runButton).perform();
		action.click(runButton).perform();
	}

	public void txtEditor_correctCode() {
		action.scrollToElement(textEditor).perform();
		action.sendKeys(textEditor, "print('Hello World')").perform();
	}

	public void txtEditor_invalidCode() {
		action.scrollToElement(textEditor).perform();
		action.sendKeys(textEditor, "pnt('Hello World');").perform();
	}

	public void click_Terminilogy() {
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
		action.scrollToElement(typeofTrees).perform();
		action.click(typeofTrees).perform();
		wait.until(ExpectedConditions.urlContains("/tree/types-of-trees/"));
	}

	public String navigation_typeOfTrees() {
		String afterNavigation = driver.getCurrentUrl();
		return afterNavigation;
	}

	public void tree_Trav() {
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
		action.scrollToElement(typofBinary).perform();
		action.click(typofBinary).perform();
		wait.until(ExpectedConditions.urlContains("/tree/types-of-binary-trees/"));
	}

	public String navigate_typesOfBinary() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
		return afterNavigation;
	}

	public void Impl_in_Python() {
		action.scrollToElement(impPython).perform();
		action.click(impPython).perform();
		wait.until(ExpectedConditions.urlContains("/tree/implementation-in-python/"));
	}

	public void navigat_Imp_in_Python() {
		String afterNavigation = driver.getCurrentUrl();
		System.out.println("check after click" + afterNavigation);
	}

	public void binary_Tree_Travers() {
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
		action.scrollToElement(appofBinary).perform();
		action.click(appofBinary).perform();

	}

	public void imp_of_binaryTrees() {
		action.scrollToElement(impOfBinary).perform();
		action.click(impOfBinary).perform();

	}

	public void binary_Search() {
		action.scrollToElement(binarySearch).perform();
		action.click(binarySearch).perform();

	}

	public void Implement_OfBst() {
		action.scrollToElement(impOfBST).perform();
		action.click(impOfBST).perform();

	}

	public void getErrMsg_NoCode() {
		System.out.println("No Error Alert Found, report bug");
	}

	public void clickTryHere_travIllu() {

		action.scrollToElement(traIllustration).perform();
		action.click(traIllustration).perform();
		action.click(tryHereButton).perform();
	}

}
