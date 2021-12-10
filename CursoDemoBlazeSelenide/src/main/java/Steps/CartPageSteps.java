package Steps;

import PageObject.CartPage;
import PageObject.HeaderPage;
import PageObject.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class CartPageSteps {
    @When("I add {string} item into the cart")
    public void i_add_item_into_the_cart(String item){
        getGenericLinkItem(item).click();
        CartPage.clickOnAddToCartButton();
        Assert.assertEquals(switchTo().alert().getText(), "Product added");
    }

    @Then("I can see the product {string} in the cart")
    public void i_can_see_the_product_in_the_cart(String item) {
        HeaderPage.clickOnCart();
        Assert.assertTrue(CartPage.cartTable().getText().contains(item));
    }

    private SelenideElement getGenericLinkItem(String item){
        return $(By.linkText(item));
    }
}
