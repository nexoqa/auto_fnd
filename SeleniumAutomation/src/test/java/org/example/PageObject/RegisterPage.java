package org.example.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    //Locators
    public static SelenideElement birthDaySelect() {
        return $(By.id("days"));
    }

    public static SelenideElement birthMonthSelect() {
        return $(By.id("months"));
    }

    public static SelenideElement birthYearSelect() {
        return $(By.id("years"));
    }

    public static SelenideElement genderMrRadioBtn() {
        return $(By.id("uniform-id_gender1"));
    }

    public static SelenideElement firstName() {
        return $(By.id("customer_firstname"));
    }

    public static SelenideElement lastName() {
        return $(By.id("customer_lastname"));
    }

    public static SelenideElement password() {
        return $(By.id("passwd"));
    }

    public static SelenideElement address() {
        return $(By.id("address1"));
    }

    public static SelenideElement city() {
        return $(By.id("city"));
    }

    public static SelenideElement state() {
        return $(By.id("id_state"));
    }

    public static SelenideElement postalCode() {
        return $(By.id("postcode"));
    }

    public static SelenideElement country() {
        return $(By.id("id_country"));
    }

    public static SelenideElement mobilePhone() {
        return $(By.id("phone_mobile"));
    }

    public static SelenideElement alias() {
        return $(By.id("alias"));
    }

    public static SelenideElement submitButton() {
        return $(By.id("submitAccount"));
    }

    public static SelenideElement signOutButton() {
        return $(By.className("logout"));
    }

    public static SelenideElement myAccountInfo() {
        return $(By.cssSelector("#center_column > h1"));
    }

    public static SelenideElement alertMessage() {
        return $(By.className("alert-danger"));
    }

    //Actions
    public static void fillRegisterForm(Integer genderId) {
        selectGender();
        setFirstName("Pepe");
        setLastName("Mesas");
        setPassword("password123");
        selectBirthDate(10, 2, 1996);
        setAddress("Calle nexoqa");
        setCity("Alicante");
        setState("Colorado");
        setPostalCode("03008");
        setCountry("United States");
        setMobilePhone("123123123");
        setAddressAlias("myCustomAddress");
    }

    public static void selectGender() {
        RegisterPage.genderMrRadioBtn();
    }

    public static void selectBirthDate(Integer day, Integer month, Integer year) {
        Select selectBirthDay = new Select(RegisterPage.birthDaySelect());
        Select selectBirthMonth = new Select(RegisterPage.birthMonthSelect());
        Select selectBirthYear = new Select(RegisterPage.birthYearSelect());

        selectBirthDay.selectByIndex(day);
        selectBirthMonth.selectByIndex(month);
        selectBirthYear.selectByValue(year.toString());
    }

    public static void setFirstName(String firstName) {
        firstName().sendKeys(firstName);
    }

    public static void setLastName(String lastName) {
        lastName().sendKeys(lastName);
    }

    public static void setPassword(String password) {
        password().sendKeys(password);
    }

    public static void setAddress(String address) {
        address().sendKeys(address);
    }

    public static void setCity(String city) {
        city().sendKeys(city);
    }

    public static void setState(String state) {
        state().selectOption(state);
    }

    public static void setPostalCode(String postalCode) {
        postalCode().sendKeys(postalCode);
    }

    public static void setCountry(String country) {
        country().selectOption(country);
    }

    public static void setMobilePhone(String mobilePhone) {
        mobilePhone().sendKeys(mobilePhone);
    }

    public static void setAddressAlias(String alias){
        alias().sendKeys(alias);
    }

    public static void registerButton() {
        submitButton().click();
    }

    public static String getMyAccountText() {
        return RegisterPage.myAccountInfo().getText();
    }
}
