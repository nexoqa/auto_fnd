package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CatalogPage {

    //Locators
    public static SelenideElement subjectContact() {
        return $(By.id("id_contact"));
    }

    public static SelenideElement email() { return $(By.id("email"));}

    public static SelenideElement orderReference() { return $(By.id("id_order"));}

    public static SelenideElement message() { return $(By.id("message"));}

    public static SelenideElement submitButton () { return $(By.id("submitMessage"));}

    public static SelenideElement alertSuccessMessage() {
        return $(By.className("alert-success"));
    }

    public static SelenideElement alertDangerMessage() {
        return $(By.className("alert-danger"));
    }

    //Actions
    public static void selectSubjectContact(String select) {
        CatalogPage.subjectContact().selectOption(select);
    }

    public static void setEmail(String email) {
        CatalogPage.email().sendKeys(email);
    }

    public static void setOrderReference (String order) {
        CatalogPage.orderReference().sendKeys(order);
    }

    public static void setMessage(String message) {
        CatalogPage.message().sendKeys(message);
    }

    public static void submitClick() {
        CatalogPage.submitButton().click();
    }

    public static void fillContactUsForm () {
        selectSubjectContact("Customer service");
        setEmail("prueba@gmail.com");
        setOrderReference("1111111");
        setMessage("This a text from text for text for testing for test test test");
        submitClick();
    }

    public static void fillPartiallyContactUsForm () {
        selectSubjectContact("Customer service");
        setEmail("prueba@gmail.com");
        setOrderReference("1111111");
        submitClick();
    }

    public static String getSuccessMessage() {
        return CatalogPage.alertSuccessMessage().getText();
    }

    public static String getDangerMessage() {
        return CatalogPage.alertDangerMessage().getText();
    }
}
