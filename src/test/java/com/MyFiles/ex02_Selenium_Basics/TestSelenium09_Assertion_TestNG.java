package com.MyFiles.ex02_Selenium_Basics;

////import com.sun.source.tree.AssertTree;
//import io.qameta.allure.Description;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import static org.assertj.core.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Description;


public class TestSelenium09_Assertion_TestNG {
    @Test
    @Description("Verify Title is visible")
    public void TestSelAssert(){

        WebDriver d = new ChromeDriver();
        d.get("https://google.com");

        //TestNG Assertion
        Assert.assertEquals(d.getCurrentUrl(),"https://www.google.com");

        //Test AssertJ
        assertThat(d.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

        //no rest assured assertions
        d.quit();
    }
}
