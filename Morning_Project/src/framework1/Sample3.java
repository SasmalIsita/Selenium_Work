package framework1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{
	@Test()
	public void g()
	{
	Reporter.log("like",true);	
	}
	@Test() 
	public void h()
	{
	Reporter.log("Sub ",true);	
	}
	@Test() 
	public void i()
	{
	Reporter.log("save the page",true);	
	}
}
