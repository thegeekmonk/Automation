package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {


	public static void readProperties()
	{
		Properties prop = new Properties();
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\AkhileshPC\\Selenium\\1002_Selenium_Properties\\src\\config\\config.properties");
            prop.load(input);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("browser"));		

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        readProperties();

	}

}
