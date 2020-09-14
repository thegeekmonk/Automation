package runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import test.JUnitMessageTest;

public class TestRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(JUnitMessageTest.class);
		
		for(Failure failure : result.getFailures())
			System.out.println();

	}

}
