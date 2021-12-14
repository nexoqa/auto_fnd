@order
Feature: Order

  Background:
    Given I am on the HomePage
    When the user fills the login mandatory field: "nexoqa@gmail.com" and "password123"

  @order1
  Scenario: Verify the ability to make an order and checks it ih the order history
    Given I add "Dress" to the shopping cart
    When Go to the shopping cart and proceed to checkout
    Then The order should be in the order history