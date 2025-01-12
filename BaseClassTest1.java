package Testing1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassTest1 
{
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before Class initiated...Chrome Browser will be opened...");
		System.setProperty("webdriver.chrome.driver","C:\\STAF\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Before Method initiated...URL will be entered..");
		driver.get("https://seregtracqa.secureyes.net/");
	}
	@AfterMethod
	public void closeURL()
	{
		System.out.println("After Method initiated....Close the URL ");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Close the Browser....");
		driver.quit();
	}

}
