package parent;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static WebDriver driver;
	public  static String searchString;
	public Properties prop = new Properties();
	
		
	public GoogleSearch() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setConfiguration()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_GoogleSearch\\lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		try 
		{
			InputStream input = new FileInputStream("C:\\Users\\AkhileshPC\\Selenium\\1002_Webdriver_GoogleSearch\\src\\external\\inputfile.properties");
			prop.load(input);
			
			searchString = prop.getProperty(searchString);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
