package com.lastone.core;

import com.lastone.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    public WebDriver driver;
    public WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public void waitForElementPresent(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(element));
        }catch (Exception e) {
            System.out.println("Some exception/error occured while waiting for element");
        }
    }
}
