package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

public class SeleniumTest {

	public static String browser;
	public static WebDriver driver;
	
//	public static void setBrowser()
//	{
//		browser = PropertiesFile.readProperties();
//	}
//	
	public static void setBrowserConfig() {
		
		if(browser.equals("Chrome"))
		{   
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1001_Selenium\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			
		}		
		
	}
	
	public static void runTest()
	{
		driver.get("https://youtube.com");
		driver.close();
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
//	    setBrowser();
	    
	    PropertiesFile.readProperties();
	    setBrowserConfig();
	    runTest();
	    
	    PropertiesFile.writeProperties();
		
	}

}
