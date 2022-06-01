package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_of_WebElement {
	 
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com");
		 
		 driver.get("https://meesho.com");
		 
		 // getattribute, getText,getTagname
		 
		 WebElement attri = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		 String atttribute = attri.getAttribute("type");
		 String text =attri.getText();
		 String tagname= attri.getTagName();
		 System.out.println("attribute is "+ atttribute );
		 System.out.println("text is "+text);
		 System.out.println("tagname is "+tagname);
		 // isDisplay(),isEnable(), isSelected()
		 
		 WebElement attri1 = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		 
		System.out.println( attri1.isDisplayed());
		System.out.println( attri1.isEnabled());
		System.out.println( attri1.isSelected());
		 
		 //getlocation(), getsize()
		
		WebElement attri2 = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		 
		System.out.println( attri1.getLocation());
		System.out.println( attri1.getSize());
		System.out.println( attri1.getLocation().x);
		 
	}

}
