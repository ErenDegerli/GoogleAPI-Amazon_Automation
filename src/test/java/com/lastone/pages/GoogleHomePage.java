package com.lastone.pages;

import com.lastone.configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class GoogleHomePage extends BasePage {

    private By searchBox = By.cssSelector("input[class='gLFyf gsfi']");
    private By searchBtn = By.cssSelector("div[class='FPdoLc tfB0Bf'] center input");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }


    //getters
    public WebElement getSearchBox() {
        return getElement(searchBox);
    }

    public WebElement getSearchBtn() {
        return getElement(searchBtn);
    }

    //page actions

    public void searchBookIsbn(String authorName, String bookName) {
        try {
            driver.get(Config.getValue("googleUrl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSearchBox().sendKeys(authorName + " " + bookName + " isbn");
        getSearchBtn().click();
    }

}
