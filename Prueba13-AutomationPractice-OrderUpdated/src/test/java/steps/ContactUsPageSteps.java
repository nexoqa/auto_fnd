package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject.ContactUsPage;
import pageobject.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString;

public class ContactUsPageSteps {
    @Given("I am on the contact us page")
    public void i_am_on_the_contact_us_page() {
        open("http://automationpractice.com/");
        HomePage.goToContactUs();
    }

    @When("I complete the contact us form")
    public void i_complete_the_contact_us_form() {
        ContactUsPage.fillContactUsForm();
    }

    @Then("Contact us page should have a success message")
    public void contact_us_page_should_have_a_success_message() {
        // Espera explicita
        ContactUsPage.alertSuccessMessage().shouldBe(Condition.visible);
        Assert.assertEquals("Your message has been successfully sent to our team.", ContactUsPage.getSuccessMessage());
    }

    @When("I complete the contact us form except the message")
    public void i_complete_the_contact_us_form_except_the_message() {
        ContactUsPage.fillPartiallyContactUsForm();
    }

    @Then("Contact us page should have error message: {string}")
    public void contactus_page_should_have_error_message(String error) {
        Assert.assertThat(ContactUsPage.getHeaderError(), containsString("There is 1 error"));
        Assert.assertThat(ContactUsPage.getDangerMessage(), containsString(error));
    }
}
