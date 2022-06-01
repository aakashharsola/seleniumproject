package Locaters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Amzon_sinerio {
	
	public static WebDriver driver ;
	static  String log [] = new String[2];
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Screenshot();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Screenshot();
		
		String[] log = Excellsheet();
		login(log);

		Screenshot();
		
		//amezonpay_mobileRechareg();
		//amezonpay_train();
		
		fassion();
		
		Screenshot();
		logout();
		Screenshot();
	} 
	
	
	
	public static void Screenshot() throws IOException {
		
		Date d = new Date();
		DateFormat d1= new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
		String date = d1.format(d);
		String title = driver.getTitle();
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\amezonScreenShot\\"+title+"_"+date+".jpg");
		FileHandler.copy(source, dest);
		
		
	}
	
	public static String[] Excellsheet() throws IOException {
		FileInputStream file = new FileInputStream("E:\\amezonScreenShot\\Login.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Login Data");
				
		log[0] = sheet.getRow(0).getCell(0).getStringCellValue();
		log[1] = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(log[0]);
		System.out.println(log[1]);
		
		return log;
	}
	
	
	
	public static void login(String[] log) throws InterruptedException {
		driver.get("https://amezon.in");
		
		WebElement signin = driver.findElement(By.xpath("//span[contains(@id, 'nav-link-accountList-nav-line-1')]"));
		signin.click();
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@id, 'ap_email')]"));
		name.sendKeys(log[0]);
		
		WebElement continiue=driver.findElement(By.xpath("//input[contains(@id, 'continue')]"));
		continiue.click();
		
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'ap_password')]"));
		pass.sendKeys(log[1]);
		
		WebElement submitButton=driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]"));
		submitButton.click();
	}
	
	public static void amezonpay_mobileRechareg() throws InterruptedException {
		
		driver.findElement(By.linkText("Amazon Pay")).click();
		driver.findElement(By.linkText("Mobile Recharge")).click();
		driver.findElement(By.xpath("//input[contains(@id,'mobileNumberTextInputId')]")).sendKeys("8109828140");
	
		Thread.sleep(30000);
		
		   
	 driver.findElement(By.xpath("//a[contains(@id,'viewPlanTriggerId')]")).click();
	 driver.findElement(By.xpath("//*[@id=\"RECOMMENDED_PACKS\"]/tbody/tr[1]/td/div[1]/div[2]/span/span/input")).click();
	 driver.findElement(By.xpath("//*[@id=\"buyButtonNative\"]")).click();
	}
	public static void amezonpay_train() {
		
		
		driver.findElement(By.linkText("Amazon Pay")).click();
		driver.findElement(By.linkText("Trains")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'af721ede sizeMini colorTertiary')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'input-searchText')]")).sendKeys("indore");
		
		driver.findElement(By.xpath("(//span[contains(@class,'af721ede sizeMini colorTertiary')])[2]")).click();
	}
	
	public static void fassion() {
		
		Select s = new Select(driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]")));
		s.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mens tshirt");
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@class,'s-image')]")).click();
		
		//driver.findElement(By.xpath("//img[contains(@class,'a-dynamic-image sl-sobe-carousel-sub-card-img')]")).click();
		//driver.findElement(By.partialLinkText("Sportswear")).click();
		
		//driver.findElement(By.xpath("(//span[contains(@class, 'sl-sobe-carousel-sub-card-title')])[3]")).click();
		
		//driver.findElement(By.xpath("(//div[contains(@class,'a-section aok-relative s-image-tall')])[2]")).click();
		//for window switch
		
		List <String> addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		
		//Select sel= new Select(driver.findElement(By.xpath("//select [contains(@id,'native_dropdown_selected_size_name')]")));
		//sel.selectByIndex(0);
		
		driver.findElement(By.xpath("//input [contains(@id,'add-to-cart-button')]")).click();
		
		
		}
	
	public static void logout() {
		
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'nav-line-1-container')]"))).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

}
