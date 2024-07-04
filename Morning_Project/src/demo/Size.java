package demo;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size 
{

	   public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com");
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
		  Dimension d=new Dimension(500, 300);
		  Thread.sleep(2000);
		  driver.manage().window().setSize(d);
		  Thread.sleep(2000);
		Point p = new Point(400, 200);
		driver.manage().window().setPosition(p);
		driver.quit(); 
}
	   }
