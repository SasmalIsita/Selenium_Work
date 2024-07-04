package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDuble 
{
	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement el= driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Actions a=new Actions(driver); 
	Thread.sleep(200);
	a.moveToElement(el).build().perform();
}

}
