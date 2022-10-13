package Scrolling_Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//To perform scrolling action we need to use javascriptExecutor interface.First we create object of javascriptExecutor interface by type casting with web driver.
//JavaScriptExecutor js = (javascriptExecutor)driver;
//Types of scrolling method

//1) Scroll by pixel --> js.executeScript("window.scroll(0,800)");
//--> First parameter for x axis & second is for y axis

public class Scroll_By_Pixel {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,2000)");
	}

}