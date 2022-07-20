package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import browser.Browser;

public class page1 extends Browser {
	public static void enterUserName(String user)
	{
		driver.findElement(By.id("user-name")).sendKeys(user);
	}
	public static void enterPassward(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public static void clickLogin()
	{
		driver.findElement(By.id("login-button")).click();
	}
	public static void navigateTheproduct() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", " ");
		Thread.sleep(1000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,-350)", " ");
		Thread.sleep(1000);
	}
	

}
