package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    //Locators
    public static SelenideElement tagProductName() {
        return $(By.className("name"));
    }

    public static SelenideElement linkAddToCart() {
        return $(By.linkText("Add to cart"));
    }

    //Actions
    public static void clickOnAddToCart(){
        linkAddToCart().click();
    }

    public static String getProductName(){
        return tagProductName().getText();
    }

}
