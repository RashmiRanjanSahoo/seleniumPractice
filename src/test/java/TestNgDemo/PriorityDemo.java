package TestNgDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority = 0,dependsOnMethods = "Ctest2",alwaysRun = true)
	public void Btest1() {
		System.out.println("BTest1");
	}
	@Test(priority = 1)
	public void Ctest2() {
		System.out.println("CTest2");
	}
	@Test(priority = 2)
	public void Atest3() {
		System.out.println("ATest3");
	}
}
