package com.MyFiles.ex05_Selenium_Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium22_Waits {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
    }
}
