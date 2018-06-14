package com.datadrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Naukri_Reg_Test {

	public static void main(String[] args) {
		
		Xls_Reader excelsheet=new Xls_Reader("D:\\selenium framework\\TestNg\\src\\com\\testdata\\NaukriRegPageTest.xlsx");
		
		
	        String name=excelsheet.getCellData("naukriRegpageTest", "name", 2);
	        System.out.println(name);
	        
	        String email=excelsheet.getCellData("naukriRegpageTest", "emailaddress", 2);
	        System.out.println(email);
	        
	        String createpasword=excelsheet.getCellData("naukriRegpageTest", "createpassword", 2);
	        System.out.println(createpasword);
	        
	        String mobileno=excelsheet.getCellData("naukriRegpageTest", "mobileno", 2);
	        System.out.println(mobileno);
	        
	        String totalexp=excelsheet.getCellData("naukriRegpageTest", "totalexperience", 2);
	        System.out.println(totalexp);
	        
	        String month=excelsheet.getCellData("naukriRegpageTest", "month", 2);
	        System.out.println(month);
	        System.setProperty("webdriver.chrome.driver","D:\\bhagyashree\\chromedriver\\chromedriver.exe"); 
			WebDriver driver=new ChromeDriver();
			driver.get("https://my.naukri.com/account/register/basicdetails");
			driver.findElement(By.xpath("//button[@title='I am a Professional']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(name);
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.xpath("//input[contains(@placeholder,'Minimum 6 characters')]")).sendKeys(createpasword);
			driver.findElement(By.xpath("//input[@placeholder='Where recruiter can contact you']")).sendKeys(mobileno);
			
	      
	        
	}
}
