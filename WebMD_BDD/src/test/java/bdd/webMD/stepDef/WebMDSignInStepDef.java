package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDSignInPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDSignInStepDef {
	
	WebMDSignInPageAction webMDSignIn = new WebMDSignInPageAction ();
	
	
	@Given("^WebMd login page launched$")
	public void webmd_login_page_launched()  {
		webMDSignIn.getWebMDLoginPage();
		webMDSignIn.getSignInPageTitle();
		String expectedTitle = "WebMD - Better Information. Better Health.";
		String actualTitle = webMDSignIn.getSignInPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);  
	}

	@When("^user input wrong Email \"([^\"]*)\" and wrong Password \"([^\"]*)\"$")
	
	public void user_input_wrong_Email_and_wrong_Password(String Email, String password) throws Exception {
		webMDSignIn.inputEmail(Email);
		webMDSignIn.inputPassword(password); 
		
	}

	@When("^User clicks on SignIn button$")
	public void user_clicks_on_SignIn_button()  {
		webMDSignIn.signInBtn();   
	}

	@Then("^User should receive an error message$")
	public void user_should_receive_an_error_message()  {
		String actualErrorMessage = webMDSignIn.errorMessage();

		boolean bool = true;

		if (actualErrorMessage.contains("combination incorrect")) {
			bool = true;
		

		Assert.assertEquals(bool, true);
		}
	}

	@When("^user input correct Email \"([^\"]*)\" and correct Password \"([^\"]*)\"$")
	public void user_input_correct_Email_and_correct_Password(String Email, String Password) throws Exception  {
		webMDSignIn.inputEmail(Email);
		webMDSignIn.inputPassword(Password);
	    
	    
	}

	@Then("^User should be able to signin$")
	public void user_should_be_able_to_signin()  {
		String expectedTitle = "WebMD - Better Information. Better Health."; 
		String actualTitle = webMDSignIn.getSignInPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	    
	    
	}



}
