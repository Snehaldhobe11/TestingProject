package lauchBrowser;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.Select;

public class LaunchPaytm {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		//WebElement Newregister = driver.findElement(By.xpath("//a[contains(text(),'Get a new Rediffmail ID']"));
		//Newregister.click();
		
		//driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		fname.sendKeys("snehaldhobe");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
		name.sendKeys("snehaldhobe");
		WebElement checkbutton = driver.findElement(By.xpath("//input[@class='btn_checkavail button']"));
		checkbutton.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='newpasswd']"));
		password.sendKeys("snehal12345");
		Thread.sleep(2000);
		WebElement newpassword = driver.findElement(By.xpath("//input[@id='newpasswd1']"));
		newpassword.sendKeys("snehal12345");
		
		//select class
		WebElement Daylist = driver.findElement(By.xpath("//select[@class='day']"));
		Select select = new Select(Daylist);
		select.selectByVisibleText("10");
		Thread.sleep(2000);
		WebElement Monthlist = driver.findElement(By.xpath("//select[@class='middle month']"));
		Select select1 = new Select(Monthlist);
		select1.selectByVisibleText("OCT");
		Thread.sleep(2000);
		
		WebElement Yearlist = driver.findElement(By.xpath("//select[@class='year']"));
		Select select3 = new Select(Yearlist);
		select3.selectByVisibleText("2004");
		Thread.sleep(2000);
		
		WebElement female = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		boolean result = female.isSelected();
	    if(result) {
	    	System.out.println("Radio button is selected");
	    }
	    else {
	    	System.out.println("Radio button not selected");
	    }
	    
		
		
		WebElement Countrylist = driver.findElement(By.id("country"));
		Select countrylist = new Select(Countrylist);
		countrylist.selectByVisibleText("Australia");
		Thread.sleep(2000);
		
		WebElement alternatemail = driver.findElement(By.xpath("//input[@placeholder='Enter recovery email']"));
		alternatemail.sendKeys("snehaldhobe@rediff.com");
		Thread.sleep(2000);
		
//		WebElement Numberlist = driver.findElement(By.xpath( "//input[@value='44']"));
//		Select numberlist = new Select(Numberlist);
//		numberlist.selectByVisibleText("India (+91)");
//		Thread.sleep(2000);
		WebElement Mobnum = driver.findElement(By.id("mobno"));
		Mobnum.sendKeys("9988776655");
		Thread.sleep(2000);
		
		
		WebElement captcha = driver.findElement(By.xpath("//input[@class=\"captcha\"]"));
		captcha.sendKeys("DPMM");
		//JavascriptExecutor perform
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		register.click();
		
		
	}

}
