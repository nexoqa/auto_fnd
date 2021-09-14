package org.example.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.WaitUntil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.ContactPage;
import org.example.PageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.Wait;
import static org.hamcrest.CoreMatchers.containsString;


import static com.codeborne.selenide.Selenide.open;

public class ContactPageSteps {

    @Given("I am on the contact us page")
    public void i_am_on_the_contactus_page() {
        open("http://automationpractice.com/");
        HomePage.goToContactUsForm();
    }

    @When("I complete the contact us form")
    public void i_complete_the_contactus_form () {
        ContactPage.fillContactUsForm();
    }

    @Then("Contact us page should have a success message")
    public void contactus_page_should_have_a_success_message() {
        ContactPage.alertSuccessMessage().waitUntil(visible, 5000);
        Assert.assertEquals("Your message has been successfully sent to our team.", ContactPage.getSuccessMessage());
    }

    @When("I complete the contact us form except the message")
    public void i_complete_the_contact_us_form_except_the_message() {
        ContactPage.fillPartiallyContactUsForm();
    }

    @Then("Contact us page should have error message: {string}")
    public void contactus_page_should_have_error_message(String error) {
        Assert.assertThat(ContactPage.getDangerMessage(), containsString(error));
    }

}
