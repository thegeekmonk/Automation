package test.script;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest 
{
    private String str = "I am using Junit4";

	
	@Test
	public void testing()
	{
		assertEquals("I am using Junit4",str);
	}	

}
