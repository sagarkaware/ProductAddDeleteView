package com.automation.ProductAddDeleteView;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest extends Setup{
	
	
	
	public NewTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*@BeforeTest
	public void setupBrowser() {
				
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://anant-kanwale.herokuapp.com/admin");
		
	}	*/
	
	
  @Test(priority=1)
  public void loginTest() {
	 
	
	  Login lg=new Login(driver);
	  
	  lg.logIn();
	  
  }
  
  @Test(priority=2)
  public void productSelect() {
	 
	
	ProductClass product=new ProductClass(driver);
	product.product();
	  
  }
  
}
