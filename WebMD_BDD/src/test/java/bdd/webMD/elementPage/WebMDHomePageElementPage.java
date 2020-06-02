package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDHomePageElementPage {
	@FindBy (xpath ="//li[@class='global-nav-subscribe']//a[@class='button'][contains(text(),'Subscribe')]")
	public WebElement subscribeBtn;
	
	
	
	

}
