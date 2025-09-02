package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestSelenium11_Change_Driver {
    public static void main(String[] args) {
        WebDriver d1 = new ChromeDriver();
        d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        d1 = new FirefoxDriver();
        d1.quit();
    }
}