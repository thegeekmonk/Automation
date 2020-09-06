package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverFindElement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_Locator_1\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com/webhp?hl=en&sa=X&ved=0ahUKEwjYg8iuoNPrAhUP9nMBHZIGBdwQPAgI");
		
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("youtube");
		
		driver.navigate().forward();
		driver.findElement(By.className("gNO89b")).click();;
		//element2.click();
		
		driver.quit();

	}

}
