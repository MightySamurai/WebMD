package bdd.webMD.actionPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMdSignInElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDSignInPageAction {
	TakesScreenshot ts = (TakesScreenshot) SetupDrivers.chromeDriver;
	
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
	
	public void inputEmail(String str) throws Exception {
		
		signInPageElements.email.sendKeys(str);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/WebMDSignInEmail.png"));
		System.out.println("Screenshot Taken");
		
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