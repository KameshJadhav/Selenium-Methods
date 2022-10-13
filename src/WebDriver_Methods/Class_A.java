 package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Class_A {
	// 18.08.2022
	//  Different methods of webDrivers
	//  1) driver.get("String + url")
	//  2) driver.navigate().refersh()  this method is uses for to refersh the web pages.
	//  3) driver.navigate().back()
	//  4) driver.navigate().forward()
	//  5) driver.getTitle()
	//  6) driver.getCurrentUrl()
	//  7) driver.manage().window().maximize()ll
	//  8) driver.manage().window().minimize()

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://www.flipkart.com/");	
		Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
		driver.navigate().to("https://www.redbus.in/bus-tickets");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		String a = driver.getTitle();
		System.out.println(a);
		
		String b = driver.getCurrentUrl();
		System.out.println(b);
		
		driver.manage().window().maximize();  // this will maximise the windows & we call this method chanining
		Thread.sleep(3000);
		driver.manage().window().minimize(); // to minimize the windows
	}

	}
