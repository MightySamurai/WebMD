package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDBMIElementPage;
import bdd.webMD.elementPage.WebMDMapElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDBMIActionPage {
	WebMDBMIElementPage BMIPageElements;
	
	public WebMDBMIActionPage () {
		this.BMIPageElements = new WebMDBMIElementPage ();
		PageFactory.initElements(SetupDrivers.chromeDriver, BMIPageElements);
		
	}  public void getWebMDHomePage () {
		SetupDrivers.chromeDriver.get("https://www.https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

}
