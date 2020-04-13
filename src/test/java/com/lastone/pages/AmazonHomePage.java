package com.lastone.pages;

import com.lastone.configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AmazonHomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searcBox;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void getAmazonHomePage() {
        try {
            driver.get(Config.getValue("amazonUrl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchBookOnAmazon(String isbn) {
        searcBox.sendKeys(isbn);
        searcBox.sendKeys(Keys.ENTER);
    }
}
