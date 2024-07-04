package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SamelineMultiple
{
	@Test(invocationCount = 2)
	public void A()
	{
	Reporter.log("Login",true);	
	}
	@Test(invocationCount = 5) 
	public void C()
	{
	Reporter.log("Signup",true);	
	}
	@Test(invocationCount = 3) 
	public void B()
	{
	Reporter.log("Like a page",true);	
	}
	}
