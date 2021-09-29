package PageObject;

import org.openqa.selenium.support.ui.Select;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class SignUpPage {


    //Locators
    public static SelenideElement inputTextUsername() {
        return $(By.id("sign-username"));
    }

    public static SelenideElement inputTextPassword() {
        return $(By.id("sign-password"));
    }

    public static SelenideElement buttonSignUp(){
        return $(By.xpath("//button[contains(text(),'Sign up')]"));
    }

    public static SelenideElement buttonClose(){
        return $(By.xpath("//button[contains(text(),'Close')])[2]"));
    }

    //Actions
    public static void signUp(String username, String password){
        inputTextUsername().sendKeys(username);
        inputTextPassword().sendKeys(password);
        buttonSignUp().click();
    }

    public static String getAlerMessage() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }
}
