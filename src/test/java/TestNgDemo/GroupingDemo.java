package TestNgDemo;

import org.testng.annotations.Test;

public class GroupingDemo {

	@Test(groups="g1")
	public void m1() {
		System.out.println("M1");
	}
	@Test(groups="g2")
	public void m2() {
		System.out.println("M2");
	}
	@Test(groups="g3")
	public void m3() {
		System.out.println("M3");
	}
}
