package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.RegisterationPage;

public class RegisterationScenario extends InitiateBrowser
{
    @Test
    public void tc02_validate_register_functionality_valid_data() throws Exception
    {
        RegisterationPage reg = new RegisterationPage(driver);

        reg.click_newrediffmailid_link();
        reg.enter_fullname_textbox("John Seo");
        reg.enter_rediffmailid_textbox("john.seo@rediffmail.com");
        reg.select_dob_day_dropdown("04");
        reg.click_gender_female();
        
    }
}