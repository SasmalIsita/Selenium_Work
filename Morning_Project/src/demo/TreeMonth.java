package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeMonth
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[.='Create new account']")).click();
Thread.sleep(2000);

	WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
	Select s = new Select(month);
	List<WebElement> c = s.getOptions();
	ArrayList<String> l = new ArrayList<>();
	for(WebElement opt:c)
	{
	String text = opt.getText();
	l.add(text);
	}
TreeSet<String> t = new TreeSet<>(l);
for(String t1:t)
{
	System.out.println(t1);
	}
}
	}
