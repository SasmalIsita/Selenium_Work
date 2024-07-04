package ChildBrowser;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
	private static final String Theard = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();

		driver.findElement(By.xpath("//input[@VALUE='Add to cart')]")).click();
		
		//TakesScreenshot t=(TakesScreenshot)driver; 
		//File src=t.getScreenshotAs(Output.FILE);
		
		
}
	}
