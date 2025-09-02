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
        lnkt.click();
        WebElement busEml = d.findElement(By.name("email"));
        busEml.sendKeys("business");
        WebElement chebox = d.findElement(By.name("gdpr_consent_checkbox"));
        chebox.click();
        ////*[@id="page-free-trial-signup-form-step1"]/div[1]/div
        //<div class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0)
        // invalid-input+Op(1) invalid-reason">The email address you entered is incorrect.</div>
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error = d.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error.getText(),"The email address you entered is incorrect.");
        d.quit();
    }
}
