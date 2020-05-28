package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WevMDPriceLowToHighElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDPriceLowToHighActions {
	WevMDPriceLowToHighElementPage priceElementPage;

	public WebMDPriceLowToHighActions() {
		this.priceElementPage = new WevMDPriceLowToHighElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, priceElementPage);

	}

	public void getwebMDPriceLowToHighPage() {
		SetupDrivers.chromeDriver.get("https://www.webmd.com/rx");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputSearchBox(String str) {
		priceElementPage.SearchBox.sendKeys(str);
	}

	public void inputPriceBtn() {
		priceElementPage.PriceBtn.click();
	}

	
	  public String getPriceAndCouponPageTitle() {
		  String  webMDPriceAndCouponPageTitle = SetupDrivers.chromeDriver.getTitle();
		  return webMDPriceAndCouponPageTitle;
		  
		  
		  //priceElementPage.PriceAndCoupon.getText();
	  
	  }
	  
	//  public void inputQntDropDown() { priceElementPage.QntDropDown.click(); }
	 
	
	public void inputNumberOfQuant(String str) {
		priceElementPage.NumberOfQuant.sendKeys(str);

	}

	public String confirmResultPage() {
		return priceElementPage.ResultPage.getText();

	}

}
