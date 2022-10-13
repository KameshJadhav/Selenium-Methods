package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Fetch/Read data from excel sheet
public class How_to_fetch_data_from_excel_sheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();

	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\AUTOMATION_TESTING\\Notes\\Selenium\\POI Excel File//New Microsoft Excel Worksheet.xlsx");

	Workbook work = WorkbookFactory.create(file);
	Sheet sheet = work.getSheet("sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	String expectedData = cell.getStringCellValue();
	
	System.out.println(expectedData);
	
	}
	}
//How to fetch/read data from excel sheet?
//To fetch data from any other standalone file we have to add apache poi library in project.
//Apache poi is used to take data from any other file of any format.

//steps:
//1) Get the location of file
//FilelnputStream file = new FilelnputStream("path of file in local system")  This is a sytax for data  fetch
//2) Get data from excel sheet
//Workbook wb = WorkbookFactory.create(file);
//Sheet sheet = wb.getSheet("SheetName");
//String value=  sheet.getRow(int).getCell(int).getStringCellValue();
//OR
//int value  = sheet.getRow(int).getCell(int).getNumaricCellvalue();
	
