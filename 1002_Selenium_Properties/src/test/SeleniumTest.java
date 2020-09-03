package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\AkhileshPC\\Selenium\\1001_Selenium\\lib\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
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
