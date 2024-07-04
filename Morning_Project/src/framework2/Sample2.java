package framework2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test()
	public void D()
	{
	Reporter.log("Comment",true);	
	}
	@Test() 
	public void E()
	{
	Reporter.log("Share",true);	
	}
	@Test() 
	public void F()
	{
	Reporter.log("Message",true);	
	}

}
