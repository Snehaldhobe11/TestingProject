package lauchBrowser;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		//first Approach using sendkeys
		WebElement choosebtn=  driver.findElement(By.xpath("//input[@name='file']"));
		choosebtn.sendKeys("file:///D:/OldProject/QA_SnehalDhobe_2.5%20Years%20Experince.pdf");
		//2 method using click() method
		
		//choosebtn.click();
		
		
	}

}
