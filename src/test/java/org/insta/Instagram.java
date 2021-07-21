package org.insta;

import java.util.Date;

import org.adactinhotel.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Instagram extends BaseClass{
	static BaseClass base=new BaseClass();
	
	@BeforeClass
	public static void beforeclass() {
		base.getDriver("chrome");
		base.getUrl("https://www.instagram.com/accounts/login/?hl=en");
	}
	@Before
	public void before() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public void test() {
		base.send_Keys(base.find_Element("name", "username"), "naveen161295@gmail.com");
		base.send_Keys(base.find_Element("name", "password"), "naveenvelusamy031");
		base.click(base.find_Element("xpath", "//div[text()='Log In']"));
		
	}
	@After
	public void after() {
		// TODO Auto-generated method stub

	}
	
}
