package Locaters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class locator_amezon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.get("https://amezon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		
		WebElement signin = driver.findElement(By.xpath("//span[contains(@id, 'nav-link-accountList-nav-line-1')]"));
		signin.click();
		
		
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@id, 'ap_email')]"));
		name.sendKeys("8109828140");
		
		WebElement continiue=driver.findElement(By.xpath("//input[contains(@id, 'continue')]"));
		continiue.click();
		
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'ap_password')]"));
		pass.sendKeys("@94240876688@");
		
        // WebElement submit=driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]"));
		//submit.click();
		

      //  WebElement forgot=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
	//	forgot.click();
		
		
		
		
		//WebElement conti=driver.findElement(By.xpath("//input [contains(@id,'continue')]"));
		//conti.click();
		
		WebElement submitt=driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]"));
		submitt.click();
		
		
		
	 
		//method for find particular vlaue of list by index/value/visbial
	Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]")));
		select.selectByIndex(6);
		
		//find all elemet of list
		
	//	List <WebElement> values=driver.findElements(By.tagName("option"));
		
		//for (int i=0;i<values.size();i++) {
			
			//System.out.println(values.get(i).getAttribute("value"));
		
		//}
		
		WebElement submitbutton=driver.findElement(By.xpath("//input[contains(@id,'submit-button')]"));
		submitbutton.click();
		
		
		WebElement heter_cooler=driver.findElement(By.xpath("//span[contains(text(),'Heating & Cooling'  )]"));
	heter_cooler.click();
		
	WebElement aircooler=driver.findElement(By.xpath("(//span[contains(text(),'Air Coolers')])[2]"));
	aircooler.click();
	
		
		
		WebElement submitt2=driver.findElement(By.xpath("(//a[contains(@class,'bxc-grid-overlay__link')])[1]"));
		submitt2.click();
		
		WebElement c_select=driver.findElement(By.xpath(("//img[contains(@class,'s-image')][1]")));
		c_select.click();
		
		
		
		WebElement add2cart=driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]"));
		add2cart.click();
		
	}

}
