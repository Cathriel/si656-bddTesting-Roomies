package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Post {

    public static void main(String[] args) {


        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_100_60.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        String urlPage = "https://roomiesfrontend.web.app/";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        String titulo = webDriver.getTitle();
        System.out.println(titulo);

       /* WebElement webElement;
        webElement = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        webElement.sendKeys("DevOps");

        webDriver.findElement(By.linkText("Gmail")).click();

        webDriver.navigate().back();

        webDriver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();*/

    }

}
