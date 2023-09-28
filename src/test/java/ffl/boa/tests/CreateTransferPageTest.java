package ffl.boa.tests;

import com.sample.ffl.boa.pages.CreateTransferPage;
import com.sample.ffl.boa.pages.LoginPage;
import com.sample.util.BaseClass;
import com.sample.util.PropertyUtil;
import com.sample.util.RandomDataGenerator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateTransferPageTest extends BaseClass {
    CreateTransferPage createTransferPage;
    LoginPage loginPage;

    @Test
    public void TC_001_Verify_that_create_transfer_flow_from_Queue_is_working() throws InterruptedException {
        createTransferPage = PageFactory.initElements(driver,CreateTransferPage.class);
        loginPage=PageFactory.initElements(driver,LoginPage.class);

        loginPage.enter_email(PropertyUtil.getProperty(getEnvFilePath(),"AutomationAdminEmail"));
        loginPage.enter_password(PropertyUtil.getProperty(getEnvFilePath(),"password"));
        loginPage.click_submit_button();
        createTransferPage.click_start_new_transfer_from_queue();
        createTransferPage.enter_license_number_click_search_button("15400040");
        createTransferPage.add_ref_id("Automation_Ref_ID");
        createTransferPage.select_firearm_from_dropdown(RandomDataGenerator.generateRandomFirearms());
        createTransferPage.add_buyer_name(RandomDataGenerator.generateRandomName());
        createTransferPage.click_save_button();


    }
    @Test
    public void TC_002_Verify_that_create_transfer_flow_from_Explore_is_working(){

    }
}
