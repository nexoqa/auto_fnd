package org.example.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.HomePage;
import org.example.PageObject.OrderPage;
import org.example.PageObject.RegisterPage;
import org.example.PageObject.SignInPage;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderPageSteps {

    @When("I add a {string} to the shopping cart")
    public void i_add_to_the_shopping_cart(String item) {
        OrderPage.addProductToCart(OrderPage.itemProductId(item));
        OrderPage.proceedToCheckout();
    }

    @When("Go to the shopping cart summary page")
    public void go_to_the_shopping_cart_summary_page() {
        OrderPage.proceedToCheckoutClick();
    }

    @When("Check the shopping cart and proceed")
    public void check_the_shopping_cart_and_proceed() {
        OrderPage.proceedStandardCheckoutClick();

    }

    @When("Check the address and proceed")
    public void check_the_address_and_proceed() {
        OrderPage.proceedAddressCheckout().click();
    }

    @When("Check the shipping details and proceed")
    public void check_the_shipping_details_and_proceed() {
        OrderPage.agreeCheckboxShipping().click();
        OrderPage.proceedCarrierCheckout().click();
    }

    @When("Select the bank wire payment and proceed")
    public void select_the_bank_wire_payment_and_proceed() {
       OrderPage.bankWireType().click();
    }

    @When("Confirm the order")
    public void confirm_the_order() {
       OrderPage.confirmOrderButton().click();
    }

    @Then("The order should be in the order history")
    public void the_order_should_be_in_the_order_history() {
        OrderPage.messageText().waitUntil(Condition.visible, 5000);
       String orderReference = OrderPage.getOrderReference();

       OrderPage.goToAccount().click();
       OrderPage.myOrders().click();
       $(By.linkText(orderReference)).shouldBe(Condition.exist);
    }


}
