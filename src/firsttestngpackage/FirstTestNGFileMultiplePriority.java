package firsttestngpackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class FirstTestNGFileMultiplePriority {
	
	@Test(priority = 3, enabled = true)	
	public void c_test() {
		Assert.fail();
	}
	
	@Test(priority = 0, enabled = true)	
	public void a_test() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 7, enabled = true)		
	public void b_test() {
		throw new SkipException("Skipping b_test...");
	}
}
