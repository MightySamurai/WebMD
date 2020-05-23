package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDFindDoctorElementPage {
	@FindBy(xpath = "//*[@id=\'ContentPane1\']/nav/div[1]/div[2]/ul[1]/li[2]/a")
	public WebElement findDoc;
	
	@FindBy(xpath = "//*[@id=\'searchkeywords_desktop\']")
	public WebElement searchKey;
	
	@FindBy(xpath = "//*[@id=\'searchlocation_desktop\']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//*[@id=\'serp-block-form\']/div/div/div[4]/div/div/button")
	public WebElement searchBtn;

}

