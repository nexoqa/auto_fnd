@signup
Feature: Signup

  Scenario: valid signup
    Given I am on the HomePage
    When I click on signup and fill the username "pepe" and password "hola123"
    Then I can see the successful alert

  Scenario: the user already exists
    Given I am on the HomePage
    When I click on signup and fill the username "pepe" and password "hola123" already exists
    Then I can see the already exists alert

  Scenario: fill out username and password
    Given I am on the HomePage
    When I click on signup and fill the username "" and password ""
    Then I can see the fill out username and password alert