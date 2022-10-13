package Self_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_C {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("thar images");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input [@class='gNO89b'])[2]")).click();
		Thread.sleep(1000);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path = new File("E:\\SOFTWARE TESTING\\AUTOMATION_TESTING\\Selenium\\ScreenShots using selenium\\thar images" + ".png");
		FileHandler.copy(screenshot, path);
	}

    }

// How to takes a screenshot in selenium  using java lan?
