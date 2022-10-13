package Self_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board_Action_On_IRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a =new Actions(driver);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary'] ")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("KameshJadhav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"usrPwd\"]")).sendKeys("18111995@Jk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cnfUsrPwd\"]")).sendKeys("18111995@Jk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[6]/li")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input")).sendKeys("shripati");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("kamesh");
		driver.findElement(By.xpath("//*[@id=\"middleName\"]")).sendKeys("jagdish");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("jadhav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input")).sendKeys("18-11-1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"unmarried\"]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kamesh.j.jadhav@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7768999422");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select")).sendKeys("India");
	    driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"resAddress1\"]")).sendKeys("Opposite to alpine aura society");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"resAddress2\"]")).sendKeys("Pune-Nashik Haiway");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"resAddress3\"]")).sendKeys("Moshi,Pimpri-Chinchwad");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input")).sendKeys("412105");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"resState\"]")).sendKeys("Maharashtra");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select")).sendKeys("Pune");
	    
		// program still to be edit(completed)
	}

	}
