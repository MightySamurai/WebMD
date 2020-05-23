package bdd.webMD.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver chromeDriver;

	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().version("83.0.4103.39").setup();
		
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		chromeDriver = new ChromeDriver();
	}

	public static WebDriver getChromeDriver() {
		return chromeDriver;
	}

	public static void tearDownChromeDriver() {
		chromeDriver.quit();
	}

}


