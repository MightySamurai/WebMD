Feature: Webmd signup feature
  
  This feature will test Webmd signup funtionality

  Scenario: verify user signup using email password and date of birth
    
    Given webMD SignUp page launched
    
    When user input valid Email "mightysamurai2020@gmail.com" and Password "Mighty2027"
    #And user input valid date of birth "01/01/1992"
    And user input valid DOB
    And user click on SignUp button
    Then user should recieve error text "Sorry, this email address is already taken."
