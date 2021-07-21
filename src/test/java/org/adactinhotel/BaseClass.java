package org.adactinhotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	WebDriver driver;
public void getDriver(String method) {
		
		try {
			if (method.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if (method.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if (method.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	}
	
	
public void getUrl(String url) {
		try {
			driver.get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public WebElement getText(String id) {
	WebElement findElement=null;
	try {
		 findElement = driver.findElement(By.id(id));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return findElement;
	
}

public WebElement find_Element(String method,String data) {
	WebElement element=null;
	try {
		if (method.equalsIgnoreCase("id")) {
			element=driver.findElement(By.id(data));
		}
		else if (method.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(data));
		}
		else if (method.equalsIgnoreCase("classname")) {
			element = driver.findElement(By.className(data));
		}
		else if (method.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(data));
		}
		else if (method.equalsIgnoreCase("tagname")) {
			element = driver.findElement(By.tagName(data));
		}
		else if (method.equalsIgnoreCase("cssselector")) {
			element = driver.findElement(By.cssSelector(data));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return element;
}
	
public void send_Keys(WebElement element,String data) {
	try {
		element.sendKeys(data);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void click(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void frames(String method,String data) {
	try {
		if (method.equalsIgnoreCase("id")) {
			driver.switchTo().frame(data);
		}
		else if (method.equalsIgnoreCase("name")) {
			driver.switchTo().frame(data);
		}
		else if (method.equalsIgnoreCase("element")) {
			String arguments = null;
			driver.switchTo().frame(arguments);
		}
		else if (method.equalsIgnoreCase("int")) {
			String intdata = null;
			driver.switchTo().frame(intdata);
		}
		driver.switchTo().frame(data);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public WebElement framexpath(WebElement element) {
	try {
		driver.switchTo().frame(element);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return element;
}
public String dataFromexcel(String location,String sheetNo,int rowNo,int cellNo) {
	String value=null;
	
	try {
		File file = new File(location);
		FileInputStream inputStream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(inputStream);
		Sheet sheet = book.getSheet(sheetNo);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		
		if (cellType==1) {
			value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
			value = dateFormat.format(date);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
		}
		FileOutputStream outputStream=new FileOutputStream(file);
		book.write(outputStream);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return value;
	
}

public void getText(WebElement element) {
	
	try {
		String text = element.getText();
		System.out.println(text);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


public String getAttribute(WebElement element) {
	try {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}


public WebElement printdatatoExcel(String location, String sheetNo, int rowNo,int cellNo,WebElement element) {

	try {
		File file = new File(location);
		FileInputStream inputStream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(inputStream);
		Sheet sheet = book.createSheet(sheetNo);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		String attribute = element.getAttribute("value");
		cell.setCellValue(attribute);
		FileOutputStream outputStream=new FileOutputStream(file);
		book.write(outputStream);
		System.out.println("Done");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return element;

}
}

