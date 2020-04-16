package com.lastone.steps;

import com.lastone.driver.SetDriver;
import com.lastone.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class IsbnVerification {

    WebDriver driver;
    private GoogleHomePage googleHomePage;
    private AmazonBookPage amazonBookPage;
    private AmazonConfirmationPage amazonConfirmationPage;
    private AmazonHomePage amazonHomePage;
    private AmazonResultPage amazonResultPage;
    private GoogleSearchPage googleSearchPage;
    private BuyLinkPage buyLinkPage;

    @BeforeMethod
    public void initializeTest(){
        driver = SetDriver.initializeDriver();
        googleHomePage= new GoogleHomePage(driver);
        amazonBookPage = new AmazonBookPage(driver);
        amazonConfirmationPage = new AmazonConfirmationPage(driver);
        amazonHomePage = new AmazonHomePage(driver);
        amazonResultPage = new AmazonResultPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        buyLinkPage = new BuyLinkPage(driver);
    }

    @Test(dataProvider = "data-provider")
    public void getIsbnNumber(String authorName, String bookName, String expectedPrice) {
        googleHomePage.getGoogleHomePage();
        googleHomePage.searchBookIsbn(authorName, bookName);
        final String isbn = googleSearchPage.getIsbn();
        buyLinkPage.landOnBuyLinkPage(isbn);
        Assert.assertEquals(bookName,buyLinkPage.getBuyLinkTitle());
        amazonHomePage.getAmazonHomePage();
        amazonHomePage.searchBookOnAmazon(isbn);
        amazonResultPage.getBookPage();
        amazonBookPage.addToCard();

        Assert.assertEquals(amazonConfirmationPage.confirmationText(), "Sepete Eklendi");
        Assert.assertEquals(amazonConfirmationPage.price(), expectedPrice);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"Özgür Bacaksız", "Bazı Yollar Yalnız Yürünür", "11,39 TL"},
                              {"Alaeddin Şenel", "Siyasal Düşünceler Tarihi", "36,33 TL"}};
    }
}
