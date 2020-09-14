package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import script.JUnitMessage;

public class JUnitMessageTest {

	JUnitMessage junit = new JUnitMessage(8);
	
	
//	@Test(expected = ArithmeticException.class)
	@Test
	public void testDivide()
	{
		junit.divide();
		
		assertTrue(junit.divide());
	}
	
	
	
	
}
