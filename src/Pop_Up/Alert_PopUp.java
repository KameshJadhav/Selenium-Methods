package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("Kamesh jadhav");
		Thread.sleep(2000);
		alert.dismiss();
	}
	}

//2. Alert popup
//This Popup is not a part of  website.
//This Popup does not have any DOM structure/HTML code presend

//Step
//*To handle this popup  we need to shift  focus from main page to alert popup.
//*To shift focus to alert we use.

//		Alert alert  = driver.switchTo().alert();

//*use following methods to  perform actionon alert popup
//1)To get text from alert popup    -->  alert.getText();
//2)To click on ok button 	        -->  alert.accept();
//3)To  send  input in input field  -->  alert.sendKeys(" abcd ");
//4)To click on cancel button 	    -->  alert.dismiss();