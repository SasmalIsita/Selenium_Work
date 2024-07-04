
package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User
{
	@Test(priority=2)
	public void A()
	{
	Reporter.log("Login",true);	
	}
	@Test(priority=1) 
	public void C()
	{
	Reporter.log("Signup",true);	
	}
	@Test(priority=3) 
	public void B()
	{
	Reporter.log("Like a page",true);	
	}
	}