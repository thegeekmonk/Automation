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
    		
    	Assert.assertTrue("I love Algorithm".contains("Algorthm"));
    	}
    	catch(Throwable t)
    	{
    		collector.addError(t);
    	}
    }
    
    @Test
    public void testMethod()
    {
    	Assert.assertEquals("Hello","Hello");
    }
    
    
}
