package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pom 
{
@Test
public void tast() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement l = driver.findElement(By.name("login"));
	l.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	l.click();
	}
}
