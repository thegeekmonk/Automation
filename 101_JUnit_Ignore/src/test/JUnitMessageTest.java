package test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import script.JUnitMessage;

//@Ignore
public class JUnitMessageTest 
{
    String message = "Akhilesh";
	
	private JUnitMessage junitMsg = new JUnitMessage(message);
	
	@Ignore
	@Test
	public void testPrintMessage()
	{
		System.out.println("Inside Printing Message");		
		assertEquals(message,junitMsg.printMessage());
	}
	
	@Ignore("Testing @Ignore Annotation")
	@Test
	public void testPrintHiMessage()
	{   
		message = "Hi "+message;
		System.out.println("Inside Printing Hi Message");
		assertEquals(message,junitMsg.printHiMessage());
	}	
	
}
