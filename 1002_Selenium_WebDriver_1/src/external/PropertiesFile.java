package external;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import testing.HelloSelenium;

public class PropertiesFile {
    
	static Properties prop = new Properties();
	
	public static void readFile()
	{
		try {
			InputStream input = new FileInputStream("C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_WebDriver_1\\src\\external\\file.properties");
			prop.load(input);
			
			HelloSelenium.browser = prop.getProperty("browser");
			HelloSelenium.serachUrl = prop.getProperty("searchUrl");
			HelloSelenium.expectedTitle = prop.getProperty("expectedTitle");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       readFile();
//	}

}
