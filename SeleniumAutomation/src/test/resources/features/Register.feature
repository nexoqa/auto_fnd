@register
Feature: Check the correct behavior of the register features

  Scenario: Register new account
    Given the user wants to register in the ecommerce
    When the user fill the register form
    Then the user should be registered