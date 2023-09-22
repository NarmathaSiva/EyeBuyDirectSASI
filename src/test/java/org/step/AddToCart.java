package org.step;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.AddToCartPageObjects;
import org.pojo.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCart extends BaseClass{
	
	
	@Given("User has to enter the {string} and {string} and click signin")
	public void user_has_to_enter_the_and_and_click_signin(String Username, String Password) {
		
		LoginPageObjects l = new LoginPageObjects();
		WebElement email = l.getEmail();
		WebElement pw = l.getPw();
		email.sendKeys(Username);
		pw.sendKeys(Password);
		clickElement(l.getClickSignIn());
	}
	
	@When("User has to go to the Add to Cart Page")
	public void user_has_to_go_to_the_Add_to_Cart_Page() throws InterruptedException {
		
		AddToCartPageObjects add = new AddToCartPageObjects();
	    Thread.sleep(5000);	    
	    clickElement(add.getCart());	    
	    
	}	

	@Then("User has to validate the number of items in cart")
	public void user_has_to_validate_the_number_of_items_in_cart() {
	    
		AddToCartPageObjects add = new AddToCartPageObjects();
		List<WebElement> items = add.getCartItems();
		System.out.println("Number of Items in Cart: " + items.size());
		
		
	}


}
