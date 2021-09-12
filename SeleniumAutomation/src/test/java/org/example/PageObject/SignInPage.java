package org.example.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    //Locators
    public static SelenideElement emailField() {
        return $(By.id("email"));
    }

    public static SelenideElement passwordField() {
        return $(By.id("passwd"));
    }

    public static SelenideElement submitBtn() {
        return $(By.id("SubmitLogin"));
    }

    public static SelenideElement errorMessage() {
        return $(By.cssSelector("#center_column > div.alert.alert-danger"));
    }

    public static SelenideElement newEmailField() {
        return $(By.id("email_create"));
    }

    public static SelenideElement submitCreateBtn() {
        return $(By.id("SubmitCreate"));
    }

    //Actions
    private static void setEmail(String email) {
        emailField().sendKeys(email);
    }

    private static void setPassword(String password) {
        passwordField().sendKeys(password);
    }

    private static void clickSubmit() {
        submitBtn().click();
    }

    public static void fillLoginForm(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSubmit();
    }

    public static String getErrorMessage(){
        return errorMessage().toString();
    }

    private static void setEmailRegister(String email) {
        newEmailField().sendKeys(email);
        submitCreateBtn().click();
    }

    public static void goToRegisterForm(String email) {
        setEmailRegister(email);
        submitCreateBtn().click();
    }

}
