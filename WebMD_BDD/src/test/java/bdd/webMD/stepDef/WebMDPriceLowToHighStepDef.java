package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDPriceLowToHighActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDPriceLowToHighStepDef {
	
	WebMDPriceLowToHighActions priceActions = new WebMDPriceLowToHighActions ();
	
	@Given("^WebMDRx page launched$")
	public void webmdrx_page_launched() {
		priceActions.getwebMDPriceLowToHighPage();

	}

	@When("^User Enter DrugName \"([^\"]*)\" in the search box$")
	public void user_Enter_DrugName_in_the_search_box(String DrugName) {
		priceActions.inputSearchBox(DrugName);

	}

	@When("^User clicks Find Lowest Prices button$")
	public void user_clicks_Find_Lowest_Prices_button() {
		priceActions.inputPriceBtn();

	}

	
	  @When("^User lands on lands on Ibuprofen Prices and Copupons page$") 
	  public void user_lands_on_lands_on_Ibuprofen_Prices_and_Copupons_page() {
		  
		  String expectedTitle = "Ibuprofen Coupons. Compare Prescription Prices and Print Coupons with webMDRx";
		  String actualTitle = priceActions.getPriceAndCouponPageTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  }
	 
	/*
	 * @When("^User clicks on QuantityDrobDown$") public void
	 * user_clicks_on_QuantityDrobDown() {
	 * 
	 * 
	 * }
	 */

	@When("^User select the quantity \"([^\"]*)\"$")
	public void user_select_the_quantity(String quantity) {
		priceActions.inputNumberOfQuant(quantity);
		

	}

	@Then("^User Should see medicine pricing list form low to high for the amounth they've selected$")
	public void user_Should_see_medicine_pricing_list_form_low_to_high_for_the_amounth_they_ve_selected() {

	}

}
