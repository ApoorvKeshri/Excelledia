package com.Atomspom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Homepage  {

	@FindBy(linkText = "destination of the week! The Beach!")
	private WebElement dstofWek;
	@FindBy(name = "fromPort")
	private WebElement fromPot;
	@FindBy(name ="toPort")
	private WebElement toPort;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement Btnck;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDstofWek() {
		return dstofWek;
	}
	public WebElement getFromPort() {
		Select s=new Select(fromPot);
		s.selectByValue("Mexico City");

		return fromPot;
	}
	public WebElement getToPort() {
		Select s1=new Select(toPort);
		s1.selectByValue("London");
		return toPort;
	}
	public WebElement getBtnck() {
		return Btnck;
	}
}
