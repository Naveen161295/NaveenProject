package base;

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

//To configure Browser
public class Doubt {
	WebDriver driver;
	public void getdriver(String browser_Name ) {
		try {
			if (browser_Name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if (browser_Name.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if (browser_Name.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Sekar\\eclipse-workspace\\base\\Driver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			else {
				System.out.println("Invalid browser. Unable to launch");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//To get URL
	public void getUrl(String url) {
		try {
			driver.get(url);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//find element and locators
	public WebElement find_Element_Locators(String locators, String id) {
		WebElement find_Element = null;
		try {
			if (locators.equalsIgnoreCase("id")) {
				find_Element = driver.findElement(By.id(id));
			}
			else if (locators.equalsIgnoreCase("name")) {
				find_Element=driver.findElement(By.name(id));
			}
			else if (locators.equalsIgnoreCase("xpath")) {
				 find_Element = driver.findElement(By.xpath(id));
			}
			else if (locators.equalsIgnoreCase("tagName")) {
				find_Element = driver.findElement(By.tagName(id));
			}
			else if (locators.equalsIgnoreCase("className")) {
				find_Element = driver.findElement(By.className(id));
			}
			else if (locators.equalsIgnoreCase("cssSelector")) {
				find_Element = driver.findElement(By.cssSelector(id));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return find_Element;
	}

//To pass the values (Send keys)
	public void send_Keys(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//To click the button (Click)	
	public void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//To get a data from excel
	public String getDataFromExcel(String pathName, String SheetName,int rowNo,int cellNo) {
		String value=null;
		try {
			File file=new File(pathName);
			FileInputStream inputStream=new FileInputStream(file);
			Workbook book=new XSSFWorkbook(inputStream);
			Sheet sheet = book.getSheet(SheetName);
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if (cellType==1) {
				value = cell.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
				value=dateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l=(long)numericCellValue;
				value = String.valueOf(l);
			}			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
//To set a data to excel
	public String getDataToExcel(String data, String pathName, String sheetName,int rowNo,int cellNo,String method) {
		
		try {
			File file=new File(pathName);
			FileInputStream inputStream=new FileInputStream(file);
			Workbook workBook=new XSSFWorkbook(inputStream);
			Sheet sheet = workBook.createSheet(sheetName);
			Row row = sheet.createRow(rowNo);
			Cell cell = row.createCell(cellNo);
			cell.setCellValue(data);	
			FileOutputStream outputStream=new FileOutputStream(file);
			workBook.write(outputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}
}