package org.example.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.*;
import org.junit.Assert;

public class ShoppingCartPageSteps {

    @When("I add {string} to the shopping cart")
    public void i_add_to_the_shopping_cart(String string) {
        HomePage.searchItem(string);
        OrderPage.addProductToCart(OrderPage.itemProductId(string));
        OrderPage.proceedToCheckout();
    }

    @When("Check the item in the shopping cart")
    public void check_the_item_in_the_shopping_cart() {
        Assert.assertEquals("Printed Summer Dress", ShoppingCartPage.getProductNameCart());
    }

    @When("Remove the item from the shopping cart")
    public void remove_the_item_from_the_shopping_cart() {
        ShoppingCartPage.removeProductCart();
    }

    @Then("The shopping cart should be empty")
    public void the_shopping_cart_should_be_empty() {
        Assert.assertEquals("Your shopping cart is empty.", ShoppingCartPage.shoppingCartEmptyMessage());
    }

}
