package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import script.JUnitMessage;

public class JUnitMessageTest {

	JUnitMessage junit = new JUnitMessage(8);
	
	
//	@Test
	@Test(expected = ArithmeticException.class)
	public void testDivide()
	{
		junit.divide();
		
		assertTrue(junit.divide());
	}
	
	
	
	
}
