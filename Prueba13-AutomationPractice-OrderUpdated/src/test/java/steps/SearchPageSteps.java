package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobject.SearchPage;
import pageobject.HomePage;

public class SearchPageSteps {

    @Then("{string} should be in the search results")
    public void item_should_be_in_the_search_results(String item) {
        // Espera explicita
        Assert.assertTrue(false);
        SearchPage.itemText().shouldBe(Condition.visible);
        SearchPage.verifyItem(item);
    }

    @Then("{string} should not be in the search results")
    public void item_should_not_be_in_the_search_results (String item) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(HomePage.verifyItemIsNotPresent(), "No results were found for your search \"" + item + "\"");
    }

}
