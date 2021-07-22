package org.pomtwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class PomDemo extends BaseClassCreation{
	public PomDemo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='blue_text'])[1]")
	private WebElement scrolldown;
	@FindBy(xpath="//h1[@style='font-size:22px;']")
	private WebElement scrollup;
	public WebElement getScrolldown() {
		return scrolldown;
	}
	public WebElement getScrollup() {
		return scrollup;
	}
	
	
	
	

}
