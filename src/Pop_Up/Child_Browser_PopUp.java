package Pop_Up;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		
		// System.out.println(productList.size());
		
		for(int i=0; i<3; i++)
		{
			productList.get(i).click();
		}
		
		String mainPageAddress = driver.getWindowHandle();
		//System.out.println("Main Page Address : " + mainPageAddress);
		
		Set<String> allAddress = driver.getWindowHandles();
		
		List<String> allAddressList = new ArrayList<>(allAddress);
		//System.out.println("All Page Address : "+ allAddressList);
		
		for(int i=0; i<allAddressList.size(); i++)
		{
			driver.switchTo().window(allAddressList.get(i));
			System.out.println(driver.getTitle());
			
			if(i==3)
			{
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
		}
		

	}
	}
//3) Child browser popup

//This popup is nothing but the "new tab opened" when we click on any web element.

//a) All opened child browsers have  different addresses.

//b) To perform action on element of child tab we need  to shift selenium focus from main page to child tab, use following method.
//				driver.switchTo().window(address);

//c) To get all addresses of all tabs.
//				set<String>address=driver.getWindowHandles();  --> Returns the set of string having addresses including main tab.
				
//d) To switch to new opned tabs from main tab we need to know the sequence addresses in set.
//For that we need to convert set in to list so that we can use index to switch between tabs.
//				List<String> addressList = ArrayList<>(address);

//e) Getting addresses in list.
//				List<String> adsressList=ArrayList<>(driver.getWindowHandles());



