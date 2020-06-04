package bdd.webMD.stepDef;

import org.testng.Assert;

import bdd.webMD.actionPage.WebMDBMIActionPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDBMIStepDef {

	WebMDBMIActionPage webMDBMI = new WebMDBMIActionPage();

	@When("^User clicks on BMI calculator under popular tools$")
	public void user_clicks_on_BMI_calculator_under_popular_tools() {
		webMDBMI.BMICalcbtn();

	}

	@When("^User input height feet \"([^\"]*)\" inch \"([^\"]*)\"$")
	public void user_input_height_feet_inch(String feet, String inch) throws Throwable {
		webMDBMI.BMIFeet(feet);
		webMDBMI.BMIInch(inch);
	}

	@When("^User input weight \"([^\"]*)\"$")
	public void user_input_weight(String weight) {

		webMDBMI.BMIWeight(weight);
	}

	@When("^User clicks Calculate$")
	public void user_clicks_Calculate() {
		webMDBMI.BMIcalcBtn();
	}

	@Then("^User should be able to see the BMI result$")
	public void user_should_be_able_to_see_the_BMI_result() {
		String actualResult = webMDBMI.resultBMI();
		
		boolean bool = false;
		
		if (actualResult.contains("Result")) {
			bool = true;
		
			Assert.assertEquals(bool, true);
			
			System.out.println("Actual result: " + actualResult);

		}

	}
}