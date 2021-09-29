package Steps;

import PageObject.HeaderPage;
import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    @When("I login with the user {string} and password {string}")
    public void click_on_login_and_fill_username_and_password(String username, String password) {
        HeaderPage.clickOnLogin();
        LoginPage.login(username, password);
    }

    @Then("I am logged into the app")
    public void i_am_logged_into_app() {
        HeaderPage.linkWelcomeUser().waitUntil(Condition.visible, 5000);
        Assert.assertTrue(HeaderPage.linkWelcomeUser().isDisplayed());
    }
}
