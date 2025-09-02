package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionClasses {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        co.addArguments("--start-maximized");
        co.addArguments("--incognito");
        co.addArguments("--guest");

        WebDriver d = new ChromeDriver(co);
        d.get("https://app.vwo.com");
        System.out.println(d.getTitle());
        d.quit();

    }
}
