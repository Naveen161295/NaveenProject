package org.pomone;

import org.openqa.selenium.WebElement;

import base.BaseClassCreation;

public class TaskPomOne extends page1{
	public static void main(String[] args) {
		BaseClassCreation base1=new BaseClassCreation();
		base1.getdriver("chrome");
		base1.getUrl("https://en-gb.facebook.com");
		page1 pom1=new page1();
		WebElement txtusername2 = pom1.getTxtusername();
		txtusername2.sendKeys("naveen161295");
		WebElement txtpassword2 = pom1.getTxtpassword();
		txtpassword2.sendKeys("naveen161295");
		WebElement btnlogin2 = pom1.getBtnlogin();
		btnlogin2.click();
	}
	
	

}
