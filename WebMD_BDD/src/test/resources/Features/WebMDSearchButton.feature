Feature: WebMD Search Engine Feature
  This feature will test WebMD search engine functionality

  Scenario: Verify search button functionality
    Given WebMD homepage launched
    When User input information "advil" in the search field
    And User clicks on search icon
    Then User should be able to see the information
