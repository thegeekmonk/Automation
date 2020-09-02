package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1001_Selenium\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.quit();
		
	}

}
