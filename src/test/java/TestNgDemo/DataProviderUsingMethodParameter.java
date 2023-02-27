package TestNgDemo;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingMethodParameter {
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(Method m){
        if(m.getName().equalsIgnoreCase("m1")){
        return new Object[][] {
                { "Guru99", "India" },
                { "Krishna", "UK" },
                { "Bhupesh", "USA" }
            };}
        else{
        return new Object[][] {
                { "Canada" },
                { "Russia" },
                { "Japan" }
            };}       
    }
	
	@Test (dataProvider="SearchProvider")
	public void m1(String s1,String s2) {
		System.out.println("M1");
		System.out.println(s1+"  "+s2);
	}
	
	@Test (dataProvider="SearchProvider")
	public void m2(String s1) {
		System.out.println("M2");
		System.out.println(s1);
	}

}
