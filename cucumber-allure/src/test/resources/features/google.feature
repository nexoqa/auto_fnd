Feature: Search in google

  @link=https://europcarmobility.atlassian.net/browse/SGW-1239
  Scenario Outline: Search and get result count
    Given I visit google
    When I search for "<searchString>"
    Then I should see search results
    Examples:
      | searchString                                                            |
      | banana                                                                  |
      | sahana                                                                  |
      | ggffghgfgfhfghfghfghfghfghfghfghfghgfhgfhfghfgh sdfsfwefwefwe werewrwer |