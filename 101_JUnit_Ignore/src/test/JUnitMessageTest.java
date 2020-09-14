package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import script.JUnitMessage;

public class JUnitMessageTest 
{
    String message = "Akhilesh";
	
	private JUnitMessage junitMsg = new JUnitMessage(message);
	
	@Test
	public void testPrintMessage()
	{
		System.out.println("Inside Printing Message");		
		assertEquals(message,junitMsg.printMessage());
	}
	
	@Test
	public void testPrintHiMessage()
	{   
		message = "Hi "+message;
		System.out.println("Inside Printing Hi Message");
		assertEquals(message,junitMsg.printHiMessage());
	}	
	
}
