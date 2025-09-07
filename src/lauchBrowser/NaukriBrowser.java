package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukriBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("WebDriver.chrome.driver", " ");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.naukri.com/nlogin/login");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     
    WebElement username= driver.findElement(By.xpath("//input[@id='usernameField']"));
    username.sendKeys("snehaldhobe11@gmail.com");
    WebElement password= driver.findElement(By.xpath("//input[@id='passwordField']"));
    password.sendKeys("snehal@1010");
    WebElement loginbutton= driver.findElement(By.xpath("//input[@type='submit']"));
    loginbutton.click();
    
     String url = driver.getTitle();
     System.out.println(url);
     
     
     
     
	}

}
