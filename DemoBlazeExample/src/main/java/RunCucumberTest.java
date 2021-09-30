import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "Steps",
        plugin = {"html:build/reports/cucumber/cucumber-reports.html",
                "json:build/reports/cucumber/cucumber.json",
                "pretty"
        },
        tags = "@cart"
)
public class RunCucumberTest {

    @BeforeClass
    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        Configuration.headless = false;
    }
}
