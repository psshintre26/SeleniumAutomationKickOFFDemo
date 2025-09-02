package com.MyFiles.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME {
    public static void main(String[] args) {
        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        WebDriver d = new ChromeDriver();
        d.get("https://app.vwo.com"); d.manage().window().maximize();
        WebElement email = d.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");
        //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe" data-gtm-form-interact-field-id="1">
        WebElement pass = d.findElement(By.name("password"));
        pass.sendKeys("abcd1234");

        //button - <button type="submit" id="js-login-btn" class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //								</button>
        WebElement btn = d.findElement(By.id("js-login-btn"));

        btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // error message -<div class="notification-box-descrip tion" id="js-notification-box-msg"
        // //data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        WebElement em = d.findElement(By.id("js-notification-box-msg"));System.out.println(em.getText());
        String errormsg =em.getText();System.out.println(errormsg);
        Assert.assertEquals(em.getText(),"Your email, password, IP address or location did not match");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d.quit();
    }
}