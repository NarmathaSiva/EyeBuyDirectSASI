package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects extends BaseClass {
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement popUp;
	
	@FindBy(xpath="//a[@title='Sign In']")
	private WebElement signIn;
	
	@FindBy(xpath="(//input[@type='email'])[3]")
	private WebElement email;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	private WebElement pw;
	
	@FindBy(xpath="(//button[text()='Sign in'])[2]")
	private WebElement clickSignIn;
	
	@FindBy(xpath="//div[text()='No match for email address and/or password.']")
	private WebElement noMatch;
	
	public WebElement getPopUp() {
		return popUp;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getClickSignIn() {
		return clickSignIn;
	}

	public WebElement getNoMatch() {
		return noMatch;
	}
	

}
