package bdd.webMD.stepDef;

import bdd.webMD.actionPage.WebMDConnectActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDConnectStepDef {
	
	WebMDConnectActions webMDConnect = new WebMDConnectActions ();

	@When("^User scroll down on homepage$")
	public void user_scroll_down_on_homepage() {
		webMDConnect.scrollDown();

	}

	@When("^User click on facebook icon from dropdown banner$")
	public void user_click_on_facebook_icon_from_dropdown_banner() {
		
		webMDConnect.faceBookBtn();

	}

	@Then("^User should be able to connect to facebook$")
	public void user_should_be_able_to_connect_to_facebook() {

	}

}
