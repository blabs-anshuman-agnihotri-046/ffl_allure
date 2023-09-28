package ffl.boa.tests;

import com.sample.ffl.boa.pages.BOAHomePage;
import com.sample.ffl.boa.pages.LoginPage;
import com.sample.util.BaseClass;
import com.sample.util.PropertyUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BOAHomePageTest extends BaseClass {

    BOAHomePage boaHomePage;
    LoginPage loginPage;

    @Test(priority = 1)
    public void TC_001_Verify_that_Search_dealer_by_license_is_working() throws InterruptedException {
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        loginPage=PageFactory.initElements(driver,LoginPage.class);

        try{
        loginPage.enter_email(PropertyUtil.getProperty(getEnvFilePath(),"AutomationAgentEmail"));
        loginPage.enter_password(PropertyUtil.getProperty(getEnvFilePath(),"password"));
        loginPage.click_submit_button();
        }catch (Exception ignored){}
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();

        Assert.assertNotNull(boaHomePage.get_full_license_text());
    }

    @Test(priority = 2)
    public void TC_002_Verify_that_search_dealer_by_zipcode_is_working() throws InterruptedException {
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        loginPage=PageFactory.initElements(driver,LoginPage.class);

        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("30075");
        boaHomePage.click_search_button();

        Assert.assertNotNull(boaHomePage.get_count_Of_license());
    }

}
