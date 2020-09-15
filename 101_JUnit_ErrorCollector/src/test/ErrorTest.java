package test;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

public class ErrorTest 
{
    @Rule    
	ErrorCollector collector = new ErrorCollector();
}
