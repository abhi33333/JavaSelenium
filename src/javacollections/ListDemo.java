package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListDemo 
{

	public static void listdemo() throws Exception
	{
		
		//simple 1-d array
		Object[] data1 = {"user1","user2","user3"};
		System.out.println(data1[0]);  //user1
		System.out.println(data1.length); //3
		
		
		//simple 2-d array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"}};
						
		
		// --- Declaration ---
		List<String> browsers = new ArrayList<>();

		// --- Add elements ---
		browsers.add("Chrome");
		browsers.add("Firefox");
		browsers.add("Edge");
		browsers.add("Chrome"); // duplicates allowed

		// --- Access by index ---
		System.out.println(browsers.get(0)); // Chrome

		// --- Iterate ---
		for (String b : browsers) {
		    System.out.println(b);
		}

		// --- Size, Remove ---
		System.out.println(browsers.size()); // 4
		browsers.remove("Edge");
		
		System.out.println(browsers.size()); // 3
		
		browsers.add("Edge");
		
	
		//Where to use in Selenium:
		
		//sauce demo project
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		// 1. Store all web elements found by findElements()
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
		System.out.println("List of Products: " + products.size()); //6
		
		// 2. Iterate and click each element
		for (WebElement list : products) {
		    System.out.println(list.getText());  //all the product name
		}

		products.get(0).click(); // to click on first product
	

		// 3. Store test data for data-driven testing
		List<String> usernames = Arrays.asList("standard_user", "locked_out_user", "problem_user");
		for (String user : usernames) {
		    driver.findElement(By.id("user-name")).sendKeys(user);
		}

		
	}
	
	public static void main(String[] args) throws Exception
	{
		listdemo();
	}
	
}