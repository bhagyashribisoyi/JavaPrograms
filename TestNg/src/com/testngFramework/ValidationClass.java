package com.testngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidationClass {
	WebDriver driver;
	@BeforeMethod
	  public void setUP() {
		  System.setProperty("webdriver.chrome.driver", "D:\\bhagyashree\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.google.com/");
	  }
	@Test(priority=1)
	  public void titleTest(){
		 String title= driver.getTitle();
		 Assert.assertEquals(title, "Google","title is not matched");
	  }
	@Test(priority=2)
	  public void verifylinkTest(){
	  Wait<WebDriver> wt=new WebDriverWait(driver, 30);
	  wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
	   boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	   Assert.assertTrue(b, "link is not present");
	  }
	@AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }

}
