package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDBMIElementPage {
	
	@FindBy(xpath = "//*[@id=\'ContentPane36\']/aside/ul/li[1]/a/h4")
	public WebElement BMICalc;
	
	@FindBy(xpath = "//*[@id=\'ContentPane30\']/bmi-calculator/bmi-step/div[1]/form/div[1]/label[1]/input")
	public WebElement feet;
	
	@FindBy(xpath = "//*[@id=\'ContentPane30\']/bmi-calculator/bmi-step/div[1]/form/div[1]/label[2]/input")
	public WebElement inch;
	
	@FindBy(xpath = "//*[@id=\'ContentPane30\']/bmi-calculator/bmi-step/div[1]/form/div[2]/label/input")
	public WebElement weight;
	
	@FindBy(xpath = "//button[contains(text(),'Calculate')]")
	public WebElement calcBtn;
	
	@FindBy (xpath = "//*[@id=\'ContentPane30\']/bmi-calculator/bmi-step/div/h3")
	public WebElement result;
	
	@FindBy (id = "webmdHoverClose")
	public WebElement popUp;
	
	
	
	
	
	

}
