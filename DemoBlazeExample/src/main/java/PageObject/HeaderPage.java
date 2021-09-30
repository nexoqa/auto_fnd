package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    public static SelenideElement linkHome() {
        return $(By.xpath("//a[text()='Home ']"));
    }

    public static SelenideElement linkContact() {
        return $(By.linkText("Contact"));
    }

    public static SelenideElement linkAboutUs() {
        return $(By.linkText("About us"));
    }

    public static SelenideElement linkCart() {
        return $(By.linkText("Cart"));
    }

    public static SelenideElement linkLogin() {
        return $(By.linkText("Log in"));
    }

    public static SelenideElement linkSignUp() {
        return $(By.linkText("Sign up"));
    }

    public static SelenideElement linkLogOut() {
        return $(By.linkText("Log out"));
    }

    public static SelenideElement linkWelcomeUser() {
        return $(By.id("nameofuser"));
    }

    //Actions
    public static void clickOnHome() {
        linkHome().click();
    }

    public static void clickOnLogin(){
        linkLogin().click();
    }

    public static void clickOnCart(){
        linkCart().click();
    }

    public static void clickOnSignUp() {
        linkSignUp().click();
    }

    public static void clickOnLogOut() {
        linkLogOut().click();
    }

    public boolean isWelcomeUserDisplayed(){
        return linkWelcomeUser().isDisplayed();
    }

    public boolean isLoginDisplayed(){
        return linkLogin().isDisplayed();
    }

    public boolean isSignUpDisplayed(){
        return linkSignUp().isDisplayed();
    }

    public boolean isLogOutDisplayed(){
        return linkLogOut().isDisplayed();
    }

}
