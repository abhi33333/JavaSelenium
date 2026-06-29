package org.xyz.automation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebElementsList
{

	@Test
    public void productlist()
    {
        
  
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--incognito");

    	WebDriver driver = new ChromeDriver(co);
    

        // Open Application
        driver.get("https://www.saucedemo.com/inventory.html");

        // Maximize Window
        driver.manage().window().maximize();

        // Enter Username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Enter Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // Click Login Button
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        
        List<WebElement> productlist =  driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
        System.out.println(productlist.size());
        productlist.get(1).click();
        
        
    }
}