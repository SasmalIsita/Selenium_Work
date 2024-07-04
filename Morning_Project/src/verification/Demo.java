package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo
{
@Test
void test()
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
String t = driver.getTitle();
Assert.assertEquals(t,"Google");
System.out.println("Done");
}
}
