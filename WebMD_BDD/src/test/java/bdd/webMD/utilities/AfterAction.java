package bdd.webMD.utilities;
import cucumber.api.java.After;

public class AfterAction {
	
	// @After
	public void afterAction () {
		SetupDrivers.tearDownChromeDriver();
	}

}



