Feature: WebMD Homepage Validation Feature

  This Feature Will Verify WebMD Homepage Title, Color and take Screenshot 


 @Sprint1 @Validation
 
  Scenario: Verify homepage title, color and screenshot 
    
    Given WebMD homepage launched
    
    When User see the homepage title
    And User sees subscribe button background color in Turquis Blue
   	Then User takes a screnshot
 