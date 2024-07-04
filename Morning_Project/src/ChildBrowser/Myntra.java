package ChildBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	
	//driver.findElement(By.xpath("//a[@class='desktop-main']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("HRX Shose");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
	driver.findElement(By.xpath("//span[class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();

}
	}
