package Self_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_chrome_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Object -->upcasting
	
	}

    }
