package com.lastone.pages;

import com.lastone.configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GoogleHomePage extends BasePage {

    @FindBy(css = "input[class='gLFyf gsfi']")
    private WebElement searchBox;

    @FindBy(css = "div[class='FPdoLc tfB0Bf'] center input")
    private WebElement searchBtn;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void getGoogleHomePage() {
        try {
            driver.get(Config.getValue("googleUrl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchBookIsbn(String authorName, String bookName) {
        searchBox.sendKeys(authorName + " " + bookName + " isbn");
        searchBtn.click();
    }
}
