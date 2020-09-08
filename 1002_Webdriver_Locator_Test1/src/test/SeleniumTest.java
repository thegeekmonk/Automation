package test;

import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import script.SeleniumTestScript;

@RunWith(Parameterized.class)
public class SeleniumTest 
{
    private SeleniumTestScript selenium;
    
	public SeleniumTest() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void initialize()
	{
		selenium = new SeleniumTestScript();
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return SeleniumTestScript.elements;
	}
	
	

}
