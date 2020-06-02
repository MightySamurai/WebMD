Feature: WebMD Homepage Validation Fetures
  This Feature Will Verify WebMD Homepage


  Scenario: Homepage Title and Screenshoot Verification
    
    Given WebMD homepage launched
    
    When User see the homepage title
    And User sees subscribe button background color in Turquis Blue
   	Then User takes a screnshot
 