package org.web.autopractice2.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementsPractice {
	
	WebDriver driver; //global variable

	    
	    @BeforeMethod
	    public void launchBrowser()
	    {
	    	 //for incognito
	    	ChromeOptions co =new ChromeOptions();
	    	co.addArguments("--incognito");
	    	
	        driver= new ChromeDriver(co);  //launch chrome browser
	        driver.get("https://the-internet-5chk.onrender.com/"); //open URL
	        driver.manage().window().maximize(); //maximize the browser	    	
	        }
	    
	    @AfterMethod
	    public void closeBrowser() {
	        driver.close();
	    }

	    @Test(enabled=true)
	    public void textFieldOperations() throws Exception {
	    	
	    	/*
	    	 * Direct one-line examples
	    	 * 
	    	 * Type text
	    	 * driver.findElement(By.id("user-name")).sendKeys("admin");
	    	 * 
	    	 * Clear text
	    	 * driver.findElement(By.id("user-name")).clear();
	    	 * 
	    	 * Read typed text
	    	 * System.out.println(driver.findElement(By.id("user-name")).getAttribute("value"));
	    	 * 
	    	 * Check enabled
	    	 * System.out.println(driver.findElement(By.id("user-name")).isEnabled());
	    	 * 
	    	 * Easy memory:
	    	 * 
	    	 * sendKeys() → type
	    	 * clear() → erase
	    	 * getAttribute("value") → read text
	    	 * click() → focus
	    	 * isDisplayed() → visible
	    	 * isEnabled() → usable
	    	 * */
	    	
	    	
	    	WebElement inputLink = driver.findElement(By.xpath("//a[@href='/inputs']"));
	   
	    	//Click inside Text Field
	    	inputLink.click();
	    	
	    	
	    	////Find Text Field 
	    	WebElement textFieldnum = driver.findElement(By.xpath("//input[@type='number']"));
	    	//Enter Text
	    	textFieldnum.sendKeys("400");
	    	
	    	//Get Entered Value
	    	System.out.println(textFieldnum.getAttribute("value"));
	    	
	    	//Check if Displayed
	    	System.out.println(textFieldnum.isDisplayed());
	    
	    	//Clear Text
	    	textFieldnum.clear();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	

	  
	    	/*
	    	//Check if Enabled
	    	textFieldnum.isEnabled();

	    	//Get Placeholder Text
	    	textFieldnum.getAttribute("placeholder");

	    	//Get Size
	    	textFieldnum.getSize();

	    	//Get Location
	    	textFieldnum.getLocation();

	    	//Click inside Text Field
	    	textFieldnum.click();
	    	
	    	*/
	    	
	    }
	    
}
