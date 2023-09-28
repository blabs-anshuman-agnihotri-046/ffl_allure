package ffl.boa.tests;

import com.sample.ffl.boa.pages.BOAHomePage;
import com.sample.ffl.boa.pages.DealerDetailsEditPage;
import com.sample.ffl.boa.pages.LoginPage;
import com.sample.util.BaseClass;
import com.sample.util.PropertyUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DealerDetailsEditPageTest extends BaseClass {

    BOAHomePage boaHomePage;
    LoginPage loginPage;
    DealerDetailsEditPage dealerDetailsEditPage;


    @Test(priority = 1)
    public void TC_001_Verify_that_admin_is_able_to_edit_dealer_email_for_BOA_application() throws InterruptedException {
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        loginPage=PageFactory.initElements(driver,LoginPage.class);
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);

        loginPage.enter_email(PropertyUtil.getProperty(getEnvFilePath(),"AutomationAdminEmail"));
        loginPage.enter_password(PropertyUtil.getProperty(getEnvFilePath(),"password"));
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        loginPage.click_submit_button();
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.edit_email();
    }

    @Test(priority = 2)
    public void TC_002_Verify_that_admin_is_able_to_edit_phone_number() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);

        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.edit_phone_number();
    }

    @Test(priority = 3)
    public void TC_003_Verify_that_admin_is_able_to_edit_contact_person_name() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);

        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.edit_contact_person_name();
    }

    @Test(priority = 4)
    public void TC_004_Verify_that_admin_is_able_to_edit_web_url() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.edit_web_url();

    }

    @Test(priority = 5)
    public void TC_005_Verify_that_admin_is_able_to_edit_pistol_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_pistol_edit_button();
        dealerDetailsEditPage.click_on_firearm_enable_disable_checkbox();
        dealerDetailsEditPage.edit_firearm_price("100");

    }

    @Test(priority = 6)
    public void TC_006_Verify_that_admin_is_able_to_edit_rifle_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_rifle_edit_button();
        dealerDetailsEditPage.click_on_firearm_enable_disable_checkbox();
        dealerDetailsEditPage.edit_firearm_price("200");
    }
    @Test(priority = 7)
    public void TC_007_Verify_that_admin_is_able_to_edit_SBR_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_SBR_edit_button();
        dealerDetailsEditPage.click_on_firearm_enable_disable_checkbox();
        dealerDetailsEditPage.edit_firearm_price("300");

    }
    @Test(priority = 8)
    public void TC_008_Verify_that_admin_is_able_to_edit_Shotgun_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_Shotgun_edit_button();
        dealerDetailsEditPage.click_on_firearm_enable_disable_checkbox();
        dealerDetailsEditPage.edit_firearm_price("400");

    }
    @Test(priority = 9)
    public void TC_009_Verify_that_admin_is_able_to_edit_Supressor_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_Suppressor_edit_button();
        dealerDetailsEditPage.click_on_firearm_enable_disable_checkbox();
        dealerDetailsEditPage.edit_firearm_price("500");

    }
    @Test(priority = 10)
    public void TC_010_Verify_that_admin_is_able_to_edit_extra_NIC_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_extra_NIC_fee_edit_button();
        dealerDetailsEditPage.edit_firearm_price("600");

    }
    @Test(priority = 11)
    public void TC_011_Verify_that_admin_is_able_to_edit_extra_Firearm_fee() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_extra_Firearm_fee_edit_button();
        dealerDetailsEditPage.edit_firearm_price("700");

    }
    @Test(priority = 12)
    public void TC_012_Verify_that_admin_is_able_to_edit_discount_for_multiple() throws InterruptedException {
        dealerDetailsEditPage=PageFactory.initElements(driver,DealerDetailsEditPage.class);
        boaHomePage= PageFactory.initElements(driver, BOAHomePage.class);
        boaHomePage.click_explore_button();
        boaHomePage.add_value_in_search_textbox("15400070");
        boaHomePage.click_search_button();
        dealerDetailsEditPage.click_discount_multiple_firearm_edit_button();
        dealerDetailsEditPage.edit_firearm_price("800");

    }
}
