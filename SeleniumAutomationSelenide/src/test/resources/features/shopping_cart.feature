@shoppingcart
Feature: Shopping cart

  Scenario: Verify the ability to add and delete items from cart

    Given I am on the HomePage
    When I add 'Printed Summer Dress' to the shopping cart
    And Go to the shopping cart summary page
    And Check the item in the shopping cart
    And Remove the item from the shopping cart
    Then The shopping cart should be empty