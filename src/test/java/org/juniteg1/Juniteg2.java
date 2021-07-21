package org.juniteg1;

import java.util.Date;

import org.adactinhotel.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Juniteg2 extends BaseClass{
	static BaseClass base=new BaseClass();
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		base.getDriver("chrome");
		base.getUrl("https://www.redbus.in/");
	}
	@Before
	public void before() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public void test2() {
		base.click(base.find_Element("id", "sign-in-icon-down"));
		base.click(base.find_Element("id", "signInLink"));
	}
	@Test
	public void test3() {
		base.click(base.find_Element("xpath", "//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']"));
		
	}
	
	@After
	public void after() {
		Date date=new Date();
		System.out.println(date);
	}

}
