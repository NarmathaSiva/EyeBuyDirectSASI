package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SunGlassesPageObjects extends BaseClass{
	
	public SunGlassesPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Shop sunglasses']")
	private WebElement sunGlass;
	@FindBy(xpath="//div[@id='pagination']//following::strong")
	private WebElement totalItems;	
	@FindBy(xpath="//span[@data-event-name='Search Icon Click']")
	private WebElement searchProduct;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitSearch;
	@FindBy(linkText="Good Vibrations")
	private WebElement goodVibration;
	

	public WebElement getSunGlass() {
		return sunGlass;
	}

	public WebElement getTotalItems() {
		return totalItems;
	}

	public WebElement getSearchProduct() {
		return searchProduct;
	}

	public WebElement getSubmitSearch() {
		return submitSearch;
	}

	public WebElement getGoodVibration() {
		return goodVibration;
	}

}
