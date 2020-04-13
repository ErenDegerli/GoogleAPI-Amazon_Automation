package com.lastone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends BasePage{

    By isbn = By.cssSelector("div[class='Z0LcW']");

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getIsbn() {
        return getElement(isbn);
    }

    public String findIsbn() {
        return getIsbn().getText();
    }

}
