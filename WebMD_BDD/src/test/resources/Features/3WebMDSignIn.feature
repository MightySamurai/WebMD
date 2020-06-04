Feature: WebMd login feature 
  This feature will test WebMd login functionality 
  
  Background: 
  	Given WebMd login page launched
  
  @Sprint1 @SignIn 
 	Scenario: Verify user login using the wrong email and password
            When user input wrong Email "caregiver@gmail.com" and wrong Password "pass123"
            And User clicks on SignIn button
            Then User should receive an error message

   
    @Sprint1 @Signin      
 	Scenario Outline: Verify user login using the correct email and password
           	And user input correct Email "<Email>" and correct Password "<Password>"
            And User clicks on SignIn button
            Then User should be able to signin
            
            Examples: 
            |	Email     									|	Password 		|   
            |	caregiver@gmail.com					|	pass123 		|
            |	mightysamurai2020@gmail.com	|	Samurai123	|