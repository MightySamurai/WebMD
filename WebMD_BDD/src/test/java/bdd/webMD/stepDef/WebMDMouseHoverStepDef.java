package bdd.webMD.stepDef;

import bdd.webMD.actionPage.WebMDMouseHoverActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDMouseHoverStepDef {
	WebMDMouseHoverActions webMDMouseHover = new WebMDMouseHoverActions();

	@When("^user hover over LIVING HEALTHY section$")
	public void user_hover_over_LIVING_HEALTHY_section() {
		webMDMouseHover.hoverlivingHealthy();
	}

	@When("^user clich Health Beauty form the LIVING HEALTHY dropdown$")
	public void user_clich_Health_Beauty_form_the_LIVING_HEALTHY_dropdown()throws Exception {
		webMDMouseHover.selectHealthBeauty();

		/*
		 * }
		 * 
		 * @When("^user hover over HEALTH A-Z SECTION$") public void
		 * user_hover_over_HEALTH_A_Z_SECTION() { webMDMouseHover.healthAtoZ();
		 * 
		 * }
		 * 
		 * @Then("^user hover over DRUG & SUPPLEMENTS section$") public void
		 * user_hover_over_DRUG_SUPPLEMENTS_section() {
		 * webMDMouseHover.drugAndSuplement();
		 * 
		 * }
		 * 
		 * @Then("^user click Drugs from the DRUG & SUPLEMENTS dropdown$") public void
		 * user_click_Drugs_from_the_DRUG_SUPLEMENTS_dropdown() {
		 * webMDMouseHover.selectDrug();
		 */
	}

}
