package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrengeDemo1
{

	WebDriver driver;
	@Test
	public void test()
	{
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		System.setProperty(key, value);
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Assert.assertEquals(true,driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed(),"checking the logo is present");
	System.out.println("done");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[.='Add Employee']")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Selenium");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Api");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//a[.='Employee List']")).click();	
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	}
	
	//@Test(dependsOnMethods = "test")
	//public void test1()
	//{
	
		//Assert.assertEquals(true,driver.findElement(By.xpath("//div[@class='oxd-brand-banner']")).isDisplayed(),"checking");
		//System.out.println("done");
		//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();	
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//}
	}
