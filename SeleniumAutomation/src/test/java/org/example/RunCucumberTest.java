package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        plugin = { "json:build/reports/cucumber/cucumber.json", "pretty", "html:build/reports/cucumber/cucumber-reports.html"},
        glue = "org.example.Steps",
        publish = false
)
public class RunCucumberTest {

}
