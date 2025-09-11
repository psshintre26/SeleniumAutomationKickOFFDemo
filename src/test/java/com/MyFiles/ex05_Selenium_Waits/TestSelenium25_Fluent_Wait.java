package com.MyFiles.ex05_Selenium_Waits;

import com.google.common.base.Function;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.annotation.CheckForNull;
import java.time.Duration;

public class TestSelenium25_Fluent_Wait {
    WebDriver d = new ChromeDriver();
    FluentWait<WebDriver> fw = new FluentWait<>(d).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

    //        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement((By.className("notification-box-description")));
//            }
//        }

}