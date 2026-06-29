package org.web.autopractice2.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserOperations {
	
WebDriver driver; //global variable
/*
 *  WebDriver → interface (blueprint)  -car
 *  driver → reference variable/object name   -car key/handle
 *  new ChromeDriver() → actual Chrome browser object      -actual car
 */


/*
 * Easy memory:
 * get() → opens URL
 * navigate() → moves around
 * manage() → controls browser settings
 * close() → closes one tab
 * quit() → closes all tabs
 */
    
    @Test
    public void control_browser1()
    {
        //for incognito
    	ChromeOptions co =new ChromeOptions();
    	co.addArguments("--incognito");
    	
        driver= new ChromeDriver(co);  //launch chrome browser
        
        //Get
        driver.get("https://www.google.com/"); //open URL
     // Print URL
                 System.out.println("Current URL: " + driver.getCurrentUrl());//Get Current URL
                 System.out.println("        Page Title: " + driver.getTitle());//Get Page Title
                 // System.out.println("Page source: " + driver.getPageSource());//Get Page Source
                 System.out.println("        Get Window ID: " + driver.getWindowHandle());//Get Window ID
        // driver.getWindowHandles(); //Get All Window IDs
        
        //Manage
       // driver.manage().window().minimize();//Minimize window
       // driver.manage().window().fullscreen(); //Full Screen
        driver.manage().window().maximize(); //maximize the browser
       //  driver.manage().deleteAllCookies();//Delete Cookies
       //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Set Implicit Wait
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//Page Load Timeout
        
        
        //Navigate
        driver.navigate().to("https://www.saucedemo.com/"); //navigate to different URL
        // Print URL
                System.out.println("Current URL: " + driver.getCurrentUrl());//Get Current URL
                System.out.println("        Page Title: " + driver.getTitle());//Get Page Title
                System.out.println("        Get Window ID: " + driver.getWindowHandle());//Get Window ID
        driver.navigate().back(); // navigate back to google
        // Print URL
                System.out.println("Current URL: " + driver.getCurrentUrl());//Get Current URL
        driver.navigate().forward(); //navigate forward to saucedemo
        // Print URL
                System.out.println("Current URL: " + driver.getCurrentUrl());//Get Current URL
        driver.navigate().refresh();// Refresh Page
        
       
        driver.close(); //Close Current Browser
        // driver.quit();   //Close All Browsers
    }

}