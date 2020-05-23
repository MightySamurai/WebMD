package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMdSignInElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDSignInPageAction {
	WebMdSignInElementPage signInPageElements;

	public WebMDSignInPageAction() {
		this.signInPageElements = new WebMdSignInElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, signInPageElements);
	}

	public void getWebMDLoginPage() {

		SetupDrivers.chromeDriver.get("https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void inputEmail(String str) {
		
		signInPageElements.email.sendKeys(str);
		
	}
	
	public void inputPassword(String str) {
		signInPageElements.password.sendKeys(str);
	}

	public void signInBtn() {
		signInPageElements.signInBtn.click();
	}

	public String errorMessage() {
		return signInPageElements.errorMessage.getText();
	}

	
	public String getSignInPageTitle(){
		String webMDSignInPageTitle =  SetupDrivers.chromeDriver.getTitle();
		return webMDSignInPageTitle;
	}
	
	public String getHomePageTitle(){
		String webMDHomePageTitle =  SetupDrivers.chromeDriver.getTitle();
		return webMDHomePageTitle;	
	
}
	
}