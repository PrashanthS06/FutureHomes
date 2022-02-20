package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				glue={"StepDefinitions"},
				plugin = {"pretty","html:target/Reports","json:target/JSONReports/report.json","junit:target/JunitReports/report.xml"}
				,monochrome=true)

public class Runnertest 
{

}