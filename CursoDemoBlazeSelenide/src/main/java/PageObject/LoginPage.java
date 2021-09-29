package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    //Locators
    public static SelenideElement textInputUsername(){
        return $(By.id("loginusername"));
    }

    public static SelenideElement textInputPassword(){
        return $(By.id("loginpassword"));
    }

    public static SelenideElement buttonLogin(){
        return $(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public static SelenideElement buttonClose(){
        return $(By.xpath("(//button[contains(text(),'Close')])[3]"));
    }

    //Actions

    public static void login(String username, String password) {
        textInputUsername().sendKeys(username);
        textInputPassword().sendKeys(password);
        buttonLogin().click();
    }
}
