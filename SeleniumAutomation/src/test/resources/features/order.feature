@order
Feature: Order

  Background:

    Given I am on the HomePage
    When the user fills the login mandatory field: "nexoqa@gmail.com" and "password123"

  Scenario: Verify the ability to make an order and checks it ih the order history
    Given I am on the HomePage
    When I search "Dress"
    When I add a "Dress" to the shopping cart
    And Go to the shopping cart summary page
    And Check the shopping cart and proceed
    And Check the address and proceed
    And Check the shipping details and proceed
    And Select the bank wire payment and proceed
    And Confirm the order
    Then The order should be in the order history