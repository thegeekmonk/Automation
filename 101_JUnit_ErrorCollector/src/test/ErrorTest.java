package test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorTest 
{
    @Rule    
	ErrorCollector collector = new ErrorCollector();
    
    @Test
    public void displayError()
    {
    	collector.addError(new Throwable("This is first error to be collected"));
    	
    	Assert.assertTrue("I love Algorithm".contains("Algotithm"));
    }
    
    
}
