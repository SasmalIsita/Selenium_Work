package demo;

import javax.print.attribute.standard.PrinterLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{

	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
	WebElement el= driver.findElement(By.xpath("//span[@dir='auto']"));
	Point loc = el.getLocation();
	System.out.println(loc);
	int x=loc.getX();
	System.out.println(x);
	
	int y=loc.getY();
	System.out.println(y);
	   }
}
