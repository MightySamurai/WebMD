package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDSearchButtonElementPage {

	@FindBy(xpath = "//*[@id=\'global-nav-search\']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\'global-nav-search-form\']/button")
	public WebElement searchIcon; 
	
	@FindBy (xpath = "//*[@id=\'ContentPane28\']/div[3]/aside[1]/header/div/p[2]")
	public WebElement errorText;
	/*
	 * @FindBy(xpath = "//*[@id=\'ContentPane13\']/div/aside/header") public
	 * WebElement searchHeader;
	 */
	

}
