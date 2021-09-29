package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.HomePage;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString;

public class HomePageSteps {

    @Given("I am on the HomePage")
    public void i_am_on_the_homepage(){
        open("http://automationpractice.com/");
    }

    @When("I search {string}")
    public void i_search_item(String item) {
        HomePage.searchItem(item);
    }

    @Then("{string} should be in the search results")
    public void item_should_be_in_the_search_results (String item) throws InterruptedException {
        Thread.sleep(5000);
        HomePage.verifyItem(item);
    }

    @Then("{string} should not be in the search results")
    public void item_should_not_be_in_the_search_results (String item) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(HomePage.verifyItemIsNotPresent(), "No results were found for your search \"" + item + "\"");
    }
}
