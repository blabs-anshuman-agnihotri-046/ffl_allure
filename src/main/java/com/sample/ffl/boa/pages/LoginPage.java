package com.sample.ffl.boa.pages;

import com.sample.util.BaseClass;
import com.sample.util.CustUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//input[@id='amplify-id-:r1:']")
    WebElement email_textbox;

    @FindBy(xpath = "//input[@id='amplify-id-:r4:']")
    WebElement password_textbox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit_button;

    public void enter_email(String email){
        wait.until(ExpectedConditions.visibilityOf(email_textbox));
        CustUtil.highlightElement(driver,email_textbox);
        email_textbox.sendKeys(email);
    }

    public void enter_password(String password){
        wait.until(ExpectedConditions.elementToBeClickable(password_textbox));
        wait.until(ExpectedConditions.visibilityOf(password_textbox));
        CustUtil.highlightElement(driver,password_textbox);
        password_textbox.sendKeys(password);
    }

    public void click_submit_button() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(submit_button));
        CustUtil.highlightElement(driver,submit_button);
        submit_button.click();
        Thread.sleep(3000);
    }
}
