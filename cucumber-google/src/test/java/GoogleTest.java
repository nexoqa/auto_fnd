import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.TextReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "Steps",
        plugin = { "pretty" }
)
public class GoogleTest {

  @BeforeClass
  public static void setUp() {
    Configuration.startMaximized = true;
    open();
  }
}
