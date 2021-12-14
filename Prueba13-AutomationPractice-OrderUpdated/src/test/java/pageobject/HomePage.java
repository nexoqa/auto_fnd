package pageobject;

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

    public static SelenideElement constactUs() {
        return $(By.id("contact-link"));
    }

    public static SelenideElement searchQuery() {
        return $(By.id("search_query_top"));
    }

    public static SelenideElement searchButton() {
        return $(By.name("submit_search"));
    }

    public static SelenideElement emptyResults() {
        return $(By.className("alert-warning"));
    }

    //Actions
    public static void goToSignInForm() {
        HomePage.login().click();
    }

    public static void goToContactUs() {
        HomePage.constactUs().click();
    }

    public static void searchItem(String item) {
        HomePage.searchQuery().clear();
        HomePage.searchQuery().sendKeys(item);
        HomePage.searchButton().click();
    }

    public static String verifyItemIsNotPresent() {
        return HomePage.emptyResults().getText();
    }
}
