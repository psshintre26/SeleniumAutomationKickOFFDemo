package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium12_Navigations {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://google.com");
        d.navigate().to("https://bing.com");

        d.navigate().back();
        d.navigate().refresh();
        d.navigate().forward();
        d.quit();

    }
}
