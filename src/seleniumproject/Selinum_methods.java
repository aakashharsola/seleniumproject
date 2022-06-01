package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinum_methods {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(2220);
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://youtube.com");
		
		Thread.sleep(2220);
		
		String s =driver.getCurrentUrl();
		System.out.println(s);
		
		driver.quit();
	}

}


