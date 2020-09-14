package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import script.JUnitMessage;

public class JUnitMessageTest 
{
    String message = "Hello";
	
	private JUnitMessage junitMsg = new JUnitMessage(message);
	
	@Test
	public void testPrintMessage()
	{
		System.out.println("Inside Printing Message");
		
		assertEquals(message,junitMsg.printMessage());
	}
	
	
}
