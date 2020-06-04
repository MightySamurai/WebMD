package bdd.webMD.stepDef;

import bdd.webMD.actionPage.WebMDListWebElementsHomepageActions;
import cucumber.api.java.en.Then;

public class WebMDListWebElementsHomepageStepDef {

	WebMDListWebElementsHomepageActions WebMDListActions = new WebMDListWebElementsHomepageActions();

	@Then("^User get lists of WebElements and loop it and get all text of WebMd homepage$")
	public void user_get_lists_of_WebElements_and_loop_it_and_get_all_text_of_WebMd_homepage() throws Exception {

		WebMDListActions.getListWebElements();

	}

}
