package com.lastone.pages;

import com.lastone.configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AmazonHomePage extends BasePage {

    By searcBox = By.id("twotabsearchtextbox");

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchBox() {
        return getElement(searcBox);
    }

    public void searchBookOnAmazon(String isbn) {
        try {
            driver.get(Config.getValue("amazonUrl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSearchBox().sendKeys(isbn);
        getSearchBox().sendKeys(Keys.ENTER);
    }
}
