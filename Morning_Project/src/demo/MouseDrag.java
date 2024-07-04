package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag
{
	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
	WebElement el= driver.findElement(By.xpath("//[.='']"));
	Actions a=new Actions(driver); 
	Thread.sleep(200);
	a.moveToElement(el).build().perform();
}
}
