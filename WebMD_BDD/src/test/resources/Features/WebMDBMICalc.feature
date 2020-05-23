
Feature: WebMD BMI Calculator Feature
  This feature will test WebMD BMI calculator functionality

  Background: 
    Given WebMD homepage launched

  @Sprint1 
  Scenario: Verify user is able to use BMI calculator using height and weight
    When User scroll down on homepage  
    And User clicks on BMI calculator under popular tools
    And User input height using up and down arrow
    And User input weight "120"
    And User clicks Calculate 
    Then User should be able to check for BMI result







