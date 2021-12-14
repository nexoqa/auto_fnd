package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomePage;
import pageobject.SignInPage;
import org.junit.Assert;

public class SignInPageSteps {

    @When("the user fills the login mandatory field: {string} and {string}")
    public void theUserFillTheLoginForm(String email, String password) {
        HomePage.goToSignInForm();
        SignInPage.fillLoginForm(email, password);
        HomePageSteps.i_am_on_the_homepage();
    }

    @Then("the ecommerce should be show a error feedback")
    public void theAppShowAErrorMsg() {
        Assert.assertTrue(SignInPage.getErrorMessage().contains("Authentication failed"));
    }

}
