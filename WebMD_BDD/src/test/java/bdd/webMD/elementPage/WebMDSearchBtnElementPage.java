package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDSearchBtnElementPage {
	
	@FindBy(xpath = "//*[@id=\'masthead-search-div\']/input")
	public WebElement searchData;
	
	@FindBy (xpath = "//*[@id=\'masthead-search-div\']/button")
	public WebElement searchBtnIcon;
	
	@FindBy (xpath = "//*[@id=\"ContentPane28\"]/div[3]/aside[1]/header/div/p[2]")
	public WebElement errorMsg;
	
 
}
