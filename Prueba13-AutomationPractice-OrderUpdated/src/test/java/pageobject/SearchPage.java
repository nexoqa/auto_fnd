package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.CoreMatchers.containsString;

public class SearchPage {

    //Locators
    public static SelenideElement itemText() {
        return $(By.className("product-container"));
    }

    //Actions
    public static void verifyItem(String item) {
        Assert.assertThat(SearchPage.itemText().getText(), containsString(item));
    }

}
