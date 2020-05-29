package bdd.webMD.stepDef;



import bdd.webMD.actionPage.WebMDMouseHoverActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WebMDMouseHoverStepDef{
	WebMDMouseHoverActions webMDMouseHover = new WebMDMouseHoverActions () ;

	
	@When("^user hover over LIVING HEALTHY section$")
	public void user_hover_over_LIVING_HEALTHY_section()  {
		webMDMouseHover.hoverlivingHealthy();
	}

	@When("^user hover over HEALTH A-Z SECTION$")
	public void user_hover_over_HEALTH_A_Z_SECTION()  {
		webMDMouseHover.healthAtoZ();
	    
	}

	@Then("^user hover over DRUG & SUPLEMENTS section$")
	public void user_hover_over_DRUG_SUPLEMENTS_section()  {
		webMDMouseHover.drugAndSuplement();
		
	    
	}



}
