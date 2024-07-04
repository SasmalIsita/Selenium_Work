package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqtalk 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("8637041345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Isita@1234");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[id='search']")).sendKeys("m1");
       Thread.sleep(2000);
       driver.get("https://chat.qspiders.com/student-dashboard/QKO-JSAJVD-M1");
       Thread.sleep(2000);
    // driver.findElement(By.cssSelector("diver[id='scrollableDiv']")).click();
     // Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Niranjan");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("div[class='_chat_tickmark__SjNlz']")).click();
    	Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[name='message']")).sendKeys("Hi sir i am from selenium morning batch");
   	Thread.sleep(2000);
   driver.findElement(By.cssSelector("button[class='chatSubmitButton']")).click();
       driver.quit();
       
       
}
}
