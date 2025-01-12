package Testing1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Interview2 
{
	//WebDriver driver ;
  @Test (enabled = true , dependsOnMethods = { "PriorityTwoTC" })
  public void loginFunctionality() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  //System.setProperty("webdriver.chrome.driver", "C:\\SATF\\drivers\\chromedriver.exe");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//	  //driver.get("https://seregtracqa.secureyes.net");
//	  driver.navigate().to("https://seregtracqa.secureyes.net");
//	  Thread.sleep(2000);
//	  driver.navigate().back();
//	  System.out.println("To print the title of the page : "+driver.getTitle());
//	  System.out.println("To print the current URL for the page : "+driver.getCurrentUrl());
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
//	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("UserName")));    //driver.findElement(By.id("UserName"))));
//	  driver.findElement(By.id("UserName")).sendKeys("niranjan.sinha@secureyesdev.com");
//	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
//	  driver.findElement(By.id("password")).sendKeys("Prakat@123");
//	  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//	  Thread.sleep(2000);
//	  driver.close();
	  System.out.println("This Test Case has no priority because there is no Priority defined");
  }
  @Test(priority=2, enabled = true)
  public static void PriorityTwoTC()
  {
  System.out.println("PriorityTwoTC - This is the Test Case number Two because of Priority #2 - Start");
	  String S1 = "Niranjan";
	  String S2 = "Sinha";
	  Assert.assertEquals(S1, S2, "S1 & S2 Strings are not equal"); // Hard Assertion, Stops the execution after fail
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(S1, S2, "S1 & S2 Strings are not equal"); // Soft Assertion, Continue the execution after fail
	  System.out.println("This is a pass/fail condition, Skipping Soft Assertion condition : ");
	  System.out.println("PriorityTwoTC - This is the Test Case number Two because of Priority #2 - End");
//	  if(Assert.assertEquals(S1, S2))
//			  {
//		  
//			  }
  }
   
  @Test(priority=1, enabled = true)
  public static void PriorityOneTC()
  {
  System.out.println("PriorityOneTC - This is the Test Case number One because of Priority #1");
  }
   
  @Test (enabled = true)
  public static void NoPriorityTC1()
  {
  System.out.println("NoPriorityTC1 - This Test Case has no priority because there is no Priority defined");
  }
  @BeforeMethod 
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
