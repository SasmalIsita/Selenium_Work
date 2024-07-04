package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerPOM1
{
@Test
void test() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
POM1 p = new POM1(driver);
p.login().click();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
p.login().click();

}
}