Feature: WebMD Facebook Connect Feature
 
  This feature will verify WebMD connection with Facebook
  

  Scenario: Verify social media links from homepage drop down bar
    Given WebMD homepage launched
   
    When User scroll down on homepage
    And User click on facebook icon from dropdown banner
    Then User should be able to connect to facebook
