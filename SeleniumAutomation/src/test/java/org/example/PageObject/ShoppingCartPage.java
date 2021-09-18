package org.example.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {

    //Locators
    public static SelenideElement productDescriptionCart() {
        return $(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a"));
    }

    public static SelenideElement deleteCartItem(){
        return $(By.className("cart_quantity_delete"));
    }

    public static SelenideElement shoppingCartEmpty() {
        return $(By.className("alert-warning"));
    }

    //Actions
    public static String getProductNameCart() {
        productDescriptionCart().waitUntil(Condition.visible, 5000);
        return productDescriptionCart().getText();
    }

    public static void removeProductCart() {
        deleteCartItem().click();
    }

    public static String shoppingCartEmptyMessage () {
        shoppingCartEmpty().waitUntil(Condition.visible, 5000);
        return shoppingCartEmpty().getText();
    }
}
