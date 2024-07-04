package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("isita_sasmal2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("daitmisasmal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Niranjan_ka_18");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Niranjan • Followed by qspiders_kolkata']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Follow']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Message...']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='xat24cr xdj266r']")).sendKeys("Hi Sir");
		Thread.sleep(2000);
		

		//driver.close();
		
		
       

}
	}
