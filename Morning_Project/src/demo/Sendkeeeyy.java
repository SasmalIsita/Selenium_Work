package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeeeyy
{
   public static void main(String[] args) throws InterruptedException
   {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("file:///C:/Users/pc/Desktop/facegoog.html");
	WebElement el=driver.findElement(By.name("n3"));
	Thread.sleep(2000);
	el.sendKeys("Selenium");
	
}
}

