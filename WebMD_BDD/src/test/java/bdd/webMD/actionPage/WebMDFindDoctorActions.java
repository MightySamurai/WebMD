package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDFindDoctorElementPage;

import bdd.webMD.utilities.SetupDrivers;

public class WebMDFindDoctorActions {
	Actions act = new Actions(SetupDrivers.chromeDriver);
	JavascriptExecutor jvSE = (JavascriptExecutor) SetupDrivers.chromeDriver;
	WebMDFindDoctorElementPage findDoctorElementPage;

	public WebMDFindDoctorActions() {
		this.findDoctorElementPage = new WebMDFindDoctorElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, findDoctorElementPage);

	}

	public void getWebMDHomePage() {
		SetupDrivers.chromeDriver.get("https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void inputfindDoc() {
		findDoctorElementPage.findDoc.click();
	}

	public void inputsearchKey(String str) {
		findDoctorElementPage.searchKey.sendKeys(str);
		act.moveToElement(findDoctorElementPage.chestPain).build().perform();
		findDoctorElementPage.chestPain.click();
	}

	public void inputzipCode(String str) {
		findDoctorElementPage.zipCode.sendKeys(str);
	}

	public void inputsearchBtn() {
		act.moveToElement(findDoctorElementPage.searchBtn).build().perform();
		findDoctorElementPage.searchBtn.click();

	}

	public String getFindDocPageTitle() {
		String webMDFindDocPageTitle = SetupDrivers.chromeDriver.getTitle();
		return webMDFindDocPageTitle;
	}

}
