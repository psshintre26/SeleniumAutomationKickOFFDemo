package com.MyFiles.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium26_Input_Checkbox_Radio {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://awesomeqa.com/practice.html");
        WebElement fn =d.findElement(By.name("firstname"));
        WebElement ln = d.findElement(By.name("lastname"));
        fn.sendKeys("Me");
        ln.sendKeys("mine");
        WebElement sx = d.findElement(By.id("sex-1"));sx.click();
        WebElement radiobx = d.findElement(By.id("exp-1")); radiobx.click();
        WebElement chckbx = d.findElement(By.id("profession-1")); chckbx.click();
    }
}
