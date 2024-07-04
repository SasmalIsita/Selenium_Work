package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency 
{
	@Test()
	public void A()
	{
	Reporter.log("Login",true);	
	}
	@Test(dependsOnMethods = "A") 
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
