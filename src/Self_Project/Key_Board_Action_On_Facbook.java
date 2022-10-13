package Self_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board_Action_On_Facbook {

	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  // Object -->upcasting
			
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);

			
		Actions a = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("kamesh");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][2]")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(3000);
		
		WebElement b = driver.findElement(By.name("birthday_day"));  //For pop-up & select the birth date
		 a.click(b).perform();
		 a.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(3000);
		 a.sendKeys(Keys.ENTER).perform();
		 a.sendKeys(Keys.NUMPAD1).perform();
		 a.sendKeys(Keys.NUMPAD8).perform();
		 a.sendKeys(Keys.ENTER).perform();
		 
		WebElement c = driver.findElement(By.name("birthday_month"));
		 a.click(c).perform();
		 a.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(3000);
		 a.sendKeys(Keys.ENTER).perform();
		 a.sendKeys(Keys.chord("Nov")).perform();
		
		WebElement d = driver.findElement(By.name("birthday_year"));
	    a.click(d).perform();
	    a.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER).perform();
		a.sendKeys(Keys.chord("1995")).perform();

			

	}

	}
