import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "Steps",
        plugin = {"html:target/reports/cucumber/cucumber-reports.html",
                "json:target/reports/cucumber/cucumber.json",
                "pretty"
        },
        tags = "@signup"
)
public class RunnerCucumberTest {

    @BeforeClass
    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        Configuration.headless = false;
    }
}
