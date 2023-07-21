package com.TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Atomspom.FilghtOption;
import com.Atomspom.Homepage;
import com.Atomspom.PerernalDetail;
import com.atom.genric.Baseclass;

public class BookFilgt extends Baseclass{
	@Test()
	public void Book() {
		Homepage h = new Homepage(driver);
		h.getFromPort().click();
		h.getToPort().click();
		h.getBtnck().click();
		FilghtOption f = new FilghtOption(driver);
		f.getChosFlit().click();
		PerernalDetail p = new PerernalDetail(driver);
		p.getFstName().sendKeys("Apoorv keshri");
		p.getAddRess().sendKeys("Btm");
		p.getCity().sendKeys("Bangalore");
		p.getState().sendKeys("ka");
		p.getZcode().sendKeys("560076");
		p.getCardType().click();
		p.getCreditCard().sendKeys("1232342442");
		p.getCardMonth().sendKeys("6");
		p.getCreditCardYear().sendKeys("2028");
		p.getNameOnCard().sendKeys("Axis bank");
	}
}
