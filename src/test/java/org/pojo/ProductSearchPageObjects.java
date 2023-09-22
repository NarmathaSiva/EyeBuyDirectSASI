package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPageObjects extends BaseClass{
	
	public ProductSearchPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@data-event-name='Search Icon Click']")
	private WebElement searchButton;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(linkText="Good Vibrations")
	private WebElement goodVibration;

}
