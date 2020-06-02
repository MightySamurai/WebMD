
Feature: WebMD Coronavirus Update Using Map Feature 
  This feature will verify coronavirus update in New York State using map functionality

  Background: 
    Given WebMD coronapage launched

  @Sprint1 @Map
  Scenario: Verify coronavirus update for New York State
    When User click on coronavirus update 
    And User click on new york state on the map
    Then User should see coronavirus update for new york state
    
   

  
