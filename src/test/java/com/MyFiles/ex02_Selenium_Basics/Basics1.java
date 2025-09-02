package com.MyFiles.ex02_Selenium_Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //FirefoxDriver d1 = new FirefoxDriver();
        driver.get("https://www.manogat.com/");

    }

}
