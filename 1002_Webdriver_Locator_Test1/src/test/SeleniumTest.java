package test;

import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebElement;

import script.SeleniumTestScript;

//@RunWith(Parameterized.class)
public class SeleniumTest 
{
    private  SeleniumTestScript selenium;   
//    private  WebElement element;
    
//	public SeleniumTest(WebElement element) 
//	{
//		// TODO Auto-generated constructor stub
//		this.element = element;
//	}
//	
	@Before
	public void initialize()
	{
		selenium = new SeleniumTestScript();
		selenium.setConfiguration();
		selenium.runTestScript();
	}
	
//	@Parameters
//	public  static Iterable<? extends Object> input()
//	{
//		return SeleniumTestScript.elements;
//	}
	
	@Test
	public void testSeleniumTest()
	{
		for(WebElement element : selenium.elements)
	     Assert.assertTrue(element.getText().contains("YouTube"));	
	}

}
