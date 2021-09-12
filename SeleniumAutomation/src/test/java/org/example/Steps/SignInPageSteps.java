package org.example.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.HomePage;
import org.example.PageObject.SignInPage;
import org.junit.Assert;

public class SignInPageSteps {

    @When("the user fills the login mandatory field: {string} and {string}")
    public void theUserFillTheLoginForm(String email, String password) throws InterruptedException {
        HomePage.goToSignInForm();
        SignInPage.fillLoginForm(email, password);
        //Thread.sleep(2000);
    }

    @Then("^the ecommerce should be show a error feedback$")
    public void theAppShowAErrorMsg() {
        Assert.assertTrue(SignInPage.getErrorMessage().contains("Authentication failed"));
    }

}
