package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_site {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("http://practice.automationtesting.in/");
		Thread.sleep(3000);
		//login();
		driver.findElement(By.partialLinkText("My Account")).click();
	}
	
	//public static void login() {
		//1. login with user name
		
		
		
	}
	


