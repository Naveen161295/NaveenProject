package org.junit;


public class Junit1 {
	@BeforeClass
	public static void ju01() {
		System.out.println("Before class ju01");
	}
	@Before
	public void ju02() {
		System.out.println("before ju02");
	}
	@AfterClass
	public static void ju03() {
		System.out.println("after class ju03");
	}
	@After
	public void ju04() {
		System.out.println("after ju04");
	}
	@Test
	public void ju05() {
		System.out.println("test1 ju05");
	}
	@Test
	public void ju06() {
		System.out.println("test2 ju06");
	}
}
