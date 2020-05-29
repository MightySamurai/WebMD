package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDSearchButtonActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDSearchButnSetpDef {
	WebMDSearchButtonActions searchBtnAction = new WebMDSearchButtonActions ();
	
	
	@When("^User input Data \"([^\"]*)\" in the search$")
	public void user_input_Data_in_the_search(String Data)  {
		searchBtnAction.inputSearchBox(Data);
	    
	}

	@When("^User clicks on search icon$")
	public void user_clicks_on_search_icon()  {
		searchBtnAction.inputSearchIcon();
	    
	    
	}

	@Then("^User should recieve an error text$")
	public void user_should_recieve_an_error_text()  {
		
		String actualErrorMessage = searchBtnAction.errorText();

		boolean bool = false;

		if (actualErrorMessage.contains("There are no results matching your search.")) {
			bool = true;
		

		Assert.assertEquals(bool, true);
		} 
	    
	    
	}

	@When("^User input correctData \"([^\"]*)\" in the search$")
	public void user_input_correctData_in_the_search(String data)  {
		searchBtnAction.inputSearchBox(data);
	    
	}

	@Then("^User should see result page$")
	public void user_should_see_result_page()  {
		String expectedTitle = "WebMD Health Search";
		String actualTitle = searchBtnAction.getSearchPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	    
	}
	

}
