package base;



public class Program extends BaseClassCreation {
	public static void main(String[] args) {
		BaseClassCreation base=new BaseClassCreation();
		base.getdriver("chrome");
		base.getUrl("https://adactinhotelapp.com/");
		base.send_Keys(base.find_Element_Locators("id", "username"), "naveen1612");
		base.send_Keys(base.find_Element_Locators("id", "password"), "AR976T");
		base.click(base.find_Element_Locators("id", "login"));
		base.send_Keys(base.find_Element_Locators("id", "location"),base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 1, 5));
		base.send_Keys(base.find_Element_Locators("id", "hotels"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 2, 4));
		base.send_Keys(base.find_Element_Locators("id", "room_type"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 3,5));
		base.send_Keys(base.find_Element_Locators("id", "room_nos"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 4, 4));
		base.send_Keys(base.find_Element_Locators("id", "adult_room"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 5, 5));
		base.javaScriptExecutor1(base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 7, 2), base.find_Element_Locators("id", "datepick_in"));
		base.javaScriptExecutor1(base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 8, 2), base.find_Element_Locators("id", "datepick_out"));
		base.send_Keys(base.find_Element_Locators("id", "child_room"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 6, 2));
		base.click(base.find_Element_Locators("id", "Submit"));
		base.click(base.find_Element_Locators("id", "radiobutton_0"));
		base.click(base.find_Element_Locators("id", "continue"));
		base.send_Keys(base.find_Element_Locators("id", "first_name"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 9, 2));
		base.send_Keys(base.find_Element_Locators("id", "last_name"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 10, 2));
		base.send_Keys(base.find_Element_Locators("id", "address"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 11, 2));
		base.send_Keys(base.find_Element_Locators("id", "cc_num"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 12, 2));
		base.send_Keys(base.find_Element_Locators("id", "cc_type"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 13, 5));
		base.send_Keys(base.find_Element_Locators("id", "cc_exp_month"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 14, 14));
		base.send_Keys(base.find_Element_Locators("id", "cc_exp_year"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 15, 14));
		base.send_Keys(base.find_Element_Locators("id", "cc_cvv"), base.getDataFromExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "Sheet1", 16, 2));
		base.click(base.find_Element_Locators("id", "book_now"));
		base.getDataToExcel("C:\\Users\\Sekar\\eclipse-workspace\\base\\Excel data\\exceldata.xlsx", "sheet2", 0, 0, "order_no");
		}
	

}
