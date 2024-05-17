package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilities {
	public  static WebDriver driver;

		public static WebDriver startBrowser(String browserName, String url){
			
			if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
			if(browserName.equalsIgnoreCase("chrome")){
				String path= "C:\\selenium-java-3.14.0\\drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				driver = new ChromeDriver();
			}
			if(browserName.equalsIgnoreCase("IE")){
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		
	}
		public static void CloseDriver() {
			// TODO Auto-generated method stub
			driver.close();
		}


}
