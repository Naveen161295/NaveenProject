package org.juniteg1;


import java.util.Date;

import org.adactinhotel.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JunitEg1 extends BaseClass{
	static BaseClass base=new BaseClass();
	 WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		base.getDriver("chrome");
		base.getUrl("https://en-gb.facebook.com/");
	}
	@Before
	public void before() {
		Date date=new Date();
		System.out.println(date);
	}
	
	@Test
	public void test() {
		WebElement userName = base.getText("email");
		base.send_Keys(userName, "naveen161295@gmail.com");
		org.junit.Assert.assertEquals(userName.getAttribute("value"), "naveen161295@gmail.com");
		System.out.println("user get passed and executed successfully");
	}
	@Test
	public void test1() {
		WebElement userpass = base.getText("pass");
		base.send_Keys(userpass, "naveen161296");
		Assert.assertEquals(userpass.getAttribute("value"), "naveen16196");
		System.out.println("pass get passed and executed successfully");
	}
	@After
	public void after() {
		Date date=new Date();
		System.out.println(date);
	}
	
}
