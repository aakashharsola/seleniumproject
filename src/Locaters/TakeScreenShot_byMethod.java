package Locaters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot_byMethod {
 static WebDriver driver;
 
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		screenshot();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.facebook.com");
		screenshot();
		
		
		//driver.get("https://www.meeshu.com");
		screenshot();
		
		WebElement login = driver.findElement(By.xpath("//div[contains(@class,'loginModal displayBlock modalLogin dyn')]"));
		login.click();
	}
	
    public static void screenshot ( ) throws IOException {
    	
    	
    	Date d = new Date();
    	
    	SimpleDateFormat  d1 = new  SimpleDateFormat("MM-DD-YY  HH-MM-SS");
    	
    	String date = d1.format(d);
    	
    	TakesScreenshot ts =((TakesScreenshot )driver);
    	
 File source = ts.getScreenshotAs(OutputType.FILE);
    	
    	File dest= new File("D:\\seleniumScrenShot\\screenshot1"+date+".jpg");
    	
    	FileHandler.copy(source,dest);
    	
    	
    	
    	
    }
}
