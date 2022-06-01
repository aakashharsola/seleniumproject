package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
  public static void main(String[] args) {
	
	  
	  System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("chorme is opne");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		  
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id= 'frame1']")));
		driver.findElement(By.xpath("(//input )[1]")).sendKeys("aaksh");
		System.out.println("aaksh is print in text box");
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id= 'frame3']")));
		System.out.println("switch to frame 3");
		
      driver.findElement(By.xpath("//input[@id= 'a']")).click();
     
      System.out.println("check box is cleakebal");
      
      
      
      
       System.out.println(driver.switchTo().defaultContent().getTitle());
  
}
}
