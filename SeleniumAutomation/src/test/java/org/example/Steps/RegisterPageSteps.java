package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.HomePage;
import org.example.PageObject.RegisterPage;
import org.example.PageObject.SignInPage;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class RegisterPageSteps {
    @Given("^the user wants to register in the ecommerce$")
    public void theUserWantsRegisterInEcommerce() {
        open("http://automationpractice.com/");
        HomePage.goToSignInForm();
    }

    @When("the user fill the register form")
    public void theUserFillTheRegisterForm() throws InterruptedException {
        Thread.sleep(2000);
        SignInPage.goToRegisterForm("nexoqa100@gmail.com");
        Thread.sleep(5000);
        RegisterPage.fillRegisterForm(0);
        RegisterPage.registerButton();
    }

    @Then("the user should be registered")
    public void theUserShouldBeRegistered() throws InterruptedException {
        RegisterPage.myAccountInfo().isDisplayed();
        Assert.assertEquals("MY ACCOUNT", RegisterPage.getMyAccountText());
        RegisterPage.signOutButton().click();
    }

}
