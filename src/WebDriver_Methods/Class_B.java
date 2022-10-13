package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_B {

//  Different methods of webDrivers
	//  9)  driver.close
	//  10) driver.quit
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  // Object -->upcasting
			
			driver.get("https://www.flipkart.com/");
			
			driver.close(); // it will close the current tab
			
			//driver.quit();  // it will close the all the browser

	}

}
