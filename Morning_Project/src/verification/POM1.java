package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class POM1 
{
@FindBy(name="login")
private WebElement login;
public POM1(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
public WebElement login()
{
	//public void login()
//login.click();
	return login();
}
}
