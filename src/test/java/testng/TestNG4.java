package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNG4 {
	@Test
	private void tc01() {
		String s="hai";
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(s, "Welcome");
		
		System.out.println(s);
	}
	@Test
	private void tc02() {
		System.out.println("tc01");
	}

}
