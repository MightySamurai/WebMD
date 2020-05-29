package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDSearchBtnElementPage;

import bdd.webMD.utilities.SetupDrivers;

public class WebMDSearchButtonActions {
	WebMDSearchBtnElementPage searchbuttonPageElements;

	public WebMDSearchButtonActions() {
		this.searchbuttonPageElements = new WebMDSearchBtnElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, searchbuttonPageElements);
	}

	public void getWebMDLoginPage() {

		SetupDrivers.chromeDriver.get("https://member.webmd.com/register");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputSearchBox(String str) {
		
		searchbuttonPageElements.searchData.click();

		searchbuttonPageElements.searchData.sendKeys(str);
	}

	public void inputSearchIcon() {
		
		searchbuttonPageElements.searchBtnIcon.click();
	}

	public String errorText() {
		return searchbuttonPageElements.errorMsg.getText();
	}

	public String getSearchPageTitle() {
		String searchPageTitle = SetupDrivers.chromeDriver.getTitle();
		return searchPageTitle;
	}


	}


