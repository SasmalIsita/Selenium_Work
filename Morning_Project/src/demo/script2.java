package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2
{

		public static void main(String [] args)
		{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//String source=driver.getPageSource();
		//System.out.println(source);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}
	}


