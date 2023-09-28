package ffl.boa.tests;

import com.sample.ffl.boa.pages.GlobalAdminReviewPage;
import com.sample.ffl.boa.pages.LoginPage;
import com.sample.util.BaseClass;
import com.sample.util.PropertyUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GlobalAdminReviewPageTest extends BaseClass {
    GlobalAdminReviewPage globalAdminReviewPage;
    LoginPage loginPage;

    @Test
    public void TC_001_Reject_action_on_review() throws InterruptedException {
        loginPage= PageFactory.initElements(driver,LoginPage.class);
        globalAdminReviewPage=PageFactory.initElements(driver,GlobalAdminReviewPage.class);

        loginPage.enter_email(PropertyUtil.getProperty(getEnvFilePath(),"AutomationGlobalAdminEmail"));
        loginPage.enter_password(PropertyUtil.getProperty(getEnvFilePath(),"password"));
        loginPage.click_submit_button();
        globalAdminReviewPage.click_on_review_button();
        globalAdminReviewPage.click_on_dealer_action_tab();
    }
}
