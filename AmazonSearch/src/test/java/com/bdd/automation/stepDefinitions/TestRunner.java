package com.bdd.automation.stepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.bdd.automation.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/report.json"},
        monochrome = true,
        tags= "@Run"
)

public class TestRunner {
	
}
