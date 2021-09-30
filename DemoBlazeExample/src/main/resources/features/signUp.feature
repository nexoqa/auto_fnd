@signp
Feature: check the signup

  Scenario: Signup existing user
    Given I am on the HomePage
    When I click on signup and fill the username "pepe" random "no" and password "hola123"
    Then I can see the already exists alert


  Scenario: Signup non existing user
    Given I am on the HomePage
    When I click on signup and fill the username "pepe" random "yes" and password "hola123"
    Then I can see the successful alert

  Scenario: Signup empty fields
    Given I am on the HomePage
    When I click on signup and fill the username "" random "no" and password ""
    Then I can see the fill out username and password alert