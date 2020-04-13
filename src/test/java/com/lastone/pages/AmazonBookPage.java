package com.lastone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonBookPage extends BasePage {

    By addCartBtn = By.id("add-to-cart-button");

    public AmazonBookPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAddCartBtn() {
        return getElement(addCartBtn);
    }

    public void addToCard() {
        getAddCartBtn().click();
    }
}
