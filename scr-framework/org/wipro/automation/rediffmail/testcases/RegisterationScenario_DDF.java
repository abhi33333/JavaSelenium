package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.RegisterationPage;

public class RegisterationScenario_DDF extends InitiateBrowser
{
    @Test(dataProvider="Registration")
    public void tc02_validate_register_functionality_valid_data(String fullname, String mailid, String day) throws Exception
    {
        RegisterationPage reg = new RegisterationPage(driver);

        reg.click_newrediffmailid_link();
        reg.enter_fullname_textbox(fullname);
        reg.enter_rediffmailid_textbox(mailid);
        reg.select_dob_day_dropdown(day);
        reg.click_gender_female();
    }

    @DataProvider(name="Registration")
    public Object[][] registration_data()
    {
        Object[][] data = {
            {"John Seo", "john.seo@rediffmail.com", "04"},
            {"David Lee", "david.lee@rediffmail.com", "05"},
            {"Neena Shah", "neena.shah@rediffmail.com", "06"}
        };

        return data;
    }
}
