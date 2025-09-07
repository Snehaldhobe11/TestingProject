package lauchBrowser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@aria-label='Amazon India Home']"));//a[@aria-label="Amazon India Home"]
		String title=  driver.getTitle();
		System.out.println(title);
		
		js.executeScript("arugments[0].scrollIntoView(true)");
		//js.executeScript("window.scrollBy(0,-1500)");
	}

}
