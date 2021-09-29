@categories
Feature: categories explorer

  Scenario Outline: View all categories
    Given I am on the HomePage
    When I click on <category> items
    Then I can see <item>

    Examples:
      | category   | item                |
      | "Phones"   | "Samsung galaxy s6" |
      | "Laptops"  | "Sony vaio i5"      |
      | "Monitors" | "ASUS Full HD"      |