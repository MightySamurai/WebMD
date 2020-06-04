Feature: WebMD Find Doctor Feature
  This feature will allow user to find a doctor


 @Sprint1 @FindDoc
  Scenario: Verify user is able to find a doctor
    Given WebMD homepage launched
    
    When User clicks on FIND A DOCTOR
    And User input condition "Chest Pain" and ZipCode "10452"
    And User clicks Search for doctors button
    Then User should be able to find a doctor
