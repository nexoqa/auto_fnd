import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "steps",
        plugin = {
                "json:build/reports/cucumber/cucumber.json",
                "pretty",
                "html:build/reports/cucumber/cucumber-reports.html"
        },
        publish = false,
        tags = "@order"
)
public class RunCucumberTest {

        @BeforeClass
        public static void setUp(){
                Configuration.startMaximized = true;
                Configuration.browser = "chrome";
                Configuration.headless = false;
                open();
        }
}
