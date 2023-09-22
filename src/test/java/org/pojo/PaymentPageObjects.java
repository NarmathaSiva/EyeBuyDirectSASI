package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageObjects extends BaseClass{

	public PaymentPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath="//select[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radioButton;
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	private WebElement payment;
	
	@FindBy(xpath="//input[@placeholder='Full name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='credit-card-number']")
	private WebElement cardNo;
	
	@FindBy(xpath="//input[@id='expiration']")
	private WebElement expDate;
	
	@FindBy(xpath="//input[@id='cvv']")
	private WebElement cVC;
	
	@FindBy(xpath="(//button[text()='Confirm and pay'])[1]")
	private WebElement confirm1;
	
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-number']")
	private WebElement ccFrame;
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-expirationDate']")
	private WebElement expFrame;
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-cvv']")
	private WebElement cvcFrame;

	public WebElement getCcFrame() {
		return ccFrame;
	}

	public WebElement getExpFrame() {
		return expFrame;
	}

	public WebElement getCvcFrame() {
		return cvcFrame;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getcVC() {
		return cVC;
	}

	public WebElement getConfirm1() {
		return confirm1;
	}
	
}
