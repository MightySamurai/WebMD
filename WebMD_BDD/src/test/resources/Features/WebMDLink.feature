
Feature: WebMD Connect with Social Media Feature
  This feature will verify WebMD social media links 

  Background: 
    Given WebMD homepage launched

  @Sprint1 
  Scenario: Verify social media links from homepage drop down bar
    When User scroll down on homepage  
    And User clicks on facebook icon
    Then User should be able to share on facebook

  @Sprint1 
  Scenario Outline: Verify social media links from homepage drop down bar
    When User scroll down on homepage  
    And User clicks on ShareIcon "<ShareIcon>"
    Then User should be able to link to a social media platform
    
    Examples:
    | ShareIcon | 
    | Facebook  |
    | Twitter   |
    | Pinterest |
 

