package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.webMD.elementPage.WevMDPriceLowToHighElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDPriceLowToHighActions {
	
	Actions act = new Actions(SetupDrivers.chromeDriver);
	JavascriptExecutor jvSE = (JavascriptExecutor) SetupDrivers.chromeDriver;
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
	
	public void selectAdvil () {
		act.moveToElement(priceElementPage.advil).build().perform();
		priceElementPage.advil.click();
		
	}
	
	public void medQuantity (String Cup) throws Exception{
		priceElementPage.quantityAmount.sendKeys(Keys.DOWN);
		priceElementPage.quantityAmounts.click();
		Thread.sleep(5000);
		
	}
	
	/*
	 * public void medQuantity () { Select med = new
	 * Select(priceElementPage.quantityAmount); med.selectByVisibleText("Cup");
	 * 
	 * }
	 */


	public String confirmResultPage() {
		return priceElementPage.ResultPage.getText();

	}

}
