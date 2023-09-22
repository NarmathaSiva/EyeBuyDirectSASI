package org.step;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	@Given("User has to enter {string} and {string}")
	public void user_has_to_enter_and(String Username, String Password) {
		
		LoginPageObjects l = new LoginPageObjects();
		WebElement email = l.getEmail();
		email.sendKeys(Username);
		WebElement pw = l.getPw();
		pw.sendKeys(Password);		
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() throws InterruptedException {
		
		LoginPageObjects l = new LoginPageObjects();
		WebElement clickSignIn = l.getClickSignIn();
		clickSignIn.click();
		Thread.sleep(5000);
	}

	@Then("User has to verify the credentials page")
	public void user_has_to_verify_the_credentials_page() throws InterruptedException {
		LoginPageObjects l = new LoginPageObjects();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		if(url.contains("passport")) {
			System.out.println("invalid credentials");
		}
		else {
			System.out.println("valid credentials");
		}		
			
	}
	
}
