package Testing1;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Interview1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void BeforeClassMethod() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\STAF\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Before Class - Chrome browser initialization : ");
	}
	
	@BeforeMethod
	public void BeforeFISMethod() throws InterruptedException 
	{
		System.out.println("Before method - Enter URL 'https://www.ebay.com/' ");
		driver.get("https://www.ebay.com/");
	}
  @Test
  public void FIS() throws InterruptedException, AWTException 
  {

		//driver.get("https://www.ebay.com/");
       Thread.sleep(1000);
       String Search_Text = "Indian Culture";
       WebElement Search_Text_Element = driver.findElement(By.xpath("//input[@type='text']"));
       Search_Text_Element.sendKeys(Search_Text);
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Thread.sleep(1000);
//       List<WebElement> List_of_Search_items = driver.findElements(By.xpath("//a/div/img"));
//       System.out.println("Total Number of Searched items - " + List_of_Search_items.size());
//       List_of_Search_items.get(0).click();
//     String toGetNameOf1stItems = List_of_Search_items.get(0).getText();
//     System.out.println("To get name of 1st item -> " + toGetNameOf1stItems);
       
       // To click on Search item, Search item is opened in next tabs
       driver.findElement(By.xpath("//span[contains(text(),'Handmade Wedding Indian Culture Dress')]")).click();
       Thread.sleep(1000);
       // Swicth tabs, perform Add to cart operation and then switch back to original tab.
       ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
       // Click on "Add to Cart" for Search item
       driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
       Thread.sleep(2000);
       driver.close();
       driver.switchTo().window(tabs.get(0));
       Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
       // Verify the cart has been updated and displays the number of items in the cart  
      WebElement Card_element = driver.findElement(By.xpath("//i[contains(text(),'1')]"));
      System.out.println("To get the value of Cart -> " + Card_element.getText());
      SoftAssert verify = new SoftAssert();     
      verify.assertEquals(1, Card_element.getText());
      System.out.println("Actual and expected value is matching");
//		Actions action1 = new Actions(driver);
//		WebElement Input_Slider_Control = driver.findElement(By.xpath("//input[@id='mySlider']"));
//		Robot robot = new Robot();
//		robot.mousePress(1);
		//robot.
//		WebElement Input_Slider_Control_Source = driver.findElement(By.xpath("//label[contains(text(),'Progress Bar: ')]"));
//		String Test1 = Input_Slider_Control_Source.getText();
//		System.out.println(Test1);
		//Thread.sleep(5000);
		//action1.moveToElement(Input_Slider_Control).click().perform();
		//Thread.sleep(5000);
		//WebElement Input_Slider_Control_Target = driver.findElement(By.xpath("//label[contains(text(),'Progress Bar: (50%)')]"));
		//action1.clickAndHold(Input_Slider_Control).moveToElement(Input_Slider_Control).build().perform();
//		while(Test1=="Progress Bar: (90%)")
//		{
//		action1.clickAndHold(Input_Slider_Control).moveToElement(Input_Slider_Control).release().perform();
//		Thread.sleep(1000);
//		Test1 = Input_Slider_Control_Target.getText();
//		System.out.println(Test1);
//		}
		//action1.dragAndDrop(Input_Slider_Control_Source, Input_Slider_Control_Target).perform();
		
  }
  
  @AfterMethod 
	public void AfterFISMethod() throws InterruptedException 
	{
	  System.out.println("After Method");
	}
  @AfterClass
	public void AfterClassMethod() throws InterruptedException 
	{
	  System.out.println("After Class");
	  Thread.sleep(5000);
		driver.close();
	}
}

