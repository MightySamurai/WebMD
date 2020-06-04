package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDPriceLowToHighActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDPriceLowToHighStepDef {

	WebMDPriceLowToHighActions priceActions = new WebMDPriceLowToHighActions();

	@Given("^WebMDRx page launched$")
	public void webmdrx_page_launched() {
		priceActions.getwebMDPriceLowToHighPage();

	}

	@When("^User Enter DrugName \"([^\"]*)\" in the search box$")
	public void user_Enter_DrugName_in_the_search_box(String DrugName) {
		priceActions.inputSearchBox(DrugName);

	}

	@When("^User select Advil \\(Ibuprofen\\) from dropdown list$")
	public void user_select_Advil_Ibuprofen_from_dropdown_list() {
		priceActions.selectAdvil();

	}
	
	@Then("^User select Form \"([^\"]*)\" from DropDown$")
	public void user_select_Form_from_DropDown(String Form)throws Exception {
		priceActions.medQuantity(Form);
	
	}

	/*
	 * @When("^User select twelve from quantity dropdown list$") public void
	 * user_select_twelve_from_quantity_dropdown_list(String Form) {
	 * priceActions.medQuantity(Form);
	 * 
	 * }
	 */


	@Then("^User Should see medicine pricing list form low to high for the amounth they've selected$")
	public void user_Should_see_medicine_pricing_list_form_low_to_high_for_the_amounth_they_ve_selected() {
		
		String actualResult = priceActions.confirmResultPage();
		
		
		boolean bool = true;
		
		if (actualResult.contains("Price and coupons for")) {
			bool = true;
			
			Assert.assertEquals(bool, true);
			
System.out.println("Result Confirmation Text: " + actualResult);
			
		}

	}

}
