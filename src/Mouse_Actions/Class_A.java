package Mouse_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {
//Methods of Actions  (by using below methods of actions class we can perform the mouse actions on browser)
//1) act.click; 
//2) act.doubleClick();
//3) act.contextClick(); --> To right click on web element
//4) act.moveToElement(WebElement);
//5) act.dragAndDrop(WebElement);
//6) act.clickAndHoldWebElement
//7) act.built(); --> This method is used when we are using two or more than two action class methods to combine action
//8) act.perform();  --> This is compulsory method after above methods
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get ("https://demo.guru99.com/test/simple_context _menu.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);

	}

	}
