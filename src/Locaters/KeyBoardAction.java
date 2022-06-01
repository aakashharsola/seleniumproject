package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyBoardAction {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		
		WebElement area1= driver.findElement(By.xpath("//textarea[contains(@id,'inputText1')]"));
		
		area1.sendKeys("aaksh");
		
		Actions action= new Actions(driver);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.keyDown(Keys.CONTROL);
		
		action.sendKeys("c");
		action.keyDown(Keys.CONTROL);
		action.perform();
		
		WebElement area2= driver.findElement(By.xpath("//textarea[contains(@id,'inputText2')]"));
		area2.click();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
	}
}
