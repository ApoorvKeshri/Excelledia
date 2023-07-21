package com.Atomspom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilghtOption  {
	@FindBy(xpath = "(//input[@class='btn btn-small'])[3]")
	private WebElement ChosFlit;
	public FilghtOption(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	public WebElement getChosFlit() {
		return ChosFlit;
	}

}
