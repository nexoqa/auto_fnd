package org.example.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class HomePage {

    //Locators
    public static SelenideElement login() {
        return $(By.className("login"));
    }

    //Actions
    public static void goToSignInForm() {
        HomePage.login().click();
    }

}
