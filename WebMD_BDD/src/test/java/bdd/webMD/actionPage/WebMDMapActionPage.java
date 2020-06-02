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
	public void getWebMDCoronaPage () {
		SetupDrivers.chromeDriver.get("https://www.webmd.com/coronavirus");
		SetupDrivers.chromeDriver.manage().window().maximize();

		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	//public void popUP () {
	//	MapPageElements.popup.click();
	//}
	//public void coronaUpdateBtn () {
		//MapPageElements.coronaUpdate.click();
		
		
	 
	public void usaMap () throws Exception { 
		Thread.sleep(5000);
		MapPageElements.nyMap.click();
		Thread.sleep(5000);
		
		
	}
	public String updateResult () throws Exception {
		Thread.sleep(5000);
		return MapPageElements.nyUpdate.getText();
		
	}
	
	}
	
	

