package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pc/Desktop/Singledp.html");
		 WebElement d = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s=new Select(d);
	boolean dis = s.isMultiple();	 
	if(dis)
	{
		System.out.println("Multiple");
	}
	else
	{
		System.out.println("Single");
	}
	}
}

