package com.Atomspom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PerernalDetail {

	@FindBy(id = "inputName")
	private WebElement FstName;
	@FindBy(id = "address")
	private WebElement addRess;
	@FindBy(id = "city")
	private WebElement city;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id = "zipCode")
	private WebElement Zcode;
	@FindBy(id = "cardType")
	private WebElement cardType;

	@FindBy(id = "creditCardNumber")
	private WebElement creditCard;

	@FindBy(id = "creditCardMonth")
	private WebElement cardMonth;

	@FindBy(id = "creditCardYear")
	private WebElement creditCardYear;
	@FindBy(id = "nameOnCard")
	private WebElement nameOnCard;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement FinalClk;

	public PerernalDetail(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getState() {
		return state;
	}
	
	public WebElement getFinalClk() {
		return FinalClk;
	}
	public WebElement getFstName() {
		return FstName;
	}
	public WebElement getAddRess() {
		return addRess;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getZcode() {
		return Zcode;
	}
	public WebElement getCardType() {
		Select s3=new Select(cardType);
		s3.selectByValue("visa");
		return cardType;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCreditCardYear() {
		return creditCardYear;
	}
	public WebElement getNameOnCard() {
		return nameOnCard;
	}
}
