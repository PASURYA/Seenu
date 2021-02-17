package org.mpn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Plant {
	
	@Test(dataProvider = "data",dataProviderClass = Sample.class)
	private void test1(String s, String s1) {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys(s);
	  driver.findElement(By.id("pass")).sendKeys(s1);
	  
	}
 

}




