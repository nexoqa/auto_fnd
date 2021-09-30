package Steps;

import PageObject.HeaderPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class HomePageSteps {

    @When("I click on {string} items")
    public void click_on_category(String category) {
        switch (category) {
            case "Phones":
                HomePage.linkPhones().click();
                HomePage.linkSamsungGalaxyS6().waitUntil(Condition.visible, 5000);
                break;
            case "Laptops":
                HomePage.linkLaptops().click();
                HomePage.linkSonyVaio().waitUntil(Condition.visible, 5000);
                break;
            case "Monitors":
                HomePage.linkMonitors().click();
                HomePage.linkASUSFullHD().waitUntil(Condition.visible, 5000);
                break;
            default:
                throw new NoSuchElementException();
        }
    }

    @Then("I can see {string}")
    public void i_can_see_category(String item) {
        switch (item) {
            case "Samsung galaxy s6": Assert.assertTrue(HomePage.linkSamsungGalaxyS6().isDisplayed());
                break;
            case "Sony vaio i5": Assert.assertTrue(HomePage.linkSonyVaio().isDisplayed());
                break;
            case "ASUS Full HD": Assert.assertTrue(HomePage.linkASUSFullHD().isDisplayed());
                break;
            default:
                throw new NoSuchElementException();
        }
    }
}
