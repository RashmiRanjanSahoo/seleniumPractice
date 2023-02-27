package TestNgDemo;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingGroupParameter {

	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider(ITestContext c){
	Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
		if(group.equalsIgnoreCase("A")){
			groupArray = new Object[][] { 
					{ "Guru99", "India" }, 
					{ "Krishna", "UK" }, 
					{ "Bhupesh", "USA" } 
				};
		break;	
		}
			else if(group.equalsIgnoreCase("B"))
			{
			groupArray = new Object[][] { 
						{  "Canada" }, 
						{  "Russia" }, 
						{  "Japan" } 
					};
			}
		break;
	}
	return groupArray;		
	}


@Test (dataProvider="SearchProvider",groups="A")
public void m1(String s1,String s2) {
	System.out.println("M1");
	System.out.println(s1+" "+s2);
}
@Test (dataProvider="SearchProvider",groups="B")
public void M2(String s1) {
	System.out.println("M2");
	System.out.println(s1);
}
}