Feature: WebMD search Engine Feature
  
  This feature will test  WebMD search engine funcionality

  Background: 
    Given WebMd login page launched

  Scenario: Verify search box using wrong data
    When User input Data "Yellowpig" in the search
    And User clicks on search icon
    Then User should recieve an error text

  Scenario Outline: Verify search box functionality using correct data
    When User input correctData "<data>" in the search
    And User clicks on search icon
    Then User should see result page

    Examples: 
      | data          |
      | Advil         |
      | Find a Doctor |
      | Coronavirus   |
