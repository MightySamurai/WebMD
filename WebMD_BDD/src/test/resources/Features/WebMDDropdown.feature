Feature: Webmd dropdown feature
   This feature will test Webmd dropdown funtionality 
   
   Background: Webmd home page launched
   
   Given Webmd home page launched 
   
   @Sprint1 @Dropdown
   Scenario: the user is on the Webmd home page
   When user takes the cursor to "HEALTH A-Z" the drop down page appears
   And user takes the cursor to "DRUGS & SUPPLEMENTS" dropdown option page appears
   And User takes the cursor to " LIVING HEALTHY " the dropdown page appears
   And user takes the cursor to "FAMLY & PREGNANCY" the dropdown page appears
   Then user takes the cursor to "NEWS & EXPERT" the bdropdown page appears 
   