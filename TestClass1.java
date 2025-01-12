package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\September 2023 Auto\\Eclipse Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("https://seregtracqabank.secureyes.net:8080/bank");
		//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("secureyesdev"+"\\"+"niranjan"+"."+"sinha");
		driver.findElement(By.xpath("//input[@id='userNameInput']")).sendKeys("devtest1@secureyesdev.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Dev@4321");
		driver.findElement(By.xpath("//span[@id='submitButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[12]/a")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		//driver.close();


	}

}
