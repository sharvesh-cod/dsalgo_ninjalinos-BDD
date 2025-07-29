package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
		"html:target/dsAlgo_Ninjalinos_BDD.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, // reporting
																										// purpose
		monochrome = false, // console output color
		// tags = "@L5 or @A20",
		features = { "src/test/resources/Feature" }, // location of feature files
		glue = { "stepDefinition", "hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
