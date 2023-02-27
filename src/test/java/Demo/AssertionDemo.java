package Demo;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
public class AssertionDemo {
	
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		//Junit assertion (It provides only Hard Assertion);
		//Hard assertion
		//In hard assertion, if an assertion fails then it aborts the test case otherwise it continues the execution
		Assert.assertEquals(false, false);
		Assert.assertNotEquals(0, 0);
		Assert.assertTrue(false);
		Assert.assertFalse(false);
		//Assert.assertNull(driver);
		
		//TestNg Assertion 
		//TestNg provides both hard and soft assertion
		
		//Hard Assertion
		org.testng.Assert.assertEquals(false, true);
		
		//Soft Assertion
		//Sometimes we want to execute the whole script even if the assertion fails.so we have to use softAssertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(false, false);
		sa.assertNotEquals(false, false, null);
		sa.assertTrue(false);
		sa.assertAll();
		
	}
}
