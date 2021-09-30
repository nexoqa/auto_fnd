package Steps;

import PageObject.HeaderPage;
import PageObject.SignUpPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Objects;
import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class SignUpPageSteps {
    @Given("I am on the HomePage")
    public void i_am_on_the_homepage() {
        open("https://www.demoblaze.com/");
    }

    @When("I click on signup and fill the username {string} random {string} and password {string}")
    public void click_on_signup_and_fill_username_and_password(String username, String random, String password) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        HeaderPage.clickOnSignUp();
        SignUpPage.buttonSignUp().waitUntil(Condition.visible, 5000);

        if (Objects.equals(random, "yes")) {
            SignUpPage.signUp(username + uuidAsString, password);
        } else {
            SignUpPage.signUp(username, password);
        }
    }

    @Then("I can see the successful alert")
    public void i_can_see_the_successful_alert() {
        Assert.assertEquals("Sign up successful.", SignUpPage.getAlerMessage());
        SignUpPage.acceptAlert();
        SignUpPage.buttonClose().click();
    }

    @Then("I can see the already exists alert")
    public void i_can_see_the_already_exists_alert() {
        Assert.assertEquals("This user already exist.", SignUpPage.getAlerMessage());
        SignUpPage.acceptAlert();
        SignUpPage.buttonClose().click();
    }

    @Then("I can see the fill out username and password alert")
    public void i_can_see_the_fill_out_username_and_password_alert() {
        Assert.assertEquals("Please fill out Username and Password.", SignUpPage.getAlerMessage());
        SignUpPage.acceptAlert();
        SignUpPage.buttonClose().click();
    }

}
