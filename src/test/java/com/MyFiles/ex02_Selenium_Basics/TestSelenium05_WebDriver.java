package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium05_WebDriver {
    public static void main(String[] args) {
        WebDriver d1 = new ChromeDriver();
        d1.get("https://app.vwo.com");
    }
}
