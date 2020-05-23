Feature: WebMD Homepage Validation Fetures
  This Feature Will Verify WebMD Homepage Color and Logo


  Scenario: Homepage Color and Logo Verification
    
    Given WebMD homepage launched
    When User display WebMD homepage
    And User should see WebMD logo on top left corner
    And User should see blue banner content on top
   	Then User is able to verify WebMD homepage
