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

public class SetDemo 
{

	public static void setdemo()
	{
		
		// --- Declaration ---
		Set<String> uniqueWindows = new HashSet<>();

		// --- Add elements ---
		uniqueWindows.add("WindowHandle_1");
		uniqueWindows.add("WindowHandle_2");
		uniqueWindows.add("WindowHandle_1"); // duplicate — ignored silently

		System.out.println(uniqueWindows.size()); // 2

		// --- Check existence ---
		System.out.println(uniqueWindows.contains("WindowHandle_2")); // true

		// --- Iterate ---
		for (String w : uniqueWindows) {
		    System.out.println(w);
		}

		// LinkedHashSet — maintains insertion order
		Set<String> orderedSet = new LinkedHashSet<>();
		orderedSet.add("B");
		orderedSet.add("A");
		orderedSet.add("C");
		// Prints: B, A, C
		
		
		//Where to use in Selenium:
		// Mphasis project
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.mphasis.com/home.html");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		/*
		// 1. Handle multiple browser windows/tabs (most common use case)
		Set<String> allWindows = driver.getWindowHandles(); // returns Set<String>

		for (String windowHandle : allWindows) {
		    driver.switchTo().window(windowHandle);
		    System.out.println("Title: " + driver.getTitle());
		}
*/
		// 2. Switch to a new window (child)
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
		    if (!handle.equals(parentWindow)) {
		        driver.switchTo().window(handle); // switch to child
		    }
		}

	}

	
	public static void main(String[] args)
	{
		setdemo();
	}
	
}