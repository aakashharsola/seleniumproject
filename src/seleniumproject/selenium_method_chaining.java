package seleniumproject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_method_chaining {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.google.com");
		
		Dimension d=new Dimension(200,600);
		
	//Options o=	driver.manage();
	//Window w= o.window();
//	w.setSize(d);
		
		driver.manage().window().setSize(d);
	
	
	}

}
