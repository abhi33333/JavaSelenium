package org.xyz.automation.testcases;

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

public class HandleKeyboardMouse
{
	 WebDriver driver;
	 
	@Test(enabled=true)
	public void handleMouse() throws Exception
	{
            // Launch edge browser
        driver = new EdgeDriver();
        driver.get("https://www.mphasis.com/home.html");
	    driver.manage().window().maximize();

	    Actions act = new Actions(driver);
	   // act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	 
	         act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
	    /*     act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
	         System.out.println(driver.getTitle());
	         
	     */  

	 //click on Healthcare link - open in new tab
	    act.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[normalize-space()='HealthCare']/ancestor::a"))).keyUp(Keys.COMMAND).perform();
	    
	    
	    Set<String> windowsId= driver.getWindowHandles();
	    System.out.println(windowsId);
	    
	    Iterator<String> itr = windowsId.iterator(); //itr is pointing to no window	   
	             String homepage = itr.next(); //itr.next() pointing to homepage 
	             String healthCare = itr.next(); //itr.next() pointing to healthCare
	    
	    driver.switchTo().window(healthCare);
	    System.out.println("HealthCare page's Title is " + driver.getTitle());
	    Thread.sleep(Duration.ofSeconds(2));
	    driver.switchTo().window(homepage);
	    System.out.println("Homepage's Title is " + driver.getTitle());

	}
	
    @Test(enabled=false)
    public void handleKeyboard()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

         act.sendKeys(Keys.PAGE_DOWN).perform();
         act.sendKeys("john20").perform();
         //act.sendKeys(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform(); //to delete
         act.sendKeys(Keys.TAB).perform();        
         act.sendKeys("john1234").perform();
         act.sendKeys(Keys.ENTER).perform();
    }
}