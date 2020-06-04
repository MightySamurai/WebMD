package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDMouseHoverElementPage {
	
	@FindBy (xpath = "//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[2]/li[3]")
	public WebElement livingHealthy; 
	
	@FindBy (xpath = "//*[@id=\'ContentPane1\']/nav/div[1]/div[2]/ul[2]/li[3]/div/div/div[1]/div[2]/ul/li[1]/a")
	public WebElement healthBeauty;
	
	/*
	 * @FindBy (xpath = "//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[2]/li[1]")
	 * public WebElement healthAtoZ;
	 * 
	 * @FindBy (xpath =
	 * "//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[2]/li[2]/a[1]") public
	 * WebElement drugAndSuplement;
	 * 
	 * @FindBy (xpath =
	 * "//li[2]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]") public
	 * WebElement drug;
	 */

}
