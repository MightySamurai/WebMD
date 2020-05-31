package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDMapElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDMapActionPage {
	
	WebMDMapElementPage MapPageElements;
	
	public WebMDMapActionPage () {
		this.MapPageElements = new WebMDMapElementPage ();
		PageFactory.initElements(SetupDrivers.chromeDriver, MapPageElements);
	}
	public void getWebMDHomePage () {
		SetupDrivers.chromeDriver.get("https://www.https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void popUP () {
		MapPageElements.popup.click();
	}
	public void coronaUpdateBtn () {
		MapPageElements.coronaUpdate.click();
		
		
	}
	public void usaMap () {
		MapPageElements.nyMap.click();
		
	}
	public String updateResult () {
		return MapPageElements.nyUpdate.getText();
		
	}
	
	}
	
	

