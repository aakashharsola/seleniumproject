package seleniumproject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method_chaining {
	
	public static void main(String args[]) {
	
System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
		
		Dimension d= new Dimension(500,400);
		
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
	}

}
