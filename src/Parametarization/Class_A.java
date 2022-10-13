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

public class Class_A {

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
		Sheet sheet   = work.getSheet("Sheet2");
		Row row       = sheet.getRow(1);
		Cell cell     = row.getCell(1);
		String expectedTitle = cell.getStringCellValue();
		
		if(actualtitle.equals(expectedTitle))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		}
		}

