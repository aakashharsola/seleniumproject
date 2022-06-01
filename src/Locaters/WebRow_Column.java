package Locaters;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebRow_Column {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		// size of table
		WebElement table =driver.findElement(By.xpath("//table"));
		System.out.println(table.getSize());
		System.out.println(driver.getTitle());
	
		
		
		//inspect single elemet
//		
//		WebElement value1 = driver.findElement(By.xpath("(//table//tbody//tr//td)[2]"));
//		System.out.println(value1.getText());
//		System.out.println(value1.isDisplayed());
//		System.out.println(value1.isSelected());
//		  
		
		
		// datacoloum wise
	   List<WebElement> alldata= driver.findElements(By.xpath("//table//tbody//tr"));
	   System.out.println(alldata.size());
	   
	   for (int i=0; i<alldata.size(); i++) {
		   
		   System.out.println(alldata.get(i).getText());
		   
	   }
	
	   
	   // data column wise
	   
	   List <WebElement > column = driver.findElements(By.xpath("//table//tbody//tr//th"));
	   System.out.println(column.size());
	    for (int i=0; i<column.size();i++) {
	    	
	    	System.out.println(column.get(i).getText());
	    	
	    }
	   
	   
	}
	

}
