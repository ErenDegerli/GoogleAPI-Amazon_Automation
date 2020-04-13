package com.lastone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonConfirmationPage extends BasePage{

    @FindBy(id = "huc-v2-order-row-confirm-text")
    private WebElement confirmationText;

    @FindBy(css = "span[class='a-color-price hlb-price a-inline-block a-text-bold']")
    private WebElement price;

    public AmazonConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public String confirmationText() {
        return confirmationText.getText();
    }

    public String price() {
        return price.getText();
    }
}
