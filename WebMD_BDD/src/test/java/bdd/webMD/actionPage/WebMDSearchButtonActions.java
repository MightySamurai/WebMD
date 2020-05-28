package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDSearchButtonElementPage;
import bdd.webMD.elementPage.WebMdSignInElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDSearchButtonActions {
	WebMDSearchButtonElementPage searchbuttonPageElements;

	public WebMDSearchButtonActions() {
		this.searchbuttonPageElements = new WebMDSearchButtonElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, searchbuttonPageElements);
	}

	public void getWebMDLoginPage() {

		SetupDrivers.chromeDriver.get("https://member.webmd.com/signin?appid=1&returl=https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputSearchBox(String str) {
		searchbuttonPageElements.searchBox.click();
		searchbuttonPageElements.searchBox.sendKeys(str);
	}

	public void inputSearchIcon() {
		searchbuttonPageElements.searchIcon.click();
	}

	public String errorText() {
		return searchbuttonPageElements.errorText.getText();
	}

	public String getSearchPageTitle() {
		String searchPageTitle = SetupDrivers.chromeDriver.getTitle();
		return searchPageTitle;
	}


	}


