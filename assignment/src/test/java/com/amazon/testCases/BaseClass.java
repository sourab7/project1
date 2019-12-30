package com.amazon.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public String baseURL= "http://www.amazon.in";
	public String fBaseURL ="http://www.flipkart.com";
	public String iPhone = "iPhone XR 64GB yellow";
	public String title="Aplle iPhone XR 64 GB yellow";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRI\\Desktop\\Assignment_33\\assignment\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("succesfully launch");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("succesfully close");
	}

}