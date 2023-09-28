package com.sample.util;

import java.io.IOException;
import java.time.Duration;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaScriptUtil {
//	public WebDriver driver;

	public void execute_js(WebDriver driver,String Command, WebElement ele){
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(Command,ele);
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			Assert.fail("Not able to execute script : " + e);
		}
	}

	public void execute_js(WebDriver driver,String Command ){
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(Command);
		}
		catch (Exception e)
		{
			Assert.fail("Not able to execute reason : " + e);
		}
	}

}