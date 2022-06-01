package Locaters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mintra_outomation {
static 	WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.get("https://myntra.com");
		screenshot();
		
		fassion();
		screenshot();
		
    
		
		
		
		
	}
	
	public static void screenshot() throws IOException {
		
		Date d= new Date();
		
		SimpleDateFormat d1 = new SimpleDateFormat("DD-MM-YYYY HH-MM-SS");
		
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\seleniumScrenShot\\myntra"+date+".jpg");
		FileHandler.copy(source, dest);
		
	}
 public static void fassion() {
	 Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")))).perform();
		
		driver.findElement(By.xpath("//a[contains(@class,'desktop-categoryLink')]")).click();
	 driver.findElement(By.xpath("(//div[contains(@class,'common-checkboxIndicator')])[1]")).click();
	 driver.findElement(By.xpath("(//div[contains(@class,'common-checkboxIndicator')])[4]")).click();
	 System.out.println("checkbox is clickebal");
	 
	 System.out.println(driver.getTitle());
	 
	 //driver.findElement(By.xpath("(//input[contains(@class,'filter-search-inputBox')])[1]")).sendKeys("max");
	 driver.findElement(By.xpath("(//div[contains(@class,'common-checkboxIndicator')])[3]")).click();
	 driver.findElement(By.xpath("(//div[contains(@class,'common-checkboxIndicator')])[5]")).click();
	 driver.findElement(By.xpath("(//div[contains(@class,'common-checkboxIndicator')])[11]")).click();
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,13000)");
	 
	 //driver.findElement(By.xpath("(//div[@class='common-radioIndicator'])[2]")).click();
	 
	 
	 
 }
}
