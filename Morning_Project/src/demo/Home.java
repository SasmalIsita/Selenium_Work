package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 
{
	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/form1.html");
		WebElement el=driver.findElement(By.name("n1"));
		Thread.sleep(2000);
		el.sendKeys("Shinchan");
		WebElement el1=driver.findElement(By.name("n2"));
		Thread.sleep(2000);
		el1.sendKeys("12345");
		Thread.sleep(2000);
		WebElement el3=driver.findElement(By.name("n3"));
		Thread.sleep(2000);
		el3.sendKeys("Kolkata");
		driver.findElement(By.id("a4")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("a5")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("c4")).click();
		driver.quit();
}
}
