package com.sample.ffl.boa.pages;

import com.sample.util.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GlobalAdminReviewPage extends BaseClass {
    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3) > button:nth-child(1)")
    WebElement review_button;
    public void click_on_review_button() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(review_button));
        wait.until(ExpectedConditions.elementToBeClickable(review_button));
        review_button.click();
        Thread.sleep(2000);
    }
    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)")
    WebElement  dealer_action_tab;
    public void click_on_dealer_action_tab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(dealer_action_tab));
        wait.until(ExpectedConditions.elementToBeClickable(dealer_action_tab));
        dealer_action_tab.click();
        Thread.sleep(5000);
    }

}
