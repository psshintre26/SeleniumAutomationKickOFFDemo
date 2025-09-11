package com.MyFiles.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium18_LinkText_Partial_Text_TagName_Locators {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://app.vwo.com/#/login");
        //WebElement lnkt = d.findElement(By.linkText("Start a free trial")); lnkt.click();
        WebElement lnkt = d.findElement(By.partialLinkText("trial"));
        //<a id="btn-make-appointment" href="./profile.php#login" class="btn btn-dark btn-lg">Make Appointment</a>
    }
}
