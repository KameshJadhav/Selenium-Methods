package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma shoes");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("//span[@class='a-price-whole'][4]")).click();
	}
	}
//This wait is used for particular Web element
//In this we are providing maximum time to wait and condition for element.

//Here we create object of WebDriverWait class which takes parameter 1) web driver and 2)max. duration of time.

//We are using until method of wait object which takes parameter expected condition class.

//By element = By.xPath("xpath_of_element");
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement element = wait.until (ExpectedConditions.visibilityofElementLocated(element));
//element.click();

//Polling time : Time after which system will check the condition again.
//In explicit wait pooling time is 500 milli sec.