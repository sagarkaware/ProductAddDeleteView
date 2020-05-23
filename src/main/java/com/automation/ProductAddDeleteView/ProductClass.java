package com.automation.ProductAddDeleteView;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductClass {
	WebDriver driver;
	
	public ProductClass(WebDriver driver2) {
	driver=driver2;
	}

	public void product() {
		
		WebElement product=driver.findElement(By.xpath("//a[text()='Products']"));
		product.click();
	
		
		List<WebElement>col=  driver.findElements(By.xpath("//*[@id='index_table_products']/thead/tr/th"));
		
		System.out.println("No of cols are : " +col.size()); 
		
		List<WebElement>row=  driver.findElements(By.xpath("//*[@id='product_1']/td[2]"));

		System.out.println("No of rows are : " +row.size());
        
        for (int i = 1; i <= row.size(); i++) {
        	System.out.println(i);
			
        	for (int j = 1; j < col.size(); j++) {

        		String cellText = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td["+ j +"]")).getText();
        		System.out.println("i-----"+i);
        		System.out.println("j-----"+j);
        		System.out.println(cellText);
        		
        		if (cellText.equalsIgnoreCase("MOBILE")) {
					
        		WebElement view= driver.findElement(By.xpath("//table/tbody/tr/td[8]/div/a[1]"));
        		view.click();
        		break;
				}
            
				
			}
      }
		//String cellText = driver.findElement(By.xpath("//table/tbody/tr[1]/td["+ i +"]")).getText();
		
		 
		
		
	}

}
