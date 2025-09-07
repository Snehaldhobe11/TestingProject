package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:Users\\\\User\\\\Desktop\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		      String title = driver.getTitle();
		      System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String actual = driver.getCurrentUrl();
		String Exp = driver.getCurrentUrl();
		
		if(actual.equals(Exp)) {
			
			System.out.println("Google Page is successfully opened");
			}
		else {
			System.out.println("Unable to open Google Page");
		}
		Thread.sleep(3000);
		Dimension d = new Dimension(200, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Dimension dd = new Dimension(100,500);
		driver.manage().window().setSize(dd);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println(title1 );
		 String Act = driver.getCurrentUrl();
		 String Expt = driver.getCurrentUrl();
		 if(Act.equals(Expt)) {
		 System.out.println("Facebook page is successfully opend");
		 }
		 else {
			 System.out.println("unable to login facebook page"); 
		 }
		 driver.navigate().refresh();
		 driver.navigate().to("https://www.flipkart.com/goboult-previously-boult-z40-enc-mic-60h-battery-life-low-latency-gaming-5-3v-bluetooth/p/itm21d4f04d5f53e?pid=ACCGKXHYZECYJRTS&lid=LSTACCGKXHYZECYJRTSLEXAGC&marketplace=FLIPKART&q=headphone&store=0pm%2Ffcn&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&fm=organic&iid=en_Xo2yHxxmKR7mdgMv7WZ-edauWLWhCj24sdTO1LtO-5Dakaljl_cNRiPTUh-7WL9TGm9THSOIrV5kn7-gnc8n6E4IsYyWu-Pj9cxFjFAoaLk%3D&ppt=None&ppn=None&ssid=u5ljp45ha80000001756902221696&qH=b052e360817fdeec");
		 
//		WebElement username=  driver.findElement(By.id("//input[@id='u_0_8_af']"));
//		username.sendKeys("Snehal");
//		 
//		WebElement surname =  driver.findElement(By.xpath("//input[@id='u_0_a_VU']"));
//		surname.sendKeys("dhobe");
//		
//		WebElement dayList =  driver.findElement(By.xpath("//select[@id='day']"));
//		Select day =new Select(dayList);
//		day.selectByVisibleText("10");
//		
//		WebElement monthList =  driver.findElement(By.xpath("//select[@id='month']"));
//		Select month =new Select(monthList);
//		month.selectByVisibleText("Oct");
//		
//		WebElement yearList =  driver.findElement(By.xpath("//select[@id='year']"));
//		Select year =new Select(yearList);
//		year.selectByVisibleText("2024");
//		
		//Dynamic element
		WebElement rating=  driver.findElement(By.xpath("//span[contains(text(),' Ratings ')]"));
		String text =rating.getText();
		System.out.println(text);
		 
		//select[@id="day"]
		 Thread.sleep(2000);
		 //driver.close();
		}
	
	
		
	}



