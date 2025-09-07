package lauchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:Users\\\\User\\\\Desktop\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.majinaukri.com/");

	}

}
