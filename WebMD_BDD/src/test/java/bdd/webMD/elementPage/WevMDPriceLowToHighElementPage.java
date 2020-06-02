package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WevMDPriceLowToHighElementPage {

	@FindBy (xpath = "//*[@id=\'app\']/div[2]/div/div[9]/div/div/div/div[1]/div/div[1]/input")
	public WebElement SearchBox;
	
	@FindBy (xpath ="//div[@class='Textconatiner']")
	public WebElement PriceBtn;
	
	@FindBy (xpath = "//*[@id=\'main-section\']/div/div[1]/div/div[1]/h1")
	public WebElement PriceAndCoupon;
	
	@FindBy (xpath = "//*[@id=\'main-section\']/div/div[1]/div/div[1]/div[2]/div/div[4]/div[2]/div/input")
	public WebElement QntDropDown;
	
 	@FindBy (xpath = "//div[4]//div[2]//div[1]//input[1]")
	 public WebElement NumberOfQuant;
	
	@FindBy (xpath = "//*[@id=\'main-section\']/div/div[1]/div/div[2]")
	public WebElement ResultPage;

}
