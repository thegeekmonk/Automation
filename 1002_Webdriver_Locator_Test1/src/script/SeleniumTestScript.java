package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestScript 
{
	 public static WebDriver driver; 
	 public List<WebElement> elements;
	 
     public void setConfiguration()
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_Locator_Test1\\lib\\chromedriver\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
    	  
     }
     
     public void runTestScript()
     {    	 
    	 
    	 driver.get("https://google.com");
    	 
    	 //To find the text input element of google search page
    	 WebElement element = driver.findElement(By.name("q"));
    	 element.sendKeys("YouTube");   	 
    	 
    	 elements = driver.findElements(By.partialLinkText("YouTube"));
    	 
    	 
     }
}
