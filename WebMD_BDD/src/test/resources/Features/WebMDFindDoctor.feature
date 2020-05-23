Feature: WebMD Find Doctor Feature
  This feature will allow user to find a doctor

  Scenario: Verify user is able to find a doctor
    Given WebMD homepage launched
    
    When User clicks on FIND A DOCTOR
    And User input condition "Chest Pain" and ZipCode "11432"
    And User clicks Search for doctors button
    Then User should be able to find a doctor
