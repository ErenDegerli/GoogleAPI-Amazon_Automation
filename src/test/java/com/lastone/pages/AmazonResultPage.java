package com.lastone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonResultPage extends BasePage{

    By bookTitle = By.cssSelector("a[class='a-link-normal a-text-normal']");

    public AmazonResultPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getBookTitle() {
        return getElement(bookTitle);
    }

    public void getBookPage() {
        getBookTitle().click();
    }
}
