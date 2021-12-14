package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class CatalogPage {

    //Locators
    public static SelenideElement womenCategory() {
        return $(By.xpath("//*[@id='block_top_menu']//*[@title='Women']"));
    }

    public static SelenideElement categoryTShirts() {
        return $(By.xpath("//*[@id='block_top_menu']//*[@title='T-shirts']"));
    }

    public static SelenideElement itemResultsCatalog() {
        return $(By.xpath("//*[@id='category']//*[@class='product-container']//*[@class='product-name']"));
    }

    public static SelenideElement itemsCounter() {
        return $(By.className("heading-counter"));
    }

    public static SelenideElement displayedItems() {
        //return $(By.xpath("//*[@id='category']//*[@class='product-container']//*[@class='product-name']"));
        return $(By.xpath("//*[@class='product-container']"));
    }

    //Actions
    public static void selectTShirtsCatalog() {
        womenCategory().hover();
        categoryTShirts().shouldBe(appear).click();
    }

    public static String retrieveItemsCounter() {
        return itemsCounter().getText();
    }

    public static void checkDisplayedItems(String item) {
        displayedItems().waitUntil(visible, 5000);
        displayedItems().getText().contains(item);
    }
}
