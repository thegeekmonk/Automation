package runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.GoogleSearchTest;

public class GoogleSearchTestRunner {

	public GoogleSearchTestRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Result result = JUnitCore.runClasses(GoogleSearchTest.class);
		
		for(Failure failure : result.getFailures())
			System.out.println(failure.toString());
		
		System.out.println(result.wasSuccessful());
		
	}

}
