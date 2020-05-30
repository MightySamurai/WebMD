package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDMapElementPage {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/h4/span")
	public WebElement coronaUpdate;
	
	@FindBy(xpath = "//*[@id=\"ContentPane12\"]/section/div/div/div[2]/div[3]/svg/g/path[31]")
	public WebElement nyMap;
	
	@FindBy(xpath = "//*[@id=\"ContentPane12\"]/section/div/div/div[3]/div[2]/div/section[2]")
	public WebElement nyUpdate;
	
	

}
