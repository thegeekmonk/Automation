package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverFindElement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_Locator_1\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_Locator_1\\lib\\edge85driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		driver.navigate().to("https://google.com/webhp?hl=en&sa=X&ved=0ahUKEwjYg8iuoNPrAhUP9nMBHZIGBdwQPAgI");
		
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("youtube");
		
		//driver.navigate().forward();
		
		//driver.findElement(By.className("gNO89b")).click();
		
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("gNO89b")));
		driver.findElement(By.className("gNO89b")).click();
		
		//driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();
		
		List<WebElement> elements = driver.findElements(By.partialLinkText("YouTube"));
		
		System.out.println("Result Size : "+elements.size());

		
		//for()
		
		//element2.click();		
		//driver.quit();

	}

}
