package Locaters;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_window {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		
		//2.alert popup
		
		driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		System.out.println("alter is handel");
		
		driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]")).click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		alert.sendKeys("aaksh");
		System.out.println("value is pass");
		Thread.sleep(2000);
		alert.accept();
		
	}
	

}
