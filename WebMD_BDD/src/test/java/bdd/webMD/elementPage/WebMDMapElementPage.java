package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDMapElementPage {
	
	
	//@FindBy (id = "webmdHoverClose")
	//public WebElement popup;
	
	// @FindBy(xpath = "/html/body/div[2]/div/div/h4/span") 
	// public WebElement coronaUpdate;
	
	@FindBy(xpath = "//div[@class='leaflet-pane leaflet-overlay-pane']//*[local-name()='svg']//*[name()='g']//*[name()='path'][31]") 
	public WebElement nyMap;
	
	@FindBy(xpath = "//*[@id=\'ContentPane12\']/section/div/div/div[3]/div[2]/div/section[2]/h2") 
	public WebElement nyUpdate;
	
	

}
