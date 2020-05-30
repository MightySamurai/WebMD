
Feature: WebMD BMI Calculator Feature
  This feature will test WebMD BMI calculator functionality

  Background: 
    Given WebMD homepage launched

  @Sprint1 
  Scenario: Verify user is able to use BMI calculator using height and weight
    When User clicks on BMI calculator under popular tools 
    And User input height "5'8"
    And User input weight "120"
    And User clicks Calculate 
    Then User should be able to see the BMI result







