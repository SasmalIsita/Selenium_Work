package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement 
{

	private static char[] href;

	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	 List<WebElement> all_link = driver.findElements(By.xpath("//a"));
	int count=all_link.size();
	System.out.println(count);
	//for(int i=0;i<=count-1;i++)
	//{
	//WebElement link = all_link.get(i);
	//String href=link.getAttribute("href");
	//System.out.println(href);
	//}
	//for(int i=0;i<=count-1;i++)
		//{
		//WebElement link = all_link.get(i);
		//String text = link.getText();
		//System.out.println(text);
		//}
	for(WebElement link:all_link)
	{
		String text=link.getText();
		System.out.println(text);
	}
}
	}
