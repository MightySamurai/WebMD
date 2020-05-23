package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMDSignUpElementPage {
	@FindBy(xpath = "//*[@id=\'signupForm\']/div/div/div[2]/div[1]/form/fieldset/div[1]/div[1]/input")
	public WebElement Email;
	
	@FindBy(xpath = "//*[@id=\'signupForm\']/div/div/div[2]/div[1]/form/fieldset/div[2]/div[1]/input")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id=\'signupForm\']/div/div/div[2]/div[1]/form/fieldset/div[4]/div[1]/input")
	public WebElement DateOfBirth;
	
    @FindBy(xpath = "//*[@id=\'signupForm\']/div/div/div[2]/div[1]/form/fieldset/div[7]/span[1]/input")
	public WebElement SignUpBtn;
	
    @FindBy(xpath = "//*[@id=\'signupForm\']/div/div/div[2]/div[1]/form/fieldset/div[1]/div[2]/span")
   	public WebElement ErrorText;
    
	
	


}



