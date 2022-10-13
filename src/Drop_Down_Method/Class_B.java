package Drop_Down_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class_B {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='carselect']"));
		Select sel = new Select(dropDown);
		sel.selectByIndex(2);		//Index is starting from 0.
		Thread.sleep(3000);
		sel.selectByValue("benz");
		Thread.sleep(3000);
		sel.selectByVisibleText("BMW");	
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}

	}
