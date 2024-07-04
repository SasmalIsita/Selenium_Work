package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumRobotRight
{
	public static void main(String[] args) throws InterruptedException, AWTException
	   {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Actions a=new Actions(driver); 
		Robot r = new Robot();
	for(int i=1;i<=5;i++)
	{
		WebElement el= driver.findElement(By.xpath("//a[@class='nav-link']"));
		a.moveToElement(el).build().perform();
		a.contextClick().build().perform();
		Thread.sleep(200);
		
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);

	Thread.sleep(200);
	}
}
	}
