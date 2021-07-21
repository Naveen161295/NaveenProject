package org.pomone;

import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class page1 extends BaseClassCreation {
	public void page() {
		PageFactory.initElements(driver, this);
	}

}
