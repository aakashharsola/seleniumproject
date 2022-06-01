package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class meeshu_automation {
	
	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com");
		 
		 driver.get("https://meesho.com");
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 
		 
		 
		 //Select select =new Select(driver.findElement(By.xpath("//div[contains(@class,'NavBarDesktop__Subtitle-sc-1049n7y-0 jOGniz')]")));
		 
		 
		 //select.deselectByVisibleText("men");
		 WebElement search = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		 search.sendKeys("jeans");
		 
		 
		
	}


}
