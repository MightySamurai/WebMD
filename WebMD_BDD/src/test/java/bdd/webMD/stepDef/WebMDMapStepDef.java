package bdd.webMD.stepDef;

import bdd.webMD.actionPage.WebMDMapActionPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDMapStepDef {
	
	WebMDMapActionPage webMDMap = new WebMDMapActionPage ();
	
	@When("^User click on coronavirus update$")
	public void user_click_on_coronavirus_update() {
		webMDMap.coronaUpdateBtn();
		
	}

	@When("^User click on new york state on the map$")
	public void user_click_on_new_york_state_on_the_map() {
		webMDMap.usaMap();
	}

	@Then("^User should see coronavirus update for new york state$")
	public void user_should_see_coronavirus_update_for_new_york_state() {
		webMDMap.updateResult();
		
	}



}
