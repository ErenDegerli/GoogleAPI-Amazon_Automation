package com.lastone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends BasePage{

    @FindBy(css = "div[class='Z0LcW']")
    private WebElement isbn;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public String getIsbn() {
        return isbn.getText();
    }
}
