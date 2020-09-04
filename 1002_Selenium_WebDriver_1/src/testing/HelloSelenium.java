package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import external.PropertiesFile;

public class HelloSelenium {

	public static String browser;
	public static String serachUrl;
	public static WebDriver driver;
    
	public static String expectedTitle = "YouTube";
	public static String actualTitle = "";
	
	public static void setFields()
	{
		PropertiesFile.readFile();
	}
	
	public static void setConfiguration()
	{
		
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_WebDriver_1\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.Edge.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_WebDriver_1\\lib\\chromedriver\\chromedriver.exe");
			driver = new EdgeDriver();
		}		
		
	}
	
	public static void runTest()
	{   
		driver.get(serachUrl);
		 actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			System.out.println("Test Passed !!");
		else
			System.out.println("Test Failed !!");
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		setFields();
		setConfiguration();
		
		runTest();		

	}

}
