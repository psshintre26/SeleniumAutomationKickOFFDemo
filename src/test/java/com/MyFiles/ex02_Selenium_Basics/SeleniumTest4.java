package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest4 {
    public static void main(String[] args) {
        //Web Driver Hirarchy
        //SearchContext (2 funcitons ) find element, findelements - GreatGF
        //Webdriver interface - GF
        //remotewebdriver class - Father
        //chromiumDriver, EdgeDriver, SafariDriver -15 functions

        //SearchContext driver = new EdgeDriver();SearchContext d1= new FirefoxDriver(); SearchContext d2 = new ChromeDriver();
        //driver.findElement();driver.findElements(); - only 2 fucntions not useful much

        WebDriver d1 = new ChromeDriver(); // d1.get();d1.getCurrentUrl(); and so on many funcitons available so useful

        RemoteWebDriver d2 = new ChromeDriver();// d2.close();d2.getCommandExecutor() and so many functions available

        ChromeDriver d3 = new ChromeDriver(); //d3.manage();d3.deleteDownloadableFiles(); etc. so many functions available

        // Scenarios

        // 1. Do want to run on  Chrome or Edge? (1-2%)
        ChromeDriver driver = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ? (96%)
        WebDriver driver1 = new ChromeDriver();
//        driver1 = new EdgeDriver();


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)
    }
}
