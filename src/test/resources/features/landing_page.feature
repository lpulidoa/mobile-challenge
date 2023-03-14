Feature: landing page

  Scenario: Successful search bar result
    Given the user wants to make a search
    When the user searches for "Colombia" in the page
    Then the user should get the correct article page in the first result