@search
Feature: Search

  Scenario Outline: Verify the ability to search items

    Given I am on the HomePage
    When I search <Item>
    Then <Item> should be in the search results

    Examples:
      | Item                    |
      | "Blouse"                |
      | "T-shirt"               |
      | "Printed Chiffon Dress" |