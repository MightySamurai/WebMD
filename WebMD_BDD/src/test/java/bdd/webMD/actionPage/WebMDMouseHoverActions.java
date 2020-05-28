package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDMouseHoverElementPage;
import bdd.webMD.utilities.SetupDrivers;


public class WebMDMouseHoverActions{
	
	Actions act = new Actions (SetupDrivers.chromeDriver);
	JavascriptExecutor jvSE = (JavascriptExecutor) SetupDrivers.chromeDriver;
	WebMDMouseHoverElementPage mouseHoverElements;


	public WebMDMouseHoverActions() {
		this.mouseHoverElements = new WebMDMouseHoverElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, mouseHoverElements);
		
		
	}

	public void getWebMDLoginPage() {

		SetupDrivers.chromeDriver.get("https://www.webmd.com");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	public void hoverlivingHealthy ()  {
		act.moveToElement(mouseHoverElements.livingHealthy).build().perform();
		
	}
	public void healthAtoZ ()  {
		act.moveToElement(mouseHoverElements.healthAtoZ).build().perform();
		
	}
	
	public void drugAndSuplement ()  {
		act.moveToElement(mouseHoverElements.drugAndSuplement).build().perform();
		
	}

}
