package org.step;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.CheckOutPageObjects;
import org.pojo.LoginPageObjects;
import org.pojo.PaymentPageObjects;
import org.pojo.SunGlassesPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAndBuy extends BaseClass{
	
	@Given("User has to SighIn the application with {string} and {string}")
	public void user_has_to_SighIn_the_application_with_and(String Username, String Password) throws InterruptedException {
		
		LoginPageObjects l = new LoginPageObjects();
	    WebElement email = l.getEmail();
		email.sendKeys(Username);
		WebElement pw = l.getPw();
		pw.sendKeys(Password);
		WebElement clickSignIn = l.getClickSignIn();
		clickSignIn.click();
		Thread.sleep(5000);
	    
	    SunGlassesPageObjects s = new SunGlassesPageObjects();
		impWait(20);
		scrollDown(9);		
		Thread.sleep(3000);
		WebElement sunGlass = s.getSunGlass();			
		clickElement(sunGlass);
	}

	@When("User has to search the product")
	public void user_has_to_search_the_product() throws InterruptedException {
		SunGlassesPageObjects s = new SunGlassesPageObjects();
		WebElement searchProduct = s.getSearchProduct();
		searchProduct.click();
		Thread.sleep(3000);
		WebElement submitSearch = s.getSubmitSearch();
		submitSearch.sendKeys("good vibrations");
		Thread.sleep(5000);
		WebElement goodVibration = s.getGoodVibration();
		goodVibration.click();
	}

	@Then("User has to select the product in the below and add to cart")
	public void user_has_to_select_the_product_in_the_below_and_add_to_cart() {
	    CheckOutPageObjects c = new CheckOutPageObjects();
		WebElement pickColor = c.getPickColor();
		clickElement(pickColor);
		scrollDown(3);
		WebElement selectLens = c.getSelectLens();
		clickElement(selectLens);
		WebElement lensColor = c.getLensColor();
		clickElement(lensColor);
		WebElement selectLensColor = c.getSelectLensColor();
		clickElement(selectLensColor);
		scrollDown(2);
		WebElement confirm = c.getConfirm();
		clickElement(confirm);
		WebElement addToCart = c.getAddTocart();
		clickElement(addToCart);
	}

	@Then("User has to pay and buy the product and close the browser")
	public void user_has_to_pay_and_buy_the_product_and_close_the_browser() throws InterruptedException, AWTException {
		PaymentPageObjects p = new PaymentPageObjects();
		WebElement proceed = p.getProceed();
		clickElement(proceed);
		WebElement address = p.getAddress();
		clickElement(address);
		scrollDown(10);
		Thread.sleep(3000);
		pressEnter();
		wheelTo(3);
		WebElement radioButton = p.getRadioButton();
		clickElement(radioButton);
		WebElement continuePayment = p.getPayment();
		clickElement(continuePayment);
		WebElement fullName = p.getName();
		fullName.sendKeys("Sasikumar");
		r.mouseWheel(3);
		Thread.sleep(3000);
		driver.switchTo().frame(p.getCcFrame());
		WebElement ccNo = p.getCardNo();
		passValues(ccNo, "4586256487451256");
		
		
		driver.switchTo().defaultContent();		
		driver.switchTo().frame(p.getExpFrame());
		WebElement expDate = p.getExpDate();
		passValues(expDate, "0325");
		
		driver.switchTo().defaultContent();		
		driver.switchTo().frame(p.getCvcFrame());
		WebElement cvc = p.getcVC();
		passValues(cvc, "455");
		
		driver.switchTo().defaultContent();
		WebElement confirm1 = p.getConfirm1();
		clickElement(confirm1);
		
	}
}