package lauchBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("Webdriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
      
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
          String url  =driver.getCurrentUrl();
          System.out.println("https://www.google.com/");
       Point p = new Point(300,200);
       driver.manage().window().setPosition(p);
       Thread.sleep(2000);
      driver.close();
	}

}
