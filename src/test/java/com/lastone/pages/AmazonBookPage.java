package com.lastone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBookPage extends BasePage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartBtn;

    public AmazonBookPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        addCartBtn.click();
    }
}
