package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageObjects extends BaseClass{

	public AddToCartPageObjects() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//button[text()='No Thanks']")
	private WebElement noThanks;
	@FindBy(xpath="//a[@title='Cart']")
	private WebElement cart;
	@FindBy(xpath="//div[@class='sc-item-container sc-item-container-b']")
	private List<WebElement> cartItems;
	@FindBy(xpath="//span[@class='prices price-symbol items-right']")	
	private WebElement subTotal;
	public WebElement getNoThanks() {
		return noThanks;
	}
	public WebElement getCart() {
		return cart;
	}
	public List<WebElement> getCartItems() {
		return cartItems;
	}
	public WebElement getSubTotal() {
		return subTotal;
	}
	
	
}
