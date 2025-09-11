package com.MyFiles.ex04_Selenium_XPATH;

import com.MyFiles.utils.CommonToAll;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium20_MiniProject extends CommonToAll {

    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        d.manage().window().maximize();

        WebElement un = d.findElement(By.name("username"));WebElement up = d.findElement(By.name("password"));
          WebElement btn = d.findElement(By.xpath("//button[normalize-space()='Login']"));
        un.sendKeys("admin"); up.sendKeys("Hacker@4321"); btn.click();
        //<h6 class="oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module" data-v-7588b244="" data-v-1c40f28d="">PIM</h6>
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement msg = d.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));
        Assert.assertEquals(msg.getText(),"PIM");
        d.close();
        //<span class="oxd-topbar-header-breadcrumb" data-v-1c40f28d=""><h6
        // class="oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module" data-v-7588b244="" data-v-1c40f28d="">PIM</h6><!----></span>
    }

}