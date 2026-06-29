package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mapDemo 
{

	public static void mapdemo()
	{
		
		// --- Declaration ---
		Map<String, String> testData = new HashMap<>();

		// --- Add key-value pairs ---
		testData.put("username", "admin");
		testData.put("password", "admin@123");
		testData.put("email", "admin@test.com");

		// --- Access by key ---
		System.out.println(testData.get("username")); // admin

		// --- Check key/value existence ---
		System.out.println(testData.containsKey("email"));    // true
		System.out.println(testData.containsValue("admin"));  // true

		/*
		// --- Iterate ---
		for (Map.Entry<String, String> entry : testData.entrySet()) {
		    System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		*/

		// LinkedHashMap — maintains insertion order
		Map<String, String> orderedMap = new LinkedHashMap<>();
		
		//Where to use in Selenium:
		// Sauce Demo Project
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		// 1. Store & pass form test data
		Map<String, String> loginData = new HashMap<>();
		loginData.put("username", "standard_user");
		loginData.put("password", "secret_sauce");
		
		driver.findElement(By.id("user-name")).sendKeys(loginData.get("username"));
		driver.findElement(By.id("password")).sendKeys(loginData.get("password"));
		driver.findElement(By.id("login-button")).click();

		/*
		// 2. Store locators with their descriptions (locator map)
		Map<String, By> locators = new LinkedHashMap<>();
		locators.put("Username Field", By.id("user-name"));
		locators.put("Password Field", By.id("password"));
		locators.put("Login Button",   By.id("login-button"));

		for (Map.Entry<String, By> locator : locators.entrySet()) {
		    WebElement el = driver.findElement(locator.getValue());
		    System.out.println(locator.getKey() + " is displayed: " + el.isDisplayed());
		}
*/
		

	}
	
	public static void main(String[] args)
	{
		mapdemo();
	}
	
}