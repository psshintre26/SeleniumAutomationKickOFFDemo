package com.MyFiles.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium_ProjectNo1 {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://katalon-demo-cura.herokuapp.com");
        //verify cura helathcare service title

        Assert.assertEquals(d.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(d.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        if (d.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
            System.out.println("PASSED");
        }else{
            Assert.fail();
            System.out.println("FAILED");
        }
        d.quit();

    }
}
