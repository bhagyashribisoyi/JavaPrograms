package com.testng2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpiceJet {
	WebDriver driver;
	@BeforeMethod
	  public void setUP() {
		  System.setProperty("webdriver.chrome.driver", "D:\\bhagyashree\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://www.spicejet.com/");
	  }
	@Test
	public void Spicejet_Hotel(){
		driver.findElement(By.xpath("//*[@id='buttons']/div/div/ul/li[2]/a/span[2]")).click();
		Wait<WebDriver> wt=new WebDriverWait(driver, 30);
		  wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ctl00_mainContent_txtOriginStation1_MST']")));
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys("Hyderabad");
	}
}
