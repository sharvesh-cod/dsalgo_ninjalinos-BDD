package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/dsAlgo_Ninjalinos_BDD.html" }, // reporting purpose
		monochrome = false, // console output color

		features = { "src/test/resources/Feature/Launch.feature" },
		// tags = "@URL", // location of feature files
		glue = { "stepDefinition", "hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}