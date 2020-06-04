package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import bdd.webMD.elementPage.WebMDListWebElementsHomepageElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDListWebElementsHomepageActions {

	WebMDListWebElementsHomepageElementPage WebMDListElement;

	public WebMDListWebElementsHomepageActions() {
		this.WebMDListElement = new WebMDListWebElementsHomepageElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, WebMDListElement);
	}

	public void getWebMDHomePage() {
		SetupDrivers.chromeDriver.get("https://www.https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void getListWebElements() throws Exception {

		boolean isChecked = false;

		int size = WebMDListElement.objLinks.size();

		for (int i = 0; i < size; i++) {
			isChecked = WebMDListElement.objLinks.get(i).isSelected();

			if (!isChecked) {

				WebMDListElement.objLinks.get(i).click();

				Thread.sleep(5000);

			}

		}

	}

}
