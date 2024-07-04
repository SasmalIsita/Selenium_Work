package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form
{
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("file:///C:/Users/pc/Desktop/form1.html");
	String Source=driver.getPageSource();
	System.out.println(Source);
	//String title=driver.getTitle();
	//System.out.println(title);
	//String url=driver.getCurrentUrl();
	//System.out.println(url);
	driver.close();
	}
}
