package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EyeGlassesPageObjects extends BaseClass{
	
	public EyeGlassesPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Shop eyeglasses']")
	private WebElement eyeGlass; 
	@FindBy(xpath="//div[@id='pagination']//following::strong")
	private WebElement totalItems;
	public WebElement getEyeGlass() {
		return eyeGlass;
	}
	public WebElement getTotalItems() {
		return totalItems;
	}

}
