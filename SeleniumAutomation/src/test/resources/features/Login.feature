@login
Feature: login into application

  Scenario: login
    Given I am on the HomePage
    When the user fills the login mandatory field: "nexoqa1@gmail.com" and "password123"
    Then the ecommerce should be show a error feedback