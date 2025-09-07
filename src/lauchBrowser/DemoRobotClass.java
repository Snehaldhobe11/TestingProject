package lauchBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebElement username=  driver.findElement(By.id("//input[@id='u_0_8_af']"));
		username.sendKeys("Snehal1");
		Robot robot = new Robot();
		robot.mouseWheel(1000);
		robot.mousePress(KeyEvent.VK_BACK_SPACE);//remove 1char 
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		//robot.mousePress();
		
		
		
//		JavascriptExecutor js  = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
	}

}
