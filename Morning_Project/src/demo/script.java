package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script
{
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	
}
}
