package com.automation.ProductAddDeleteView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	




	@Test
	public void logIn() {
		
		WebElement userNmae= driver.findElement(By.id("admin_user_email"));
		userNmae.sendKeys("admin@example.com");
		
		WebElement pass= driver.findElement(By.id("admin_user_password"));
		pass.sendKeys("password");
		
		
		WebElement login= driver.findElement(By.name("commit"));
		login.click();
		
	}

}
