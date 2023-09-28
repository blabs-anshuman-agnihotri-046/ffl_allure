package com.sample.ffl.boa.pages;

import com.sample.util.BaseClass;
import com.sample.util.CustUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BOAHomePage extends BaseClass {

    @FindBy(xpath = "//button[normalize-space()='Explore']")
    WebElement explore_button;

    @FindBy(xpath = "//button[normalize-space()='Queue']")
    WebElement queue_button;

    @FindBy (tagName = "input")
    WebElement search_textbox;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement search_button;


    public void click_explore_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(explore_button));
        wait.until(ExpectedConditions.elementToBeClickable(explore_button));
        CustUtil.highlightElement(driver,explore_button);
        explore_button.click();
        Thread.sleep(2000);
    }

    public void click_queue_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(queue_button));
        wait.until(ExpectedConditions.elementToBeClickable(queue_button));
        CustUtil.highlightElement(driver,queue_button);
        queue_button.click();
        Thread.sleep(2000);
    }

    public void add_value_in_search_textbox(String licenseOrZip) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(search_textbox));
        CustUtil.highlightElement(driver,search_textbox);
        search_textbox.sendKeys(licenseOrZip);
        Thread.sleep(1000);
    }

    public void click_search_button() throws InterruptedException {
        CustUtil.highlightElement(driver,search_button);
        search_button.click();
        Thread.sleep(3000);
    }

    @FindBy(css = "div[class='LeftBox box css-0'] div:nth-child(1) div:nth-child(2)")
    WebElement full_license_text;

    public String get_full_license_text(){
        wait.until(ExpectedConditions.visibilityOf(full_license_text));
        CustUtil.highlightElement(driver,full_license_text);
        return full_license_text.getText();
    }

    @FindBy(xpath = "//div[@class='css-18ea5fm']")
    WebElement count_of_license;
    public String get_count_Of_license() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(count_of_license));
        CustUtil.highlightElement(driver, count_of_license);
        Thread.sleep(2000);
        return count_of_license.getText();
    }

}
