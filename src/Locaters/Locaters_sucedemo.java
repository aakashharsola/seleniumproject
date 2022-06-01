package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters_sucedemo {
	
	public static void main (String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
Thread.sleep(2000);
//for username
 WebElement username=driver.findElement(By.id("user-name"));
 username.sendKeys("standard_user");
 
 
 Thread.sleep(2000);

 //for password
 WebElement password =driver.findElement(By.id("password"));
 password.sendKeys("secret_sauce");
 
 Thread.sleep(2000);

 // login button
 WebElement loginbutton= driver.findElement(By.id("login-button"));
 loginbutton.click();
 
 Thread.sleep(2000);
 
 System.out.println("login successfully");
 
 String Url=driver.getCurrentUrl();
 System.out.println(Url);
 
 
 String title = driver.getTitle();
 System.out.println(title);
 String actual_Url="https://www.saucedemo.com/";
 String actual_title = "saucedemo";
 
 if (Url==actual_Url) {
	 
	 System.out.println("url is mathc");
	 
	 
 }
 else {
	 System.out.println("url not match");
 }
 if (title==actual_title) {
	 System.out.println("title is match");
	 
 }
 else { System.out.println("title not match");
 
		
	}
 
 // for add to cart 1.back pack
 WebElement addtocart1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
 addtocart1.click();
 Thread.sleep(2222);
 
 //remove item from cart
 WebElement addtocart2 = driver.findElement(By.id("remove-sauce-labs-backpack"));
 addtocart2.click();
 
 Thread.sleep(2222);
 // for add to cart 2. bike light
 
 WebElement addtocart3 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
 addtocart3.click();
 Thread.sleep(2222);
 
 
 //for cart link
 
 WebElement cart_link = driver.findElement(By.id("shopping_cart_container"));
 cart_link.click();
 
 Thread.sleep(2000);
 
 // for checkout
 
 WebElement checkout = driver.findElement(By.id("checkout"));
 checkout.click();
 Thread.sleep(2000);
 // for name and address
 
 WebElement checkout_firstname = driver.findElement(By.id("first-name"));
 checkout_firstname.sendKeys("aakash");
 Thread.sleep(1000);
 
 WebElement checkout_lastname = driver.findElement(By.id("last-name"));
 
 checkout_lastname.sendKeys("harsola");
 
 Thread.sleep(1000);
 
 WebElement checkout_postalcode = driver.findElement(By.id("postal-code"));
 checkout_postalcode.sendKeys("451881");
 
 Thread.sleep(1000);
 
 // for continue
 WebElement checkout_contineous = driver.findElement(By.id("continue"));
 checkout_contineous.click();
 Thread.sleep(1000);
 
 // for finish
 WebElement checkout_finish = driver.findElement(By.id("finish"));
 
 Thread.sleep(500);
 
 
 checkout_finish.click();
 
 // back to product
 
 WebElement back = driver.findElement(By.id("back-to-products"));
 back.click();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
	}
