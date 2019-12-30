package com.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Amazon_iPhone {
    WebDriver driver;
    
    WebElement amazon_search= driver.findElement(By.xpath("//input[@type=\"text\"]"));
    	
    public Amazon_iPhone(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public void search(String srch) {
    	amazon_search.sendKeys("srch");
    }
    
    public void selectImage() {
    	
    	WebElement image=driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']"));
    	image.click();
    }
    public void selectPrice() {
    	
    	WebElement price=driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
    	String cost=price.getText();
    	System.out.println(cost);
    }
}
