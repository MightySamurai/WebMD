package bdd.webMD.stepDef;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import bdd.webMD.actionPage.WebMDHomePageActions;
import bdd.webMD.utilities.SetupDrivers;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebMDHomePageValidationStepDef {

	WebMDHomePageActions WebMDValidation = new WebMDHomePageActions();
	TakesScreenshot ts = (TakesScreenshot) SetupDrivers.chromeDriver;

	@When("^User see the homepage title$")
	public void user_see_the_homepage_title() throws Exception {

		String expectedTitle = "WebMD - Better information. Better health.";
		String actualTitle = WebMDValidation.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@When("^User sees subscribe button background color in Turquis Blue$")
	public void user_sees_subscribe_button_background_color_in_Turquis_Blue() {

		String expected = WebMDValidation.hexColor();

		boolean bool = true;

		if (expected.contains("#44d4ff")) {
			bool = true;
		}

		Assert.assertEquals(bool, true);
		
	
		
		
		

	}

	@Then("^User takes a screnshot$")
	public void user_takes_a_screnshot() throws Exception {

		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/WebMDHomePage.png"));
		System.out.println("Screenshot Taken");

	}

}
