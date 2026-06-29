
package org.xyz.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class FirstAutomation {

    WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
    	
    	ChromeOptions co =new ChromeOptions();
    	co.addArguments("--incognito");
    	
    	
        // Launch Chrome browser
        driver = new ChromeDriver(co);

        // Open Rediffmail login page
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        //Type: Page Load Timeout  Use: Waits for the whole page to fully load before moving to next step.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Type: Implicit Wait   Use: Global wait for all findElement() calls.
        
        
        System.out.println("Current Url: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
        
        
        //Asserting if the title is correct and matching, case is pass
        Assert.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access");

        // Maximize browser window
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        // Close the browser after each test
        driver.close();

        // Alternative:
        // driver.quit();
    }

    @Test(enabled=true)
    public void register_functionality() throws Exception {

        // Click "Create new Rediffmail account" link using relative locator
        WebElement signInButton = driver.findElement(By.className("signin-btn"));

        driver.findElement(
                with(By.xpath("//a[@title='Create new Rediffmail account']"))
                        .below(signInButton)
        ).click();

        // Alternative locators:
        // driver.findElement(By.cssSelector("[title='Create new Rediffmail account']")).click();
        // driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
        // driver.findElement(By.partialLinkText("Get a new Rediffmail ID")).click();

        // Enter account details
        //driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
        
        String fullName_Text= driver.findElement(By.xpath("//label[text()='Full Name']")).getText();
        Assert.assertEquals(fullName_Text,"Full Name");
        System.out.println(fullName_Text);
        
        String act_fullName_Textbox= driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
        Assert.assertEquals(act_fullName_Textbox,"Enter your full name"); 
        System.out.println(act_fullName_Textbox);
        
                              driver.findElement(By.cssSelector("[placeholder='Enter Rediffmail ID']")).sendKeys("JohnSeo");
        String act_rediffID = driver.findElement(By.cssSelector("[placeholder='Enter Rediffmail ID']")).getAttribute("value");
        Assert.assertEquals(act_rediffID, "JohnSeo");
        System.out.println(act_rediffID);
        
        
        
        driver.findElement(By.cssSelector("[placeholder='Enter password']")).sendKeys("password12");
        driver.findElement(By.cssSelector("[placeholder='Retype password']")).sendKeys("password12");

        // Select date of birth - Day
        Select dobDay = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
        dobDay.selectByIndex(2);

        // Select date of birth - Month
        Select dobMonth = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
        dobMonth.selectByValue("05");   // May

        // Alternative:
        // dobMonth.selectByVisibleText("MAY");

        // Select date of birth - Year
        Select dobYear = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
        dobYear.selectByVisibleText("2000");

        // Select gender
        //driver.findElement(By.cssSelector("input[value='m']")).click();
        WebElement genderRadio = driver.findElement(By.xpath("//input[@type='radio' and @value ='m']"));
        genderRadio.click();

        // Select country
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States");

        // Enter recovery email
        driver.findElement(By.cssSelector("[placeholder='Enter recovery email']")).sendKeys("JSeo@bgg.com");

        // Select checkbox
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='Select a Security Question']")), "Select a Security Question"));
        //Type: Explicit Wait  Use: Waits until a specific condition is met (here: text appears in element).
        
        /*Wait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);*/
        //Type: Fluent Wait Use: Advanced explicit wait — custom timeout, polling interval, and exception handling.

        // Select security question
        Select question = new Select(driver.findElement(By.xpath("//select[contains(@name,'hint')]")));
        question.selectByVisibleText("What is the name of your first school?");

        // Enter security answer
        driver.findElement(By.xpath("//input[contains(@name,'hint')]"))
                .sendKeys("Bright Star Elementary School");

        // Enter mother's maiden name
        driver.findElement(By.xpath("//input[contains(@name,'mother')]")).sendKeys("Lali");

        // Select mobile country code
        driver.findElement(By.xpath("//span[text()='+1']")).click();

        // Enter mobile number
        driver.findElement(By.id("mobno")).sendKeys("2345678910");
    }

    @Test(enabled=false)
    public void login_functionality()
    {
    	System.out.println("===== LOGIN TEST STARTED =====");
    	WebElement username_textbox = driver.findElement(By.id("login1"));
        username_textbox.sendKeys("it_john");
        username_textbox.clear();
        username_textbox.sendKeys("john.seo");

        driver.findElement(By.name("passwd")).sendKeys("pass1234");
        
        //checkbox- check if it selected
        System.out.println("isSelected: " + driver.findElement(By.id("remember")).isSelected()); //true
        //if its already checked uncheck
        driver.findElement(By.id("remember")).click();  
        //Check if it is checked
        System.out.println("Uncheck and check if it is selected; " + driver.findElement(By.id("remember")).isSelected());  //false

        //driver.findElement(By.className("signin-btn")).click();
        System.out.println("Get Location:" + driver.findElement(By.className("signin-btn")).getLocation());//location 
       // System.out.println(driver.findElement(By.className("signin-btn")).isEnabled()); //true
        //System.out.println(driver.findElement(By.className("signin-btn")).isDisplayed()); //true
        //System.out.println("Page Source: " + driver.getPageSource());
    }
        
        
    }


