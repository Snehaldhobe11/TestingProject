package lauchBrowser;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("Webdriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com/");
	      
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       
	     // double num  =  Math.random(); genrate name
	       //LocalDateTime time= LocalDateTime.now();
	       File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File Dest =new File("E:\\SnehalProject\\TestingProject\\Screenshoot\\Capturescreenshoot.jpg");
	       FileHandler.copy(source, Dest);
	}

}
