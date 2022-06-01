package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.findElement(By.partialLinkText("Drag and drop")).click();
		//driver.findElement(By.partialLinkText("Demo 1")).click();
		
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement dest = driver.findElement(By.xpath("//div[contains(@id,'box106')]"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).perform();
	}

}
