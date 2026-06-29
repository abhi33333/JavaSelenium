package org.xyz.automation.testcases;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertsWInFrames {
	
		 WebDriver driver;	 
		 
		     @Test(enabled=true)
			public void handleFrames() throws Exception
			{
		       // Launch edge browser
		        driver = new EdgeDriver();
		        driver.get("https://demoqa.com/frames");
			    driver.manage().window().maximize();
			    
			    
			    String actualText = driver.findElement(By.xpath("//h1[text() ='Frames']")).getText();
	            System.out.println("Fetched Text on regular area is: " + actualText);
	                Assert.assertEquals(actualText, "Frames");
	            	System.out.println("Assertion Passed for regular area");
	            
			    //switch to frame area
	            driver.switchTo().frame("frame1"); //from the view frame source
	              
	            String actualText1 = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
                System.out.println("Fetched Text on the frame area: " + actualText1);
	            	Assert.assertEquals(actualText1, "This is a sample page");
	            	System.out.println("Assertion Passed for frame area");
	            
	            driver.switchTo().defaultContent(); //go back to default content out of the frame
	            Assert.assertEquals(actualText, "Frames");
            	System.out.println("Assertion Passed for successfully navigating back to regular area");
	            
	           CaptureScreenshot.testresult(driver, "handleFrame");
			} 
		 
		@Test(enabled=false)
		public void handleAlert() throws Exception
		{
	       // Launch edge browser
	        driver = new EdgeDriver();
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    driver.manage().window().maximize();
            driver.findElement(By.className("signin-btn")).click();
            
            driver.switchTo().alert().accept();
          CaptureScreenshot.testresult(driver, "handleAlert");
		    
		}
		

}
