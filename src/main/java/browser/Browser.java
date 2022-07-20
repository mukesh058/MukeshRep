package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void openBrowser()
	{
		try {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void openUrl(String url)
	{
		try{
			driver.get(url);
			//Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		}
		catch (Exception e) {
			System.out.println(e);
		}	
	}
	public static String getTitle()
	{
		String obj=driver.getTitle();
	    return obj;
	}
	public static void browserClose()
	{
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
}
