package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
@Test 
public void test()
{
Reporter.log("this is me",true);	
}
@Test 
public void test1()
{
Reporter.log("this is you",true);	
}
}

