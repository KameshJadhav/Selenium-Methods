package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@data-ved='2ahUKEwiejZyzz5P6AhVs-jgGHclYCvkQjBB6BAgIEAE']")).click();
	}
	}
//It is used to instruct to web driver to wait for given time before throwing the exception.
//In this wait we need to provide maximum time we have to wait before throwing exception.
//If driver gets an element before maximum time script will go ahead.
//If driver is not able to find element before maximum time it will through exception.

//				driver.manage().timeouts().implicitelyWait(Duration.ofSeconds(10));

//Time we are providing is the maximum time to wait before throwing an exception.