package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swipping
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	driver.get("file:///C:/Users/pc/Desktop/swip.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.name("n1"));
	ele.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	ele.sendKeys("Api");
	Thread.sleep(2000);
	WebElement ele3=driver.findElement(By.name("n3"));
	ele3.sendKeys("selenium");
	WebElement ele2=driver.findElement(By.name("n2"));
	ele2.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	Thread.sleep(2000);
	ele2.sendKeys("Selenium");
	Thread.sleep(2000);
	ele3.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	driver.quit();		}
}
