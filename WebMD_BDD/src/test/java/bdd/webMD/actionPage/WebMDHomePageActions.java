package bdd.webMD.actionPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDHomePageElementPage;

import bdd.webMD.utilities.SetupDrivers;

public class WebMDHomePageActions {
	TakesScreenshot ts = (TakesScreenshot) SetupDrivers.chromeDriver;

	WebMDHomePageElementPage HomePageElements;

	public WebMDHomePageActions() {
		this.HomePageElements = new WebMDHomePageElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, HomePageElements);
	}

	public void getWebMDHomePage() {

		SetupDrivers.chromeDriver.get("https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public String getHomePageTitle() throws Exception {
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/WebMDHomePageValidation.png"));
		System.out.println("Screenshot Taken");

		String webMDHomePageTitle = SetupDrivers.chromeDriver.getTitle();
		return webMDHomePageTitle;

	}

	public String color() {
		return HomePageElements.subscribeBtn.getCssValue("background-color");

	}
	public String hexColor () {
		return  Color.fromString(color()).asHex ();
		
	}

	

}
