package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDSignUpActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WebMDSignUpStepDef {

	WebMDSignUpActions webMDSignUp = new WebMDSignUpActions();

	/*
	 * @Given("^WebMd login page launched$") public void webmd_login_page_launched()
	 * { webMDSignUp.gerwebMDSignUpPage();
	 * 
	 * }
	 */

	@Given("^webMD SignUp page launched$")
	public void webmd_SignUp_page_launched() {
		webMDSignUp.getwebMDSignUpPage();

	}

	@Given("^user input valid Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_input_valid_Email_and_Password(String Email, String Password) {

		webMDSignUp.inputEmail(Email);
		webMDSignUp.inputPassword(Password);

	}

	@Given("^user input valid date of birth \"([^\"]*)\"$")
	public void user_input_valid_date_of_birth(String DateOfBirth) {

		webMDSignUp.inputDateOfBirth(01/01/1992);

	}

	@Given("^user click on SignUp button$")
	public void user_click_on_SignUp_button() {

		webMDSignUp.signUpBtn();

	}

	@Then("^user should recieve error text \"([^\"]*)\"$")
	public void user_should_recieve_error_text(String arg1) {

		String actualErrorText = webMDSignUp.errorText();
		boolean bool = false;

		if (actualErrorText.contains("Sorry, this email address is already taken.")) {

			Assert.assertEquals(bool, true);
		}

	}

}
