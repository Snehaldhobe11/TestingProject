package DemoProjecct;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDateTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SoftwareTestingHelp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       
	       //scrolldown
	       Robot robo = new Robot();
		   robo.mouseWheel(200);
		   
	      WebElement TextField = driver.findElement(By.xpath("//input[@name='username']"));
	      TextField.sendKeys("Snehal");
	      Thread.sleep(2000);
	      WebElement PasswordField = driver.findElement(By.xpath("//input[@name='password']"));
	      PasswordField.sendKeys("snehal");
	      Thread.sleep(2000);
	      
	      
	       WebElement Text = driver.findElement(By.xpath("//textarea[@name='comments']"));
	      Text.sendKeys("12345");
	      Thread.sleep(2000);
	      WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
	      checkbox1.click();
	      Thread.sleep(2000);
	      WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
	      checkbox2.click();
	      Thread.sleep(2000);
	      WebElement checkbox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
	      checkbox.click();
	      Thread.sleep(2000);
	      
	      
	      WebElement radiobtn = driver.findElement(By.xpath("//input[@name=\"radioselenium\"]"));
	      radiobtn.click();
	      Thread.sleep(2000);
	      //select class
	      WebElement selcttext  = driver.findElement(By.xpath("(//select[@class=\"spTextField\"])[1]"));
	      Select select = new Select(selcttext);
	      select.selectByVisibleText("Selenium");
	      Thread.sleep(2000);
	      
	      //Alert
	      WebElement alt = driver.findElement(By.xpath("//div[@class=\"goog-rtopics\"]"));
	      alt.click();
	      Alert alert = driver.switchTo().alert();
	      alert.sendKeys("Jira");
	      
	    //select class
	      WebElement selectDropdown  = driver.findElement(By.xpath("(//select[@class=\"spTextField\"])[2]"));
	      Select select1 = new Select(selectDropdown);
	      select1.selectByVisibleText("QTP");
	      Thread.sleep(2000);
	      WebElement Date  = driver.findElement(By.xpath("(//input[@class=\"spTextField\"])[3]"));
	     LocalDateTime sd =  LocalDateTime.now();
	      
	}

}
