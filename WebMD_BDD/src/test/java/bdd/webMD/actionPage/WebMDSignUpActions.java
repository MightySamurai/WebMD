package bdd.webMD.actionPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.webMD.elementPage.WebMDSignUpElementPage;
import bdd.webMD.utilities.SetupDrivers;

public class WebMDSignUpActions {
	WebMDSignUpElementPage signUpPageElements;

	public WebMDSignUpActions() {
		this.signUpPageElements = new WebMDSignUpElementPage();
		PageFactory.initElements(SetupDrivers.chromeDriver, signUpPageElements);
	}

	public void getwebMDSignUpPage() {
		SetupDrivers.chromeDriver.get("https://member.webmd.com/register?appid=1&returl=https%3A%2F%2Fwww.webmd.com%2F");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void inputEmail(String str) {
		signUpPageElements.Email.sendKeys(str);

	}

	public void inputPassword(String str) {
		signUpPageElements.Password.sendKeys(str);
	}

	public int inputDateOfBirth(int i) {
		signUpPageElements.DateOfBirth.sendKeys();
		return signUpPageElements.DateOfBirth.hashCode();
	}

	public void signUpBtn() {
		signUpPageElements.SignUpBtn.click();
	}

	public String errorText() {
		return signUpPageElements.ErrorText.getText();
	}

}
