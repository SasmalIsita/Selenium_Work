package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyFirefox 
{
	public static void main(String [] args)
	{
	String key="webdriver.gecko.driver";
	String value="./Software/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver=new FirefoxDriver();
driver.close();
	}
}
