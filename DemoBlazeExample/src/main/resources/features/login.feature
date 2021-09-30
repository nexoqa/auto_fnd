@login
Feature: login

  Scenario: valid login
    Given I am on the HomePage
    When I login with the user "juan01" and password "hola123"
    Then I am logged into the app