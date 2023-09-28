package ffl.boa.tests;

import com.sample.ffl.boa.pages.LoginPage;
import com.sample.util.BaseClass;
import com.sample.util.PropertyUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    LoginPage loginPage;

    @Test
    public void TC_001_Verify_that_login_is_working() throws InterruptedException {
        loginPage= PageFactory.initElements(driver,LoginPage.class);
        loginPage.enter_email(PropertyUtil.getProperty(getEnvFilePath(),"AutomationGlobalAdminEmail"));
        loginPage.enter_password(PropertyUtil.getProperty(getEnvFilePath(),"password"));
        loginPage.click_submit_button();
    }
}
