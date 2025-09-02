package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_VS_quit {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://www.google.com");

        //wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        d.close();
        //d.quit();
    }
}
