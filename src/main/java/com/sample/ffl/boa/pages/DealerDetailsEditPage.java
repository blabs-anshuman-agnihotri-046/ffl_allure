package com.sample.ffl.boa.pages;

import com.sample.util.BaseClass;
import com.sample.util.CustUtil;
import com.sample.util.RandomDataGenerator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DealerDetailsEditPage extends BaseClass {

    @FindBy(xpath = "//div[@class='RightBox box left css-0']//div[1]//div[3]//button[1]//*[name()='svg']")
    WebElement email_edit_button;
    @FindBy(xpath = "//input[@placeholder='Email address']")
    WebElement email_textBox;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement submit_button;

    @FindBy(xpath = "//button[@aria-label='approved']//*[name()='svg']")
    WebElement save_button;


    public void edit_email() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(email_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(email_edit_button));
        email_edit_button.click();
        wait.until(ExpectedConditions.visibilityOf(email_textBox));
        email_textBox.sendKeys(CustUtil.generateRandomEmail());
        submit_button.click();
        save_button.click();
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//div[@class='RightBox box left css-0']//div[2]//div[3]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M402.3 344')]")
    WebElement phone_edit_button;
    @FindBy(xpath = "//input[@placeholder='XXXXXXXXXX']")
    WebElement phone_textBox;


    public void edit_phone_number() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(phone_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(phone_edit_button));
        CustUtil.pageScrollDown(driver);
        phone_edit_button.click();
        wait.until(ExpectedConditions.visibilityOf(phone_textBox));
        phone_textBox.sendKeys(CustUtil.generateRandomMobileNumber());
        submit_button.click();
        save_button.click();
        Thread.sleep(3000);

    }


    @FindBy(xpath = "//div[4]//div[3]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M402.3 344')]")
    WebElement contact_person_edit_button;
    @FindBy(xpath = "//input[@placeholder='Contact person']")
    WebElement contact_person_textbox;

    public void edit_contact_person_name() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(contact_person_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(contact_person_edit_button));
        CustUtil.pageScrollDown(driver);
        contact_person_edit_button.click();
        wait.until(ExpectedConditions.visibilityOf(contact_person_textbox));
        contact_person_textbox.sendKeys(RandomDataGenerator.generateRandomName());

        submit_button.click();
        save_button.click();
        Thread.sleep(3000);

    }
    @FindBy(xpath = "//div[@class='RightBox box left css-0']//div[7]//div[3]//button[1]//*[name()='svg']")
    WebElement web_url_edit_button;
    @FindBy(xpath = "//input[@placeholder='Website URL']")
    WebElement web_url_textBox;

    public void edit_web_url() throws InterruptedException {
        try{
        CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(web_url_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(web_url_edit_button));
        web_url_edit_button.click();
        web_url_textBox.sendKeys(RandomDataGenerator.generateRandomWebUrl());
        submit_button.click();
        save_button.click();
        Thread.sleep(3000);
    }

    @FindBy(css = "div:nth-child(6) div:nth-child(3) button:nth-child(1)")
    WebElement pistol_price_edit_button;

    public void click_pistol_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(pistol_price_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(pistol_price_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        pistol_price_edit_button.click();
        Thread.sleep(2000);
    }


    @FindBy(css = ".chakra-checkbox__control.css-exc098")
    WebElement firearm_enable_disable_checkbox;

    public void click_on_firearm_enable_disable_checkbox() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(firearm_enable_disable_checkbox));
        wait.until(ExpectedConditions.visibilityOf(firearm_enable_disable_checkbox));
        firearm_enable_disable_checkbox.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "input[role='spinbutton']")
    WebElement firearm_price_textBox;
    public void edit_firearm_price(String price) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(firearm_price_textBox));
        wait.until(ExpectedConditions.elementToBeClickable(firearm_price_textBox));
        firearm_price_textBox.sendKeys(Keys.CONTROL,"a");
        firearm_price_textBox.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        firearm_price_textBox.sendKeys(price);
        Thread.sleep(1000);
        save_button.click();
        Thread.sleep(2000);
    }

    @FindBy(css = "div[class='LeftBox box css-0'] div:nth-child(7) div:nth-child(3) button:nth-child(1)")
    WebElement rifle_edit_button;

    public void click_rifle_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(rifle_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(rifle_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        rifle_edit_button.click();
        Thread.sleep(2000);
    }

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(3)")
    WebElement SBR_fee_edit_button;
    public void click_SBR_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(SBR_fee_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(SBR_fee_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        SBR_fee_edit_button.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(9) > div:nth-child(3)")
    WebElement Shotgun_fee_edit_button;
    public void click_Shotgun_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Shotgun_fee_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(Shotgun_fee_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        Shotgun_fee_edit_button.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "div[class='LeftBox box css-0'] div:nth-child(10) div:nth-child(3) button:nth-child(1)")
    WebElement Suppressor_fee_edit_button;
    public void click_Suppressor_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Suppressor_fee_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(Suppressor_fee_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        Suppressor_fee_edit_button.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "div:nth-child(11) div:nth-child(3) button:nth-child(1)")
    WebElement extra_NIC_fee_edit_button;
    public void click_extra_NIC_fee_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(extra_NIC_fee_edit_button));
        wait.until(ExpectedConditions.elementToBeClickable(extra_NIC_fee_edit_button));
        try{
            CustUtil.pageScrollDown(driver);
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        extra_NIC_fee_edit_button.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "div:nth-child(12) div:nth-child(3) button:nth-child(1)")
    WebElement extra_Firearm_fee;
    public void click_extra_Firearm_fee_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(extra_Firearm_fee));
        wait.until(ExpectedConditions.elementToBeClickable(extra_Firearm_fee));
        try{
            CustUtil.pageScrollDown(driver);
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        extra_Firearm_fee.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "div:nth-child(13) div:nth-child(3) button:nth-child(1)")
    WebElement discount_for_multiple_firearm;
    public void click_discount_multiple_firearm_edit_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(discount_for_multiple_firearm));
        wait.until(ExpectedConditions.elementToBeClickable(discount_for_multiple_firearm));
        try{
            CustUtil.pageScrollDown(driver);
            CustUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        discount_for_multiple_firearm.click();
        Thread.sleep(2000);
    }



}
