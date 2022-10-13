package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_B {

	public static void main(String[] args) throws InterruptedException {
		//WebElement methods
		// 1) .click()
		// 2) .sendKeys()
		// 3) .getText()  we can get any single or multiple using this method.
		// 4) .getAttribute() This method will give the attribute value.
		// 5) .isSelected()   with help of this we get true/false answer(for radio button we will use this method)
		// 6) .isEnabled()    This method is used to check element active or no. it gives answer in true/false
		// 7) .isDisplayed()  This method is used when object is in DOM for checking present in the DOM. 
System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
		
		driver.get("https://courses.letskodeit.com/practice");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name'][1]")).sendKeys("kamesh");
		WebElement text = driver.findElement(By.xpath("//h1[test()='Practice Page']"));
		System.out.println(text.getText());
		
	}

}
