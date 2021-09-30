package Steps;

import PageObject.CartPage;
import PageObject.HeaderPage;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class CartPageSteps {
    @When("I add {string} item into the cart")
    public void i_add_item_into_the_cart(String item){
        getGenericLinkItem(item).click();
        CartPage.clickOnAddToCartButton();
        Assert.assertEquals("Product added", switchTo().alert().getText());
    }

    @Then("I can see the product {string} in the cart")
    public void i_can_see_the_product_in_the_cart(String item) {
        HeaderPage.clickOnCart();
        Assert.assertTrue(CartPage.cartTable().getText().contains(item));
    }

    @When("I place the order and fill the mandatory fields")
    public void i_place_the_order_and_fill_mandatory_fields(){
        CartPage.buttonPlaceOrder().click();

        CartPage.inputTextName().sendKeys("nameExample");
        CartPage.inputTextCountry().sendKeys("asdf");
        CartPage.inputTextCity().sendKeys("Alicante");
        CartPage.inputTextCard().sendKeys("12312312");
        CartPage.inputTextMonth().sendKeys("09");
        CartPage.inputTextYear().sendKeys("2021");

        CartPage.buttonPurchase().click();
    }

    @Then("I can see the successful purchase")
    public void i_can_see_the_successful_purchase() {
        Assert.assertEquals("Thank you for your purchase!", CartPage.textSuccessfulPurchase().getText());
    }

    private SelenideElement getGenericLinkItem(String item){
        return $(By.linkText(item));
    }

    private SelenideElement sonyVaio(){
        return $(By.linkText("Sony vaio i5"));
    }
}
