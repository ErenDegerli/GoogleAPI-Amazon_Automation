package com.lastone.steps;

import com.lastone.configuration.Config;
import com.lastone.driver.SetDriver;
import com.lastone.pages.*;
import com.lastone.core.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {

    WebDriver driver;
    Page page;

    public BaseTest(WebDriver driver) {
        this.driver = SetDriver.initializeDriver();
        page = new BasePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
