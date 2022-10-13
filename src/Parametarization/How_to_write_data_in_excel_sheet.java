package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Write data in excel sheet

public class How_to_write_data_in_excel_sheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String actualtitle = driver.getTitle();
		driver.manage().window().minimize();
		
		FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\AUTOMATION_TESTING\\Notes\\Selenium\\POI Excel File//New Microsoft Excel Worksheet.xlsx");

		Workbook work = WorkbookFactory.create(file);
		Sheet sheet = work.getSheet("Sheet3");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(3);
		cell.setCellValue(actualtitle);
		
		FileOutputStream file1 = new FileOutputStream("E:\\SOFTWARE TESTING\\AUTOMATION_TESTING\\Notes\\Selenium\\POI Excel File//New Microsoft Excel Worksheet.xlsx");
		work.write(file1);
		file1.close();
	}
	}
//How to write data in excel sheet...?
//Row row = sheet.getRow(int);
//Cell cell = row.createCell(int);
//cell.setCellValue("45824512");
//FileOutputStream file1 = new FileOutputStream("path to excel sheet");
//workbook.write(file1);
//file1.close();
//Writing data inside file