package Steps;

import PageObject.HeaderPage;
import PageObject.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class SignUpPageSteps {
    @Given("I am on the HomePage")
    public void i_am_on_the_homepage() {
        open("https://www.demoblaze.com/");
    }

    @When("I click on signup and fill the username {string} and password {string}")
    public void click_on_signup_and_fill_username_and_password(String username, String password) {
        HeaderPage.clickOnSignUp();
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        SignUpPage.signUp(username + uuidAsString, password);
    }

    @When("I click on signup and fill the username {string} and password {string} already exists")
    public void click_on_signup_and_fill_username_and_password_already(String username, String password) {
        HeaderPage.clickOnSignUp();
        SignUpPage.signUp(username, password);
    }

    @Then("I can see the successful alert")
    public void i_can_see_the_successful_alert() {
        Assert.assertEquals(SignUpPage.getAlerMessage(), "Sign up successful.");
        SignUpPage.acceptAlert();
    }

    @Then("I can see the already exists alert")
    public void i_can_see_the_already_exists_alert() {
        Assert.assertEquals(SignUpPage.getAlerMessage(), "This user already exist.");
        SignUpPage.acceptAlert();
    }

    @Then("I can see the fill out username and password alert")
    public void i_can_see_the_fill_out_username_and_password_alert() {
        Assert.assertEquals(SignUpPage.getAlerMessage(), "Please fill out Username and Password.");
        SignUpPage.acceptAlert();
    }

}
