package testng;

import org.adactinhotel.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG3 extends BaseClass {
	static BaseClass ttt=new BaseClass();
	WebDriver driver;
	@Test(dataProvider="Amazon")
	private void launch(String s) {
		ttt.getDriver("chrome");
		ttt.getUrl("https://www.amazon.com/");
		WebElement free = ttt.find_Element("id", "twotabsearchtextbox");
		free.sendKeys(s);
		ttt.click(ttt.find_Element("id", "nav-search-submit-button"));
	}
	@DataProvider(name="Amazon")
	public Object[][] amazon() {
		return new Object[][] {
		{"iphone"},{"motorola"},{"poco"}
	};
}
}