@cart
Feature: make an order

  Scenario Outline: order samsung galaxy s6
    Given I am on the HomePage
    When I add <product> item into the cart
    Then I can see the product <product> in the cart

    Examples:
      | product             |
      | "Samsung galaxy s6" |
      | "Sony vaio i5"      |