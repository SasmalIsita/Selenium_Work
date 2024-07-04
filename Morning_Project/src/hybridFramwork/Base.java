package hybridFramwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base implements  Base_Constants
  {
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty(Chrome_key, Chrom_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
} 

