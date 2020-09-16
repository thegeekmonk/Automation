package test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorTest 
{
    @Rule    
	public ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void displayError()
    {
    	collector.addError(new Throwable("This is first error to be collected"));
    	
    	try
    	{   		
    	  Assert.assertTrue("I love Algorithm".contains("Algorthm")); //checking boolean assertion
    	}
    	catch(Throwable t)
    	{
    		collector.addError(t); //incase if error occurs , it will be collected
    	}
    }
    
    @Test
    public void testMethod()
    {
    	Assert.assertEquals("Hello","Hello");
    }
    
    
}
