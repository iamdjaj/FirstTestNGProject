package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFileAfterBeforeMethod {
	public String baseURL = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver ();
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	public void launchBrowser() {
		driver.get(baseURL);
	}
	
	@BeforeMethod
	public void verifyHomepageTitle() {
		expected = "Welcome: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);			
	}
	
	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);			
	}
	
	@AfterMethod
	public void goBackToHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
}
