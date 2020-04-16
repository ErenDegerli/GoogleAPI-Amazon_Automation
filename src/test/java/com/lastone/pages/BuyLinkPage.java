package com.lastone.pages;

import com.lastone.client.Client;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class BuyLinkPage extends BasePage {

    @FindBy(css = "div[class='sIskre'] h1")
    private WebElement title;

    public BuyLinkPage(WebDriver driver) {
        super(driver);
    }

    public void landOnBuyLinkPage(String isbn){
        try {
            driver.get(Client.getBuyLink(isbn));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getBuyLinkTitle(){
        return title.getText();
    }
}
