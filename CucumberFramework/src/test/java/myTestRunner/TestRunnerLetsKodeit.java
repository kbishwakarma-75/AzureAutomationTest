package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\kbish\\eclipse-workspace\\CucumberFramework\\Features\\LetsKodeit_Login.feature"},
		glue="stepDefinitions_LetsKodeit",
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		monochrome= true
		)
public class TestRunnerLetsKodeit {

}