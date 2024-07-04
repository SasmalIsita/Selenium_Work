package framework2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1
{
	@Test()
	public void A()
	{
	Reporter.log("Signup",true);	
	}
	@Test() 
	public void B()
	{
	Reporter.log("Login",true);	
	}
	@Test() 
	public void C()
	{
	Reporter.log("Like a page",true);	
	}
}
