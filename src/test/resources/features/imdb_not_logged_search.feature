Feature: Search
  Scenario: Successful search skipping login
    Given the user wants to make a search skipping login
    When the user searches for the movie "Men in black"
    Then the user should see the correct movie overview in the first result