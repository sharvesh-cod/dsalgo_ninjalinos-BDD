package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports" }, // reporting purpose
		glue = { "hooks", "stepDefinition" }, // location of step definition files
		tags = "@array",
		// tags = "@A1 or @A2 or @A3 or @A4 or @A5 or @A6 or @A7 or @A8 or @A9 or @A10
		// or @A11 or @A12 or @A13 or @A14 or @A15 or @A16 or @A17 or @A18 or @A19 or
		// @A20 or @A21 or @A22 or @A23 or @A24 or @A25 or @A26 or @A27 or @A28 or @A29
		// or @A30 or @A31 or @A32",
		// tags from feature file,

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

//@A1 or @A2 or @A3 or @A4 or @A5 or @A6 or @A7 or @A8 or @A9 or @A10 or @A11 or @A12 or @A13 or @A14 or @A15 or @A16 or @A17 or @A18 or @A19 or @A20 or @A21 or @A22 or @A23 or @A24 or @A25 or @A26"