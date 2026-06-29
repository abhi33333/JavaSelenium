package org.xyz.automation.testcases;

import org.openqa.selenium.By; // By class is used to locate/find web elements using locators like id, name, className, xpath, cssSelector, etc.
import org.openqa.selenium.WebDriver;   // ctrl+shift+o (import the class) // WebDriver is the main Selenium interface used to control the browser
import org.openqa.selenium.WebElement; // WebElement represents one element on the webpage, like textbox, button, link, checkbox, etc.
import org.openqa.selenium.chrome.ChromeDriver;// ChromeDriver is used to launch and control Chrome browser
import org.testng.annotations.Test;// TestNG @Test annotation is used to mark a method as a test case
import org.testng.annotations.BeforeMethod;// @BeforeMethod runs before every @Test method
import org.testng.annotations.AfterMethod;// @AfterMethod runs after every @Test method
import static org.openqa.selenium.support.locators.RelativeLocator.with; // Static import needed for Selenium 4 Relative Locator: with(...)
import java.time.Duration;
import java.time.Duration;

import java.time.Duration;




public class HandleCalendar
{
	 WebDriver driver;
	  
	@Test(enabled=false)
	    public void calender_textbox()
	    {
	        driver = new ChromeDriver();   //launch chrome browser

	        driver.manage().window().maximize();

	        driver.get("https://practice-automation.com/calendars/");

	        driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2000-05-10");

	        driver.findElement(By.cssSelector("[aria-label='Wed May 10 2000Use the space key to select the date.']")).click();
	    }
	
	@Test
    public void calender_icon() throws Exception
    {
        driver = new ChromeDriver();   //launch chrome browser

        driver.manage().window().maximize();

        driver.get("https://www.agoda.com/");
        Thread.sleep(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();

        driver.findElement(By.cssSelector("[aria-label='Sat Jul 04 2026']")).click();
        Thread.sleep(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("[aria-label='Sun Jul 05 2026']")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }
		
	
	}