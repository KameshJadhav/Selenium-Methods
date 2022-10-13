package Self_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("kamesh");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).sendKeys("jadhav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g')]")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(3000);     
		driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("kamesh.j.jadhav@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("kamesh1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("18");
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Nov");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_3')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_s')]")).click();
	}

	}
