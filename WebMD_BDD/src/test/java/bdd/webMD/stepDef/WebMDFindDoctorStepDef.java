package bdd.webMD.stepDef;

import bdd.webMD.actionPage.WebMDFindDoctorActions;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;

public class WebMDFindDoctorStepDef {
	
	WebMDFindDoctorActions webMDFindDoc = new WebMDFindDoctorActions ();
	
	

	@Given("^WebMD homepage launched$")
	public void webmd_homepage_launched() {
		webMDFindDoc.getWebMDHomePage();
		
	}

	@When("^User clicks on FIND A DOCTOR$")
	public void user_clicks_on_FIND_A_DOCTOR() {
		webMDFindDoc.inputfindDoc();

		
	}

	@When("^User input condition \"([^\"]*)\" and ZipCode \"([^\"]*)\"$")
	public void user_input_condition_and_ZipCode(String condition, String ZipCode) {
		webMDFindDoc.inputsearchKey(condition);
		webMDFindDoc.inputzipCode(ZipCode);
		
	}

	@When("^User clicks Search for doctors button$")
	public void user_clicks_Search_for_doctors_button() {
		webMDFindDoc.inputsearchBtn();
		
	}


}
