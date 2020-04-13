package com.lastone.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver  {

    public static WebDriver driver;

    public static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        return driver = new ChromeDriver();
    }
}
