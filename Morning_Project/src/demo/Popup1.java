package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("das");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.dismiss();
		String t = al.getText();
		System.out.println(t);
		
}
}
