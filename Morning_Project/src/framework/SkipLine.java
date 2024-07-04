package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipLine
{
	@Test(enabled=false)
	public void A()
	{
	Reporter.log("Login",true);	
	}
	@Test() 
	public void C()
	{
	Reporter.log("Signup",true);	
	}
	@Test() 
	public void B()
	{
	Reporter.log("Like a page",true);	
	}
}
