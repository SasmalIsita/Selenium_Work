package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert
{
	@Test
	void test()
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String t = driver.getTitle();
	SoftAssert s = new SoftAssert();
	s.assertEquals(t,"google");
	System.out.println("Done");
	//s.assertEquals(t,"Facebook – log in or sign up");//for pass the test case
	s.assertEquals(t,"facebook");
	System.out.println("Done2");
	s.assertAll();
	
}
}