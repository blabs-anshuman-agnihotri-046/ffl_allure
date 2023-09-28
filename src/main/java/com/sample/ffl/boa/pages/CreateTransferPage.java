package com.sample.ffl.boa.pages;

import com.sample.util.BaseClass;
import com.sample.util.CustUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateTransferPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/button")
    WebElement start_a_new_transfer_button;

    public void click_start_new_transfer_from_queue() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(start_a_new_transfer_button));
        wait.until(ExpectedConditions.elementToBeClickable(start_a_new_transfer_button));
        start_a_new_transfer_button.click();
        Thread.sleep(2000);
    }

    @FindBy(css = "body > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > section:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement license_number_textbox;
    @FindBy(css = "button[class='chakra-button css-i857na']")
    WebElement search_button;
    public void enter_license_number_click_search_button(String license_number) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(license_number_textbox));
        CustUtil.highlightElement(driver,license_number_textbox);
        license_number_textbox.sendKeys(license_number);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(search_button));
        wait.until(ExpectedConditions.elementToBeClickable(search_button));
        CustUtil.highlightElement(driver,search_button);
        search_button.click();
        Thread.sleep(8000);
    }


    @FindBy(css ="div[class='ez-check-status success'] span")
    WebElement ez_check_successful_msg;

    @FindBy(css = "div[class='ez-check-status failed'] span")
    WebElement getEz_check_fail_msg;

    @FindBy(css = "body > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > section:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")
    WebElement ref_id_textbox;
    public void add_ref_id(String ref_id){
        wait.until(ExpectedConditions.visibilityOf(ref_id_textbox));
        wait.until(ExpectedConditions.elementToBeClickable(ref_id_textbox));
        ref_id_textbox.sendKeys(ref_id);
    }


    @FindBy (css = "body > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > section:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > select:nth-child(1)")
    WebElement firearm_dropdown;

    public void select_firearm_from_dropdown(String firearm){
        wait.until(ExpectedConditions.visibilityOf(firearm_dropdown));
        wait.until(ExpectedConditions.elementToBeClickable(firearm_dropdown));
        CustUtil.highlightElement(driver,firearm_dropdown);
        CustUtil.selectDropDown(firearm_dropdown,firearm);
    }
    @FindBy(css = "body > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > section:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")
    WebElement buyer_name_textbox;

    public void add_buyer_name(String name){
        wait.until(ExpectedConditions.visibilityOf(buyer_name_textbox));
        CustUtil.highlightElement(driver,buyer_name_textbox);
        buyer_name_textbox.sendKeys(name);
    }

    @FindBy(xpath = "//input[@id='field-:r5b:']")
    WebElement note_textbox;

    @FindBy(css = "button[class='chakra-button css-f2hjvb']")
    WebElement save_button;
    public void click_save_button(){
        wait.until(ExpectedConditions.visibilityOf(save_button));
        wait.until(ExpectedConditions.elementToBeClickable(save_button));
        CustUtil.highlightElement(driver,save_button);
        save_button.click();
    }


}
