package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {

	public static void main(String[] args) throws InterruptedException {
		// 22.08.2022
		//  Different methods of webElements
		//  1) driver.findElement(By.xpath(" "));
		
		// 23.08.2022
		// xpath finding methods(syntax)
		// 1) 
		// 2) with the help of html test (
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("18111995@Jk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
	}

	}
