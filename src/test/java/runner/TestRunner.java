package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/dsAlgo_Ninjalinos_BDD.html" }, // reporting purpose
		monochrome = false, // console output color
		tags = "@TT2", features = { "src/test/resources/Feature/tree.feature" }, // location
		// of
		// feature files
		glue = { "stepDefinitionTree", "hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();

		// " @TypesofTrees or @TypesofTreeTryHere or @TypesofTreeWithoutCode or
		// @TypesofTreeValidCode or @TypesofTreeInValidCode"
	}

}
