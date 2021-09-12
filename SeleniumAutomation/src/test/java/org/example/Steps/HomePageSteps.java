package org.example.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.PageObject.RegisterPage;
import org.example.PageObject.SignInPage;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps {

    @Given("I am on the HomePage")
    public void i_am_on_the_homepage(){
        open("http://automationpractice.com/");
    }

}
