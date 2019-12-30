package com.amazon.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.pageObjects.Amazon_iPhone;

public class TC_iPhoneXR_001 extends BaseClass {

	@Test
	public void amazonTest() {
		
		driver.get(baseURL);
		Amazon_iPhone ip= new Amazon_iPhone(driver);
		ip.search(iPhone);
		if(driver.getTitle().equals(title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		ip.selectImage();
		ip.selectPrice();
		System.out.println("finish for now");
	}
	
}
