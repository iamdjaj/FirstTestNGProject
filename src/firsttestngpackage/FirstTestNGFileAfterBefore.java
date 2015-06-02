package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFileAfterBefore {
	public String baseURL = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver ();
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
	
	@BeforeTest
	public void launchBrowser() {
		driver.get(baseURL);
	}
	
	@Test	
	public void verifyHomepageTitle() {
		driver.get(baseURL);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
  }
}
