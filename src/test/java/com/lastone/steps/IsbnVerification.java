package com.lastone.steps;

import com.lastone.driver.SetDriver;
import com.lastone.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsbnVerification {

    WebDriver driver;
    private GoogleHomePage googleHomePage;
    private AmazonBookPage amazonBookPage;
    private AmazonConfirmationPage amazonConfirmationPage;
    private AmazonHomePage amazonHomePage;
    private AmazonResultPage amazonResultPage;
    private GoogleSearchPage googleSearchPage;

    @BeforeMethod
    public void initializeTest(){
        driver = SetDriver.initializeDriver();
        googleHomePage= new GoogleHomePage(driver);
        amazonBookPage = new AmazonBookPage(driver);
        amazonConfirmationPage = new AmazonConfirmationPage(driver);
        amazonHomePage = new AmazonHomePage(driver);
        amazonResultPage = new AmazonResultPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
    }


    @Test(dataProvider = "data-provider")
    public void getIsbnNumber(String authorName, String bookName, String expectedPrice) {
        googleHomePage.getGoogleHomePage();
        googleHomePage.searchBookIsbn(authorName, bookName);
        final String isbn = googleSearchPage.getIsbn();
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
                              {"Alaeddin Şenel", "Siyasal Düşünceler Tarihi", "24,48 TL"}};
    }


}
