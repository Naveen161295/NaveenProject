package org.adactinhotel;

import org.openqa.selenium.WebElement;

public class TaskAdactinHotel extends BaseClass{
	public static void main(String[] args) {
		BaseClass base=new BaseClass();
		base.getDriver("chrome");
		base.getUrl("https://adactinhotelapp.com/");
		WebElement element = base.find_Element("id", "username");
		base.send_Keys(element, "naveen1612");
		base.send_Keys(base.find_Element("id", "password"), "AR976T");
		base.click(base.find_Element("id", "login"));
		base.send_Keys(base.find_Element("name", "location"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 1, 3));
		base.send_Keys(base.find_Element("name", "hotels"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 2, 5));
		base.send_Keys(base.find_Element("name", "room_type"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 3, 6));
		base.send_Keys(base.find_Element("name", "room_nos"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 4, 4));
		base.send_Keys(base.find_Element("name", "datepick_in"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 5, 4));
		base.send_Keys(base.find_Element("name", "datepick_out"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 6, 3));
		base.send_Keys(base.find_Element("name", "adult_room"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 7, 2));
		base.send_Keys(base.find_Element("name", "child_room"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet1", 8, 2));
		base.click(base.find_Element("name", "Submit"));
		base.click(base.find_Element("name", "radiobutton_0"));
		base.click(base.find_Element("name", "continue"));
		base.send_Keys(base.find_Element("name", "first_name"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 9, 2));
		base.send_Keys(base.find_Element("name", "last_name"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 10, 2));
		base.send_Keys(base.find_Element("name", "address"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 11, 2));
		base.send_Keys(base.find_Element("name", "cc_num"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 12, 2));
		base.send_Keys(base.find_Element("name", "cc_type"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 13, 4));
		base.send_Keys(base.find_Element("name", "cc_exp_month"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 14, 12));
		base.send_Keys(base.find_Element("name", "cc_exp_year"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 15, 14));
		base.send_Keys(base.find_Element("name", "cc_cvv"), base.dataFromexcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 16, 2));
		base.click(base.find_Element("name", "book_now"));
		base.printdatatoExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet2", 1, 1, base.find_Element("id", "order_no"));
		base.click(base.find_Element("name", "logout"));
	
	
	}
}
