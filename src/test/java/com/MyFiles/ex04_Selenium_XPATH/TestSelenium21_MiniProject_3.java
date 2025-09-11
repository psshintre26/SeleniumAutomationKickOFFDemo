package com.MyFiles.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.WebSocket;
import org.testng.Assert;

public class TestSelenium21_MiniProject_3 {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement btn1 = d.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        btn1.click();
        WebElement uid = d.findElement(By.id("txt-username"));
        uid.sendKeys("John Doe");
        WebElement up = d.findElement(By.id("txt-password"));
        up.sendKeys("ThisIsNotAPassword");
        WebElement Loginbtn = d.findElement(By.id("btn-login"));
        Loginbtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement msg = d.findElement(By.xpath("//div[@class='col-sm-12 text-center']"));
        Assert.assertEquals(msg.getText(),"Make Appointment");
        d.close();
    }

}
