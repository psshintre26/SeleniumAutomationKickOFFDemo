package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium07_Selenium_Commands {
    public static void main(String[] args) {
        WebDriver d1 = new ChromeDriver();
        d1.get("https://www.google.com/");
        System.out.println(d1.getTitle());
        //System.out.println(d1.getCurrentUrl());
        //System.out.println(d1.getPageSource());

        d1.quit();
    }
}
