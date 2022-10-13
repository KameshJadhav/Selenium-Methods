package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_B {


public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();  // Object -->Down casting
			
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
}

public static void getScreenshot(WebDriver diver, String testcaseName) throws IOException {
	TakesScreenshot driver = null;
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File path = new File("E:\\SOFTWARE TESTING\\Screenshots\\verifyUserCanLogin.jpg");
	FileHandler.copy(screenshot, path);
	
}}
