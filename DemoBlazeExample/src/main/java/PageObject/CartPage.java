package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    //Locators
    public static List<SelenideElement> linkDelete() {
        return $$(By.linkText("Delete"));
    }

    public static SelenideElement textPrice() {
        return $(By.xpath("//tr[@class='success']/td[3]"));
    }

    public static SelenideElement textTotalPrice() {
        return $(By.id("totalp"));
    }

    public static SelenideElement buttonPlaceOrder() {
        return $(By.xpath("//button[text()='Place Order']"));
    }

    public static SelenideElement inputTextName() {
        return $(By.id("name"));
    }

    public static SelenideElement inputTextCountry() {
        return $(By.id("country"));
    }

    public static SelenideElement inputTextCity() {
        return $(By.id("city"));
    }

    public static SelenideElement inputTextCard() {
        return $(By.id("card"));
    }

    public static SelenideElement inputTextMonth() {
        return $(By.id("month"));
    }

    public static SelenideElement inputTextYear() {
        return $(By.id("year"));
    }

    public static SelenideElement buttonPurchase() {
        return $(By.xpath("//button[text()='Purchase']"));
    }

    public static SelenideElement buttonAddToCart() {
        return $(By.linkText("Add to cart"));
    }

    public static SelenideElement cartTable() {
        return $(By.className("success"));
    }

    public static SelenideElement textSuccessfulPurchase() {
        return $(By.xpath("//h2[text()='Thank you for your purchase!']"));
    }

    public static SelenideElement textDataOfPurchase() {
        return $(By.cssSelector(".lead.text-muted"));
    }

    public static SelenideElement buttonOK() {
        return $(By.xpath("//button[text()='OK']"));
    }

    public static void clickOnAddToCartButton() {
        buttonAddToCart().click();
    }

    public int getActualPrice() {
        return Integer.parseInt(textTotalPrice().getText());
    }

    public void deleteProduct() {
        Random rand = new Random();
        int numOfProduct = 0;
        int index = 0;

        numOfProduct = linkDelete().size();
        index = rand.nextInt(numOfProduct);

        linkDelete().get(index).click();
    }
}
