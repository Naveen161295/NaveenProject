package org.pomtwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class PageDemo1 extends BaseClassCreation{
	public PageDemo1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement courseContent;
	@FindBy(xpath="//p[@style='padding-top:10px;']")
	private WebElement paragraph;
	@FindBy(xpath="//h1[@class='red']")
	private WebElement title;
	public WebElement getCertification() {
		return certification;
	}
	public WebElement getCourseContent() {
		return courseContent;
	}
	public WebElement getParagraph() {
		return paragraph;
	}
	public WebElement getTitle() {
		return title;
	}
	

}
