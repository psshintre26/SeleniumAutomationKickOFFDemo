package com.MyFiles.ex05_Selenium_Waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestSelenium23_ExplicitWait_Fix_Miniproject17 {
    public static void main(String[] args) {
        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        WebDriver d = new ChromeDriver();
        d.get("https://app.vwo.com");
        d.manage().window().maximize();
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


//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // error message -<div class="notification-box-descrip tion" id="js-notification-box-msg"
        // //data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(300));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        WebElement em = d.findElement(By.id("js-notification-box-msg"));
        System.out.println(em.getText());
        String errormsg = em.getText();
        System.out.println(errormsg);
        Assert.assertEquals(em.getText(), "Your email, password, IP address or location did not match");


        d.quit();
    }
}
