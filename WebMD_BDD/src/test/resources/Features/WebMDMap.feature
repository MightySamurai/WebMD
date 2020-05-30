
Feature: WebMD Coronavirus Update Using Map Feature 
  This feature will verify coronavirus update in New York State using map functionality

  Background: 
    Given WebMD homepage launched

  @Sprint1 @Map
  Scenario: Verify coronavirus update for New York State
    When User clicks on coronavirus update 
    And User clicks on new york state on the map
    Then User should be able to see coronavirus update for new york state
    
   

  
