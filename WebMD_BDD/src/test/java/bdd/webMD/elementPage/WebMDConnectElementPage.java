package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDConnectElementPage {
	
	@FindBy (id = "webmdHoverClose")
	public WebElement popup;
	
	@FindBy (xpath = "//*[@id=\'ContentPane1\']/nav/div[2]/div/div[1]/div/a[1]")
	public WebElement faceBook;	

}
