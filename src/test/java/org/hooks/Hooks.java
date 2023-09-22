package org.hooks;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPageObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order=0)
	public void launchBrowser1() {
		launchBrowser("chrome");
	    launchURL("https://www.eyebuydirect.com/");
	    maxiWindow();
	    impWait(20);
	}
	
	@Before(order=1)
	public void signIn() {
		LoginPageObjects l = new LoginPageObjects();
	    WebElement popUp = l.getPopUp();
	    waitUntil(25000, popUp);
	    clickElement(popUp);
	    WebElement signIn = l.getSignIn();
	    clickElement(signIn);
	}
	
	@After
	public void closeBrowser1() {
		driver.close();
	}


}
