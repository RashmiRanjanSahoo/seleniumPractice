package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryDemoTest {

	//@Test(retryAnalyzer = RetryDemo.class)
	@Test
	public void m1() {
		System.out.println("M1");
		Assert.fail(); //To Fail the test case
		
	}
}
