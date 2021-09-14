package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.HomePage;
import org.example.PageObject.RegisterPage;
import org.example.PageObject.SignInPage;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.open;

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
}
