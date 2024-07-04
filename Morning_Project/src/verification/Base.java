package verification;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base
{
	@BeforeSuite
	public void open()
	{
	System.out.println("Before Suite Execution");	
	}
	@BeforeTest
	public void open1()
	{
	System.out.println("Before Test Execution");	
	}
	@BeforeClass
	public void open2()
	{
	System.out.println("Before Class Execution");	
	}
@BeforeMethod
public void open_app()
{
System.out.println("Before Method Execution");	
}

@Test
public void test1()
{
	System.out.println("testannotation executed..");
}
@AfterMethod
public void close_app() 
{
	System.out.println("After Method Execution");
}
@AfterClass
public void open2a()
{
System.out.println("After Class Execution");	
}
@AfterTest
public void open1a()
{
System.out.println("After Test Execution");	
}
@AfterSuite
public void opena()
{
System.out.println("After Suite Execution");	
}
}
