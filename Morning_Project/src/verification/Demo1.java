package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	void test()
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String t = driver.getTitle();
	Assert.assertEquals(t,"Facebook-login or signup","title is not matching");
	Assert.assertEquals(true,driver.findElement(By.name("login")).isDisplayed(),"checking login button is Present");
	System.out.println("Done");
	}
	}
