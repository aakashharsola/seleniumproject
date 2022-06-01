package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locater_flipcart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
  

 WebElement cross =driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
		
 cross.click();
 
 Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath(("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div/img")))).perform();
 
 
 WebElement subLinkOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
 subLinkOption.click();
 
 WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a[2]"));
    tshirt.click();

  
    
    WebElement buy = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA ihZ75k _3AWRsL')]"));
    buy.click();

    
	}

}
