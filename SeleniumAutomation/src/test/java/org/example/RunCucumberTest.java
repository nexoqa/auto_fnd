package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverConditions;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.drivercommands.WebDriverWrapper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        plugin = { "json:build/reports/cucumber/cucumber.json", "pretty", "html:build/reports/cucumber/cucumber-reports.html"},
        glue = "org.example.Steps",
        publish = false
        //tags = "@search"
)
public class RunCucumberTest {

    @BeforeClass
    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.browserSize = null;
        Configuration.browser = "chrome";
        Configuration.headless = true;
        open();
    }

}
