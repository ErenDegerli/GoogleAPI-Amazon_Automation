package com.lastone.pages;

import com.lastone.core.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getElement(By locator) {
        WebElement element = null;
        try {
            waitForElementPresent(locator);
            element = driver.findElement(locator);
            return element;
        }catch (Exception e) {
            System.out.println("Some error occures while creating element " + locator.toString());
            e.printStackTrace();
        }
        return element;
    }

    @Override
    public void waitForElementPresent(By locator) {

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }catch (Exception e) {
            System.out.println("Some exception/error occured while waiting for element " + locator.toString());
        }
    }
}

