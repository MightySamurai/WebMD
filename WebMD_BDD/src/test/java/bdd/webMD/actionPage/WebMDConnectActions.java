package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDConnectElementPage;

import bdd.webMD.utilities.SetupDrivers;

public class WebMDConnectActions {
	JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.chromeDriver;
	
	WebMDConnectElementPage connectPageElements;

	public WebMDConnectActions () {
		this.connectPageElements = new WebMDConnectElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, connectPageElements);
	}

	public void getWebMDLoginPage() {

		SetupDrivers.chromeDriver.get("https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void scrollDown () {
		
		js.executeScript("window.scrollBy(0,1900)");
		
	}
	public void  faceBookBtn () {
		connectPageElements.faceBook.click();
	}

}
