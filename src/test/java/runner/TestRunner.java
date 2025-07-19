package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
		"html:target/dsAlgo_Ninjalinos_BDD.html" }, // reporting
		// purpose
		monochrome = false, // console output color
		tags = "@Stackoperations", features = { "src/test/resources/Feature" }, // location
		// of
		// feature
		// files
		glue = { "hooks", "stepDefinition" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}