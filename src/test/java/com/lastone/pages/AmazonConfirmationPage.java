package com.lastone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonConfirmationPage extends BasePage{

    By confirmationText = By.id("huc-v2-order-row-confirm-text");
    By price = By.cssSelector("span[class='a-color-price hlb-price a-inline-block a-text-bold']");

    public AmazonConfirmationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getConfirmationText() {
        return getElement(confirmationText);
    }
    public WebElement getPrice() {
        return getElement(price);
    }

    public String confirmationText() {
        return getConfirmationText().getText();
    }
    public String price() {
        return getPrice().getText();
    }
}
