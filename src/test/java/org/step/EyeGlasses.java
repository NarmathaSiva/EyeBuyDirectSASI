package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.EyeGlassesPageObjects;
import org.pojo.FiltersPageObjects;
import org.pojo.LoginPageObjects;
import org.pojo.SunGlassesPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EyeGlasses extends BaseClass{

	@Given("User has to enter the {string} and {string} and click signin to access eye glasses page")
	public void user_has_to_enter_the_and_and_click_signin_to_access_eye_glasses_page(String Username, String Password) throws InterruptedException {
		LoginPageObjects l = new LoginPageObjects();
		WebElement email = l.getEmail();
		WebElement pw = l.getPw();
		email.sendKeys(Username);
		pw.sendKeys(Password);
		clickElement(l.getClickSignIn());
		
		
		EyeGlassesPageObjects e = new EyeGlassesPageObjects();
		impWait(20);
		Thread.sleep(5000);
		scrollDown(9);		
		Thread.sleep(3000);
		WebElement eyeGlass = e.getEyeGlass();			
		clickElement(eyeGlass);
	}

	@When("User has to select all filters in EyeGlasses page")
	public void user_has_to_select_all_filters_in_EyeGlasses_page() {
		FiltersPageObjects s = new FiltersPageObjects();
		
		WebElement clickGender = s.getClickGender();
		a.scrollToElement(clickGender).perform();
		clickGender.click();
		
		WebElement selectGender = s.getSelectGender();
		a.scrollToElement(selectGender).perform();
		selectGender.click();
		
		WebElement clickSize = s.getClickSize();
		a.scrollToElement(clickSize).perform();
		clickSize.click();			

		WebElement selectSize = s.getSelectSize();
		a.scrollToElement(selectSize).perform();
		selectSize.click();								

		WebElement clickShape = s.getClickShape();
		a.scrollToElement(clickShape).perform();
		clickShape.click();

		WebElement selectShape = s.getSelectShape();
		a.scrollToElement(selectShape).perform();
		selectShape.click();	
		
		WebElement clickPrice = s.getClickPrice();
		a.scrollToElement(clickPrice).perform();
		clickPrice.click();

		WebElement totalWidthLeft = s.getTotalWidthLeft();
		WebElement totalWidthRight = s.getTotalWidthRight();		
						
		a.scrollToElement(totalWidthRight).perform();
		a.dragAndDropBy(totalWidthRight,-100,0).perform();
	}

	@Then("User has to validate the number of items displayed after selecting filters in EyeGlasses page")
	public void user_has_to_validate_the_number_of_items_displayed_after_selecting_filters_in_EyeGlasses_page() {
		EyeGlassesPageObjects s = new EyeGlassesPageObjects();
		WebElement totalItems = s.getTotalItems();
		String numItems = totalItems.getText();
		System.out.println("Total Items Displayed: " + numItems);
	}

}
