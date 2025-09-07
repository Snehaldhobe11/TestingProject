     package lauchBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFirst {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:Users\\User\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Upcasting
		driver.get("https://www.flipkart.com/"); //for launch a browser
		driver.manage().window().minimize(); 
		Thread.sleep(3000);
		
		Dimension d = new Dimension(1000,700); //set the size
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p); // set the tab where we want left,right,right-bottom
		
		
		
		
		driver.navigate().to("https://www.Amazon.com"); // navigate to another Url
		
		driver.navigate().back(); // navigate to back page
		Thread.sleep(3000); 
		driver.navigate().refresh(); // for refreshing a tab
		Thread.sleep(3000);
		driver.navigate().forward(); // navigating to forward page
		
		
	  String Acturl= driver.getCurrentUrl() ; //get currentTitle
	  System.out.println("https://www.Amazon.com");
	  
	  String Expurl= driver.getCurrentUrl() ;
	  
	  if(Acturl.equals(Expurl)) {
		  System.out.println("Test case is Passed");  
	  }
	  else {
		  System.out.println("Test case is Failed"); 
	  }
	  
	  //driver.close();// close current tab.

	}

}
         