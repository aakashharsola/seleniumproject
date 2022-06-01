package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fram1 {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		  
		
		// inspect frame
		
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id= 'frame2']")));
		System.out.println("frame is inspected");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id ='animals']")));
		select.selectByIndex(1);
		System.out.println("value at index 1 is selected");
		
	}
	

}
