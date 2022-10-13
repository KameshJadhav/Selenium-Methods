package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_C {
	
	//  Different methods of webDrivers
	//  11) driver.manage().window().setSize(null);		    (Change browser size)
	//  12) driver.manage().window().getSize().width/height (Using this method we get the size of browser in the form of Int)

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://www.flipkart.com/");	
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		int x = driver.manage().window().getSize().width;
		int y = driver.manage().window().getSize().height;
		System.out.println("Width is : " + x + " Height is : "+ y);
		
		// x=1000 pixel
		// y=500  pixel
		
		Dimension p = new Dimension(1000,500);
		driver.manage().window().setSize(p);
		Thread.sleep(3000);
		
		int x1 = driver.manage().window().getSize().width;
		int y1= driver.manage().window().getSize().height;
		System.out.println("Width is : " + x1 + " Height is : "+ y1);

	}

    }
