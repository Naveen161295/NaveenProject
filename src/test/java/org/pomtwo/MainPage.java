package org.pomtwo;

import org.openqa.selenium.WebElement;

import base.BaseClassCreation;

public class MainPage extends PomDemo{
	public static void main(String[] args) {
		BaseClassCreation base=new BaseClassCreation();
		base.getdriver("chrome");
		base.getUrl("http://www.greenstechnologys.com/");
		PomDemo demo1=new PomDemo();
		WebElement scrolldown2 = demo1.getScrolldown();
		base.javaScriptExecutor2(scrolldown2, "scrolldown");
		base.get_Text(scrolldown2);
		WebElement scrollup2 = demo1.getScrollup();
		base.javaScriptExecutor2(scrollup2, "scrollup");
		base.get_Text(scrollup2);
		PageDemo1 demo2=new PageDemo1();
		WebElement certification = demo2.getCertification();
		base.click(certification);
		WebElement courseContent = demo2.getCourseContent();
		base.click(courseContent);
		WebElement paragraph = demo2.getParagraph();
		base.get_Text(paragraph);
		WebElement title = demo2.getTitle();
		base.get_Text(title);
	}
	
	
	
	

}
