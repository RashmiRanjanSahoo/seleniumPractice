package TestNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingXML {
	@Test
	@Parameters({"Userid","Password"})
	public void m1(String Userid,String Password) {
		System.out.println("M1");
		System.out.println("User Id is "+Userid);
		System.out.println("Password is "+Password);
	}
}
