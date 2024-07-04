package ChildBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBlog 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	 List<WebElement> all = driver.findElements(By.xpath("//a[@class='nav-link']"));
	 int size=all.size();
	 System.out.println(size);
	 Thread.sleep(2000);
	 for(int i=0; i<=size-1; i++)
	 {
		 WebElement link = all.get(i);
		 Actions act=new Actions(driver);
		 act.contextClick(link).build().perform();
		 Thread.sleep(2000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
	 }
	 Set<String> al_wd = driver.getWindowHandles();
	ArrayList<String> l=new ArrayList<>(al_wd);
	String c_id=l.get(3);
	driver.switchTo().window(c_id);
	WebElement ele = driver.findElement(By.xpath("//h1[@class='d-1']"));
	System.out.println(ele.getText());
}
}