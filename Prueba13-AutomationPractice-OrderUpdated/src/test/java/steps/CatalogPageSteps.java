package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CatalogPage;
import org.junit.Assert;

public class CatalogPageSteps {

    @When("I open the T-shirt category")
    public void i_open_the_t_shirt_category() {
        CatalogPage.selectTShirtsCatalog();
    }

    @Then("{int} items should be found in the category")
    public void items_should_be_found_in_the_category(Integer int1) {
        //Assert.assertTrue(CatalogPage.retrieveItemsCounter().contains(int1.toString()));
        Assert.assertTrue(CatalogPage.retrieveItemsCounter().contains("There is " + int1 + " product."));
    }

    @Then("{string} should be in the catalog results")
    public void item_should_be_in_the_catalog_results(String item) {
        CatalogPage.checkDisplayedItems(item);
    }

}
