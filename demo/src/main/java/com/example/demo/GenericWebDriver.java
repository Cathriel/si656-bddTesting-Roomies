package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWebDriver {
    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if(webDriver == null) {
            // Establece el chrome driver
            //WebDriver webDriver;
            String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_100_60.exe";
            System.setProperty("webdriver.chrome.driver", pathDriver);
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}
