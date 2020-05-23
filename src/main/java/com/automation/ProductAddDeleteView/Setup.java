package com.automation.ProductAddDeleteView;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {
	
	
	 WebDriver driver;
	
	

	@BeforeTest
	public void setupBrowser() {
				
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://anant-kanwale.herokuapp.com/admin");
		
	}
	

	  @AfterTest
	  public void browserClose() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		driver.quit();
		
		


	}
	

}
