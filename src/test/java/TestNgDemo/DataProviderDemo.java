package TestNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider(name="Auth")
	public Object[][]userAuth(){
		return new Object[][] {{"admin","admin123"}};
		
	}
	
	@Test(dataProvider = "SearchProvider", dataProviderClass=DataproviderClass.class)
	public void m1(String uid, String pass) {
		System.out.println("m1");
		System.out.println("User Id is"+uid);
		System.out.println("Password id "+pass);
	}
}
