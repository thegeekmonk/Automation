package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestScript 
{
	 public static WebDriver driver; 
	
	
     public static void setConfiguration()
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_Locator_Test1\\lib\\chromedriver\\chromedriver.exe");
    	 driver = new ChromeDriver();
     }
}
