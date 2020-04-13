package com.lastone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBookPage extends BasePage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartBtn;

    public AmazonBookPage(WebDriver driver) {
        super(driver);
    }

    public void addToCard() {
        addCartBtn.click();
    }
}
