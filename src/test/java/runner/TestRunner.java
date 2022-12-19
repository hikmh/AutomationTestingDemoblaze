package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				features = "src/test/resources/Features", 
				glue = "runner",
				plugin = { "pretty","html:target/cucumber-reports.html", "json:target/cucumber-reports/result.json" })
public class TestRunner extends AbstractTestNGCucumberTests{
	
}

