package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.CatalogPage;
import org.example.PageObject.ContactPage;
import org.example.PageObject.HomePage;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString;

public class CatalogPageSteps {

    @When("I open the T-shirt category")
    public void i_open_the_t_shirt_category() {
        CatalogPage.selectTShirtsCatalog();
    }

    @Then("{int} items should be found in the category")
    public void items_should_be_found_in_the_category(Integer int1) {
        Assert.assertTrue(CatalogPage.retrieveItemsCounter().contains(int1.toString()));
    }

    @Then("{string} should be in the catalog results")
    public void item_should_be_in_the_catalog_results(String item) {
        CatalogPage.checkDisplayedItems(item);
    }

}
