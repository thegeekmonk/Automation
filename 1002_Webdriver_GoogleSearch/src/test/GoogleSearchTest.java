package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import page.GoogleSearchPage;
import parent.GoogleSearch;

public class GoogleSearchTest extends GoogleSearch
{

	private GoogleSearchPage page;
	
	public GoogleSearchTest() {
		// TODO Auto-generated constructor stub
	}
		
	@Before
	public void initialize()
	{
		page = new GoogleSearchPage();
//		page.setConfiguration();
		page.runTestScript();
	}
	
	
	@Test
	public void testGoogleSearchPage()
	{   
		System.out.println("Google Result Size :  "+page.elements.size());
		
		for(WebElement element : page.elements)
		{   
//			System.out.println("\nLink Text ---->  "+element.getText());
			 assertTrue(element.getText().contains(searchString));
		}		
		
	}
	
	@After
	public void closure()
	{
		driver.close();
	}

}
