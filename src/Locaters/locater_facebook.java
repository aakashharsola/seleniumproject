package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater_facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
   Thread.sleep(2000);
   
   
  WebElement username =driver.findElement(By.id("email"));
  username.sendKeys("8109828140");
  
  
  WebElement pass =driver.findElement(By.id("pass"));
  pass.sendKeys("@*************@");
  
  
  
  WebElement login =driver.findElement(By.name("login"));
  
  login.click();
		
	}

}
