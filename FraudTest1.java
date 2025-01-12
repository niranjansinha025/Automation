package Testing1;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FraudTest1 {
  @Test
  public void f() throws InterruptedException 
  {
	  //System.setProperty("webdriver.chrome.driver", "D:\\Automation\\September 2023 Auto\\Eclipse Project\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\STAF\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File SourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File ("path/destination");
		//FileUtils.copyfile(SourceFile,DestinationFile);
		driver.get("https://seregtracqabank.secureyes.net:8080/bank");
		//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("secureyesdev"+"\\"+"niranjan"+"."+"sinha");
		driver.findElement(By.xpath("//input[@id='userNameInput']")).sendKeys("devtest1@secureyesdev.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Dev@4321");
		driver.findElement(By.xpath("//span[@id='submitButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
		// Click on 'Fraud-Cases' menu
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Fraud-Cases')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Fraud-Cases')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Fraud Cases List')]")));
		driver.findElement(By.xpath("//td[contains(text(),'Fraud Cases List')]")).click();
		// Logout functionality
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/div/app-header/div[1]/div/div/div/div[2]/ul/li[6]/a/img")).click();
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(5000);
		driver.close();
  }
}
