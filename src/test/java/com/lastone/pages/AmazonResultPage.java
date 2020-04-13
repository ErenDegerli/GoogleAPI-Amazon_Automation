package com.lastone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonResultPage extends BasePage{

    @FindBy(css = "a[class='a-link-normal a-text-normal']")
    private WebElement bookTitle;

    public AmazonResultPage(WebDriver driver) {
        super(driver);
    }

    public void getBookPage() {
        bookTitle.click();
    }
}
