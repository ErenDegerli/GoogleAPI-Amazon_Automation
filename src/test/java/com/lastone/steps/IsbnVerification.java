package com.lastone.steps;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsbnVerification extends BaseTest {

    @Test(dataProvider = "data-provider")
    public void getIsbnNumber(String authorName, String bookName, String expectedPrice) {
        googleHomePage.searchBookIsbn(authorName, bookName);
        String isbn = googleSearchPage.findIsbn();
        amazonHomePage.searchBookOnAmazon(isbn);
        amazonResultPage.getBookPage();
        amazonBookPage.addToCard();
        String confirmationText = amazonConfirmationPage.confirmationText();
        String price = amazonConfirmationPage.price();
        Assert.assertEquals(confirmationText, "Sepete Eklendi");
        Assert.assertEquals(price, expectedPrice);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"Özgür Bacaksız", "Bazı Yollar Yalnız Yürünür", "11,39 TL"},
                              {"Alaeddin Şenel", "Siyasal Düşünceler Tarihi", "24,48 TL"}};
    }


}
