package Drop_Down_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class_A {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU'] ")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU'] ")).sendKeys("18111995@Jk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		Select sel = new Select(dropDown);
//		sel.selectByValue("Orders");
		
		
//		WebElement dropDown =	driver.findElement(By.xpath(""));
//		Select sel = new Select(dropDown);
//		sel.selectByIndex(2);
//		
	}

	}

// Drop Down Methods
//There are two types of drop down
//a. Default drop down (having select tag name),
//b. custom made drop down (having other tag name)

//Here we are handling default drop dewn
//First create web element by using findElement() method
//Create object of Select Class and pass parameter (webelement)

//Select sel = new Select(web element);
//There are three methods of Select Class
//1) sel.selectBylndex(int);
//2) sel.selectByValue(String)
//3) sel.selectByVisibleText(String):

//There are three methods of deSelect Class
//1) sel.deselectBylndex(int);
//2) sel.deselectByValue(String)
//3) sel.deselectByVisibleText(String):