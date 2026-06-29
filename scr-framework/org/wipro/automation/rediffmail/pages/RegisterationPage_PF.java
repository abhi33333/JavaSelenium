package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class RegisterationPage_PF
{
    WebDriver driver;

    public RegisterationPage_PF(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[text()='Get a new Rediffmail ID']")
	WebElement mailid_link;

	@FindBy(css="[placeholder='Enter your full name']")
	WebElement fullname_textbox;

	@FindBy(css="[placeholder='Enter your full name']")
	WebElement mail_textbox;
	
	@FindBy(css="[class='day']")
	WebElement dob_day_select;
	
	@FindBy(css="[type='checkbox']")
	WebElement rememberme_checkbox;

	@FindBy(xpath="//label[text()='Female']")
	WebElement gender_female_click;
   
    public void click_newrediffmailid_link() throws Exception
    {
    			mailid_link.click();
    }

    
    public void enter_fullname_textbox(String fname) throws Exception
    {
    	fullname_textbox.sendKeys(fname);
    }

    
    public void enter_rediffmailid_textbox(String email) throws Exception
    {
    	mail_textbox.sendKeys(email);
    }
    
    public void select_dob_day_dropdown(String day) throws Exception
    {
    	Select select = new Select(dob_day_select);
        select.selectByVisibleText(day);
    }

    public void click_gender_female() throws Exception
    {
    	gender_female_click.click();
    }
    
} 
   