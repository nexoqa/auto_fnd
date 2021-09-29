package org.example.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;

public class OrderPage {

    //Locators

    public static SelenideElement addToCart(Integer productId){
        return $(By.xpath("//*[@data-id-product=\"" + productId + "\"]"));
    }

    public static SelenideElement productBlock() {
        return $(By.className("ajax_block_product"));
    }

    public static SelenideElement proceedToCheckout() {
        return $(By.xpath("//*[@id='layer_cart']//a[@title=\"Proceed to checkout\"]"));
    }

    public static SelenideElement proceedStandardCheckout() {
        return $(By.className("standard-checkout"));
    }

    public static SelenideElement proceedAddressCheckout() {
        return $(By.name("processAddress"));
    }

    public static SelenideElement agreeCheckboxShipping() {
        return $(By.id("cgv"));
    }

    public static SelenideElement proceedCarrierCheckout() {
        return $(By.name("processCarrier"));
    }

    public static SelenideElement bankWireType() {
        return $(By.className("bankwire"));
    }

    public static SelenideElement confirmOrderButton() {
        return $(By.xpath("//*[@id='cart_navigation']/button"));
    }

    public static SelenideElement goToAccount() {
        return $(By.className("account"));
    }

    public static SelenideElement myOrders() {
        return $(By.xpath("//*[@title='Orders']"));
    }

    public static SelenideElement messageText() {
        return $(By.className("box"));
    }

    //Actions

    public static void addProductToCart(Integer productId) {
        productBlock().hover();
        addToCart(productId).click();
    }

    public static void proceedToCheckoutClick() {
        proceedToCheckout().click();
    }

    public static void proceedStandardCheckoutClick() {
        proceedStandardCheckout().click();
    }

    public static int itemProductId(String item){
        int itemNumber = 0;

        switch(item){
            case "Dress": itemNumber = 5;
                break;
            case "Printed Summer Dress": itemNumber = 5;
                break;
            default: itemNumber = -1;
        }

        return itemNumber;
    }

    public static String getOrderReference() {
        Pattern orderReferencePattern = Pattern.compile("(?<=order reference )[A-Z]+");
        String message =  $(By.className("box")).text();
        Matcher matcher = orderReferencePattern.matcher(message);

        return matcher.find() ? matcher.group() : null;
    }

}
