package Locaters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.get("https://facebook.com");
		
	TakesScreenshot ts =(TakesScreenshot)driver;
	
	File source= ts.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("D:\\seleniumScrenShot\\screenshot.jpg");
	
	FileHandler.copy(source,dest);
	}

}
