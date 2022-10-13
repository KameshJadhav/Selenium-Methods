package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_D {

//  Different methods of webDrivers
	//  13) driver.manage().window().setPosition(null); (Change browser Position by manual using program of below)
	//  14) driver.manage().window().getPosition(null); (Using this method we get the Position of browser in the form of Int)

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://www.flipkart.com/");	
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Point p = new Point(500,300);
		driver.manage().window().setPosition(p);
		
		int a = driver.manage().window().getPosition().getX();
		int b = driver.manage().window().getPosition().getY();
		System.out.println(a);
		System.out.println(b);
	}

	}
