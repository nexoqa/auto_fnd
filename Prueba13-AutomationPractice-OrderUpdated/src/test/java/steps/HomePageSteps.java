package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class HomePageSteps {
    @Given("I am on the HomePage")
    public static void i_am_on_the_homepage() {
        open("http://automationpractice.com/");
    }

    @When("I search {string}")
    public void i_search_item(String item) {
        HomePage.searchItem(item);
    }

    @Then("the page is opened")
    public void the_page_is_opened() {
        Assert.assertEquals("My Store", title());
    }

    @Then("the page is opened with wrong title")
    public void the_page_is_opened_wrong_title() {
        Assert.assertEquals("My Store2", title());
    }
}
