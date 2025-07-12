package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports" }, // reporting purpose
		glue = { "stepDefinition", "hooks" }, // location of step definition files

		tags = "@H1 or @A1 or @A2", // tags from feature file
		features = { "src/test/resources/Feature" }, // location of feature files
		monochrome = false // console output color

)

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}