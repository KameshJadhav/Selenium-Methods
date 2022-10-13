package Self_Project;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class_D {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("18111995@Jk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("dell laptop");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[@class='_4rR01T' ])[3]")).click();
		Thread.sleep(3000);
		Set handlenextwindow = driver.getWindowHandles();

		Iterator<String> iterator = handlenextwindow.iterator();
		String mainnwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		
//		
//	driver.get("https://www.yatra.com/");
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		//Scroll down
//		jse.executeScript("window.scrollBy(0, 2000)");
//		Thread.sleep(3000);
//		//Scroll up
//		jse.executeScript("window.scrollBy(0, -1500)");
//		Thread.sleep(3000);
	}

	}
