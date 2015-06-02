package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
	public String baseURL = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver ();
	
	@Test	
	public void verifyHomepageTitle() {
		driver.get(baseURL);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
  }
}
