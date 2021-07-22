package org.pomone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class page1 extends BaseClassCreation {
	public  page1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtusername;
	@FindBy(id="pass")
	private WebElement txtpassword;
	@FindBy(name="login")
	private WebElement btnlogin;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
