

Feature: WebMD User Symptoms Checker Feature 
  This Feature Will Allow User to Check Their Symptoms in WebMD
  
  
 Background: 
 Given WebMD homepage launched
 
  Scenario: Verifying User Symptom Using Wrong Data
    When User click on CHECK YOUR SYMPTOMS
    And User lands on WebMD Symptom Checker INFO page
    And User clicks on Age search box
    And User enters Age "126"
    Then User should recive an error message 

  @tag2
  Scenario Outline: Verifying User Symptom Using Correct Data
    When User click on CHECK YOUR SYMPTOMS
    And User lands on WebMD Symptom Checker INFO page
    And User clicks on Age search box
    And User enters correct Age and Gender
    And User clicks continue
    And User lands on WebMD Symptom Checker SYMPTOM page
    And User enter their symptom in the symptom search box
    And User select the proper symptom from the dropdown list 
    And User clicks continue
    And User lands on WebMD Symptom Checker QUESTION page
    And User clicks continue
    And User lands on WebMD Symptom Checker CONDITION page
    
    
    Then User should recive an error message 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
