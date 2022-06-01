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

public class makeMyTrip {
	
 static WebDriver driver;
 
  public static void screenshot() throws IOException {
	  
	  
	  Date d = new Date();
	  DateFormat d1 = new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
	  String date = d1.format(d);
	  
	  TakesScreenshot ts = (( TakesScreenshot)driver);
	  
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("D:\\seleniumScrenShot\\makemytrip"+date+".jpg");
	  
	  FileHandler.copy(source, dest);
  }
   
  public static void login() throws IOException{
	  
	  WebElement loginwithno = driver.findElement(By.xpath(("//span[@class='landingSprite myIconWhite']")));
		loginwithno.click();
		
		WebElement username = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
		username.sendKeys("8109828140");
		
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
	screenshot();
  //WebElement submit =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
  // submit.click();
		screenshot();
		
	//	WebElement otp = driver.findElement(By.xpath("//input[contains(@id, 'otp')]"));
	//otp.click();
//		
	screenshot();
	
	WebElement log = driver.findElement(By.xpath("//button[contains(@data-cy,'login')]"));
	log.click();
	
	screenshot();
//		
	  
  }
  
  public static void main(String[] args) throws IOException {
	  

		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://makemytrip.com");
		
    	screenshot();
    	
    	login();
//		WebElement login = driver.findElement(By.xpath("//div[contains(@class,'loginModal displayBlock modalLogin dyn')]"));
//		login.click();
//	
//		screenshot();
//		
//		WebElement mob = driver.findElement(By.xpath("//li[contains(@data-cy,'account')]"));
//		mob.click();
//		
//		screenshot();
//		
	//		
//		
//		
//		
		
		
//		

}
}
