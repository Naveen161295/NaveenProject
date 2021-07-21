package testng;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("Before method");
		Date date=new Date();
		System.out.println(date);
		}
	@Parameters({"userName","Password"})
	@Test
	private void page1(String s1,String s2) {
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(s2);
		WebElement logIn = driver.findElement(By.id("login"));
		logIn.click();
		System.out.println("page 1 successfully completed");
	}
	@Parameters({"Location","Hotel","Roomtype","Noofrooms","check-in-date","check-out-date","Adultsperroom","childrenperroom"})
	@Test
	private void page2(String s3, String s4, String s5,String s6,String s7,String s8, String s9, String s10) {
		WebElement location = driver.findElement(By.id("location"));
		Select r=new Select(location);
		r.selectByValue(s3);
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select r1 =new Select(Hotels);
		r1.selectByValue(s4);
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select r2=new Select(roomType);
		r2.selectByValue(s5);
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select r3=new Select(roomNos);
		r3.selectByValue(s6);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',"+"'"+s7+"')",checkin);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		js.executeScript("arguments[0].setAttribute('value',"+"'"+s8+"')", checkout);
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select r6=new Select(adultRoom);
		r6.selectByValue(s9);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select r7=new Select(childRoom);
		r7.selectByValue(s10);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		System.out.println("page 2 successfully completed");
	}
	@Test
	private void page3() {
		WebElement rdbtn = driver.findElement(By.id("radiobutton_0"));
		rdbtn.click();
		WebElement cntnue = driver.findElement(By.id("continue"));
		cntnue.click();
		System.out.println("page 3 successfully completed");
	}
	@Parameters({"firstName","LastName","Address","credit card no","cctype","expiry month","expiry year","cvv"})
	@Test
	private void page4(String s11,String s12,String s13,String s14, String s15, int s16, String s17, String s18) {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(s11);
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(s12);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(s13);
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(s14);
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select r8=new Select(ccType);
		r8.selectByVisibleText(s15);
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		Select r9=new Select(ccMonth);
		r9.selectByIndex(s16);
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select r10=new Select(ccYear);
		r10.selectByVisibleText(s17);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(s18);
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		System.out.println("page 4 successfully completed");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("After method");
		}
	@AfterClass
	private void afterclass() {
		Date date=new Date();
		System.out.println(date);
	}

}
