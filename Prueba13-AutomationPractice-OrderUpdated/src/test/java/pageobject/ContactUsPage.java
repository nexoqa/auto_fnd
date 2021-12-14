package pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactUsPage {

    //Locators
    public static SelenideElement subjectContact() {
        return $(By.id("id_contact"));
    }

    public static SelenideElement email() {
        return $(By.id("email"));
    }

    public static SelenideElement orderReference() {
        return $(By.id("id_order"));
    }

    public static SelenideElement message() {
        return $(By.id("message"));
    }

    public static SelenideElement submitButton() {
        return $(By.id("submitMessage"));
    }

    public static SelenideElement alertSuccessMessage() {
        return $(By.className("alert-success"));
    }

    public static SelenideElement alertDangerMessage() {
        return $(By.className("alert-danger"));
        //return $(By.xpath("//*[contains(@class, 'alert-danger')]/ol/li"));
        //return $(By.xpath("//*[contains(text(), 'The message cannot be blank')]"));
    }

    public static SelenideElement alertDangerMessage1() {
        //return $$("div").get(0).find(By.cssSelector("ol")).find(By.cssSelector("li"));
        return $(By.className("alert-danger")).find(By.cssSelector("ol")).find(By.cssSelector("li"));
    }

    public static SelenideElement getHeaderMessage() {
        return $(By.className("alert-danger")).find(By.cssSelector("p"));
    }


    //Actions
    public static void selectSubjectContact(String select) {
        ContactUsPage.subjectContact().selectOption(select);
    }

    public static void setEmail(String email) {
        ContactUsPage.email().sendKeys(email);
    }

    public static void setOrderReference(String order) {
        ContactUsPage.orderReference().sendKeys(order);
    }

    public static void setMessage(String message) {
        ContactUsPage.message().sendKeys(message);
    }

    public static void submitClick() {
        ContactUsPage.submitButton().click();
    }

    public static void fillContactUsForm() {
        selectSubjectContact("Customer service");
        setEmail("prueba@gmail.com");
        setOrderReference("1111111");
        setMessage("This a text from text for text for testing for test test test");
        submitClick();
    }

    public static void fillPartiallyContactUsForm() {
        selectSubjectContact("Customer service");
        setEmail("prueba@gmail.com");
        setOrderReference("1111111");
        submitClick();
    }

    public static String getSuccessMessage() {
        return ContactUsPage.alertSuccessMessage().getText();
    }

    public static String getDangerMessage() {
        return ContactUsPage.alertDangerMessage().getText();
    }

    public static String getDangerMessage2() {
        return ContactUsPage.alertDangerMessage1().getText();
    }


    public static String getHeaderError() {
        return ContactUsPage.getHeaderMessage().getText();
    }
}
