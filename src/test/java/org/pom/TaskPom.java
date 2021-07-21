package org.pom;

import org.openqa.selenium.WebElement;

import base.BaseClassCreation;

public class TaskPom extends BaseClassCreation{
	public static void main(String[] args) {
		BaseClassCreation base=new BaseClassCreation();
		base.getdriver("chrome");
		base.getUrl("https://adactinhotelapp.com/");
		Pom1 pom1=new Pom1();
		WebElement textuserName = pom1.getTextuserName();
		base.send_Keys(textuserName, "naveen1612");
		WebElement textPassword = pom1.getTextPassword();
		base.send_Keys(textPassword, "AR976T");
		WebElement btnLogIn = pom1.getBtnLogIn();
		base.click(btnLogIn);
		Pom2 pom2=new Pom2();
		WebElement location = pom2.getLocation();
		base.send_Keys(location, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 1, 5) );
		WebElement hotels = pom2.getHotels();
		base.send_Keys(hotels, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 2, 6) );
		WebElement roomType = pom2.getRoomType();
		base.send_Keys(roomType, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 3, 4));
		WebElement roomNos = pom2.getRoomNos();
		base.send_Keys(roomNos, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 4, 4));
		WebElement fromDate = pom2.getFromDate();
		base.send_Keys(fromDate, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 7, 2));
		WebElement toDate = pom2.getToDate();
		base.send_Keys(toDate, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 8, 2));
		WebElement adultRoom = pom2.getAdultRoom();
		base.send_Keys(adultRoom, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 5, 3));
		WebElement childRoom = pom2.getChildRoom();
		base.send_Keys(childRoom, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 6, 3));
		WebElement submit = pom2.getSubmit();
		base.click(submit);
		Pom3 pom3=new Pom3();
		WebElement rdbtn = pom3.getRdbtn();
		base.click(rdbtn);
		WebElement contn = pom3.getContn();
		base.click(contn);
		Pom4 pom4=new Pom4();
		WebElement firstName = pom4.getFirstName();
		base.send_Keys(firstName, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 9, 2));
		WebElement lastName = pom4.getLastName();
		base.send_Keys(lastName, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 10, 2));
		WebElement address = pom4.getAddress();
		base.send_Keys(address, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 11, 2));
		WebElement creditCardNo = pom4.getCreditCardNo();
		base.send_Keys(creditCardNo, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 12, 2));
		WebElement creditCardType = pom4.getCreditCardType();
		base.send_Keys(creditCardType, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 13, 5));
		WebElement expiryMonth = pom4.getExpiryMonth();
		base.send_Keys(expiryMonth, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 14, 10));
		WebElement expiryYear = pom4.getExpiryYear();
		base.send_Keys(expiryYear, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 15, 14));
		WebElement cvv = pom4.getCvv();
		base.send_Keys(cvv, base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 16, 2));
		WebElement bookNow = pom4.getBookNow();
		base.click(bookNow);
		
	}

}
