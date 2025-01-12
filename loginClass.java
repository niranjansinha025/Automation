package Testing1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginClass extends BaseClassTest1{
	
 @Test (priority=1)
public void login() throws InterruptedException
{
	  System.out.println("Login to application");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  //driver.manage().timeouts().implicitlyWait(TimeUnits, Duration.ofSeconds(10000));
	  //driver.manage().timeouts()
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5000));
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("UserName")));
	  driver.findElement(By.id("UserName")).sendKeys("niranjan.sinha@secureyesdev.com");
	  //wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("UserName")));
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	  driver.findElement(By.id("password")).sendKeys("Prakat@123");
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Login')]")));
	  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	  Thread.sleep(6000);
	  WebElement element1 = driver.findElement(By.xpath("//a[@title='Niranjan SinhaDM']"));
	  wait1.until(ExpectedConditions.visibilityOf(element1));
	  //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Niranjan SinhaDM']")));
	  driver.findElement(By.xpath("//a[@title='Niranjan SinhaDM']")).click();
	  //Thread.sleep(5000);
	  //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Yes']")));
	  //driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	  List<WebElement> list_of_elements = driver.findElements(By.xpath("//button[contains(text(),'Yes') and @data-dismiss='modal']"));
	  int Total_elements = list_of_elements.size();
	  System.out.println("Total elements available : " +Total_elements);
	  wait1.until(ExpectedConditions.visibilityOf(list_of_elements.get(0)));  //visibilityOfElementLocatedBy(elements1.get(0));
	  list_of_elements.get(0).click();
	  Thread.sleep(6000);
//	  for(int i=0;i<Total_elements;i++)
//	  {
//		  driver.findElement(By.xpath(""))
//		  elements1.get(i).click();
//	  }
}
}
