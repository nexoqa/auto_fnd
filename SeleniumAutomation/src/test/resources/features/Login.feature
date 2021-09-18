@login
Feature: login into application

  Scenario: incorrect login
    Given I am on the HomePage
    When the user fills the login mandatory field: "nexoqa100212121@gmail.com" and "password123"
    Then the ecommerce should be show a error feedback

    Scenario: correct login
      Given I am on the HomePage
      When the user fills the login mandatory field: "nexoqa@gmail.com" and "password123"
      Then the user is logged