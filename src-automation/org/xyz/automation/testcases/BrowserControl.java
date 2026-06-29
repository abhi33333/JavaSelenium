package org.xyz.automation.testcases;

import org.openqa.selenium.By; // By class is used to locate/find web elements using locators like id, name, className, xpath, cssSelector, etc.
import org.openqa.selenium.WebDriver;   // ctrl+shift+o (import the class) // WebDriver is the main Selenium interface used to control the browser
import org.openqa.selenium.WebElement; // WebElement represents one element on the webpage, like textbox, button, link, checkbox, etc.
import org.openqa.selenium.chrome.ChromeDriver;// ChromeDriver is used to launch and control Chrome browser
import org.testng.annotations.Test;// TestNG @Test annotation is used to mark a method as a test case
import org.testng.annotations.BeforeMethod;// @BeforeMethod runs before every @Test method
import org.testng.annotations.AfterMethod;// @AfterMethod runs after every @Test method
import static org.openqa.selenium.support.locators.RelativeLocator.with; // Static import needed for Selenium 4 Relative Locator: with(...)



public class BrowserControl
{
	
WebDriver driver;
    
    @Test
    public void control_browser()
    {
        
        driver= new ChromeDriver();  //launch chrome browser
        
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        
        //driver.get("https://www.saucedemo.com/");
        
        driver.navigate().to("https://www.saucedemo.com/");
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
        driver.close();  //can close one window/tab only
        
        driver.quit();   //will close all the windows
    }
    
}