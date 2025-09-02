package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium08_Maximize_Minimize {
    public static void main(String[] args) {
        WebDriver d1 = new ChromeDriver();
        d1.manage().window().maximize();
        d1.manage().window().minimize();
        d1.quit();
    }
}
