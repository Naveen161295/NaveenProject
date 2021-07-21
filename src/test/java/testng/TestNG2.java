package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG2 {
	@Test(dataProvider="myData")
	private void tc0(String s, String s1) {
		System.out.print(s);
		System.err.print(s1);
	}
	@DataProvider(name="myData")
	public Object[][] tc01() {
		return new Object[][] {
			{"hai","welcome"},{"Naveen","naveen"}
		};
	}
}
