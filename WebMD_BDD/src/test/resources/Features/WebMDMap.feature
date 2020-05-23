
Feature: WebMD Coronavirus Update Using Map Feature 
  This feature will verify coronavirus update in United States using map functionality

  Background: 
    Given WebMD homepage launched

  @Sprint1 
  Scenario: Verify coronavirus update for New York State
    When User clicks on coronavirus update 
    And User scrolls down to map
    And User navigates and clicks on new york state on the map
    Then User should be able to see coronavirus update
    
    Scenario Outline: Verify coronavirus update for multiple states
    When User clicks on coronavirus update 
    And User scrolls down to map
    And User navigates and clicks on state "<state>" on the map
    Then User should be able to see coronavirus update
    
    | State |
    | California |
    | Florida  |

  
