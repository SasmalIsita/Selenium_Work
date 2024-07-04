package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/pc/Desktop/check.html");
	 List<WebElement> all_link = driver.findElements(By.xpath("//input"));
	int count = all_link.size();
	System.out.println(count);
	for(int i=0; i<=count-1; i++)
	{
		 all_link.get(i).click();
		 Thread.sleep(200);
	}
	for( int i = count-1; i>=0; i--)
	{
		all_link.get(i).click();
		Thread.sleep(200);
}
}
}
