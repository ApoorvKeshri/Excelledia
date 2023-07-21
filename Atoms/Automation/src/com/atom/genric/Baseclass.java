package com.atom.genric;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.Atomspom.Homepage;
import com.Atomspom.PerernalDetail;
public class Baseclass {
	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void Url() {
		driver.navigate().to("https://blazedemo.com/index.php");
		Homepage h=new Homepage(driver);
		h.getDstofWek().click();
		driver.navigate().back();
	}
	@AfterMethod
	public void summit() {
		PerernalDetail p=new PerernalDetail(driver);
		p.getFinalClk().click();
	}
}
