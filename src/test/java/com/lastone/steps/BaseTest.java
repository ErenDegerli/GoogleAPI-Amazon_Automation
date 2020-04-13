package com.lastone.steps;

import com.lastone.configuration.Config;
import com.lastone.pages.*;
import com.lastone.core.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    WebDriver driver;
    public Page page;
    public AmazonBookPage amazonBookPage;
    public AmazonConfirmationPage amazonConfirmationPage;
    public AmazonHomePage amazonHomePage;
    public AmazonResultPage amazonResultPage;
    public GoogleSearchPage googleSearchPage;
    public GoogleHomePage googleHomePage;

    @BeforeMethod
    public void setUpTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        page = new BasePage(driver);
        amazonBookPage = new AmazonBookPage(driver);
        amazonConfirmationPage = new AmazonConfirmationPage(driver);
        amazonHomePage = new AmazonHomePage(driver);
        amazonResultPage = new AmazonResultPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        googleHomePage = new GoogleHomePage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
