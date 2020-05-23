package bdd.webMD.elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebMdSignInElementPage {

	@FindBy(xpath = "//*[@id=\'ContentPane1\']/nav/div[1]/div[3]/ul/li[1]/a")
	public WebElement signIn;
	
	@FindBy(xpath = "//*[@id=\'signinForm\']/div/div/div/div/form/fieldset/div[2]/div[1]/input")
	public WebElement email;
	
	@FindBy(xpath = "// *[@id=\'signinForm\']/div/div/div/div/form/fieldset/div[3]/div[1]/input")
	public WebElement password;
	
	@FindBy(xpath = "// *[@id=\'signinForm\']/div/div/div/div/form/fieldset/div[6]/span[1]/input")
	public WebElement signInBtn;
	
	@FindBy(xpath = "//*[@id=\'signinForm\']/div/div/div/div/form/fieldset/div[3]/div[2]/span")
	public WebElement errorMessage;
}
