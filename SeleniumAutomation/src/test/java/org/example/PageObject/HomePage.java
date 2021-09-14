package org.example.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.CoreMatchers.containsString;


public class HomePage {

    //Locators
    public static SelenideElement login() {
        return $(By.className("login"));
    }

    public static SelenideElement contactUs() {
        return $(By.id("contact-link"));
    }

    public static SelenideElement searchQuery() {
        return $(By.id("search_query_top"));
    }

    public static SelenideElement searchButton() {
        return $(By.name("submit_search"));
    }

    public static SelenideElement itemText() {
        return $(By.className("product-container"));
    }

    //Actions
    public static void goToSignInForm() {
        HomePage.login().click();
    }

    public static void goToContactUsForm() {
        HomePage.contactUs().click();
    }

    public static void searchItem(String item) {
        HomePage.searchQuery().sendKeys(item);
        HomePage.searchButton().click();
    }

    public static void verifyItem(String item) {
        Assert.assertThat(HomePage.itemText().getText(), containsString(item));
    }

}
