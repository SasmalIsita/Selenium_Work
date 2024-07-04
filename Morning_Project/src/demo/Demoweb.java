package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoweb 
{
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
driver.findElement(By.xpath("//input[@type='']")).click();
Thread.sleep(2000);
}
	}
