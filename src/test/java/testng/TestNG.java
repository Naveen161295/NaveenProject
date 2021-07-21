package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG {
	@BeforeClass
	private void tc0() {
		System.out.println("before class");
	}
@AfterClass
private void tc01() {
	System.out.println("after class");
}
@BeforeMethod
private void tc02() {
	System.out.println("before method");
}
@AfterMethod
private void tc03() {
	System.out.println("before class");
}
@Test(priority=-10)
private void tc04() {
	System.out.println("test main1");
}
@Test(priority=-1)
private void tc05() {
	System.out.println("test main2");
}
@Test(priority=0)
private void tc06() {
	System.out.println("test main3");
}
@Test
private void tc07() {
	System.out.println("test main4");
}
@Test(priority=0)
private void tc08() {
	System.out.println("test main5");
}
@Test(priority=-10)
private void tc09() {
	System.out.println("test main6");
}
}
