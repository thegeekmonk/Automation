package test.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.script.JunitTest;

public class TestRunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Result result = JUnitCore.runClasses(JunitTest.class);
		
		for(Failure failure : result.getFailures())
			System.out.println("Result : "+failure.toString());
		
		System.out.println(result.wasSuccessful());
	}

}
