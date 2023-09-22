package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageObjects extends BaseClass{
	
	public CheckOutPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Gold']")
	private WebElement pickColor;
	@FindBy(xpath="(//a[@data-word='Select Lenses'])[1]")
	private WebElement selectLens;
	@FindBy(xpath="//div[@id='sunglasses']")
	private WebElement lensColor;
	@FindBy(xpath="(//em[text()='Mint'])[4]")
	private WebElement selectLensColor;
	@FindBy(xpath="(//button[contains(text(),'Confirm')])[2]")
	private WebElement confirm;
	@FindBy(xpath="//button[text()='Confirm & add to cart']")
	private WebElement addTocart;
	public WebElement getPickColor() {
		return pickColor;
	}
	public WebElement getSelectLens() {
		return selectLens;
	}
	public WebElement getLensColor() {
		return lensColor;
	}
	public WebElement getSelectLensColor() {
		return selectLensColor;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getAddTocart() {
		return addTocart;
	}
	
	
}