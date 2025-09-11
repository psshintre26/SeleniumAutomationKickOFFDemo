package com.MyFiles.ex07_WaitHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.Function;
import java.time.Duration;

public class WaitHelper {

    public static void waitJVM(int time){
        WebDriver d =new ChromeDriver();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void IMPLICWT(WebDriver d, int time){
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    //explicit
       public static void EXPLIWAIT(WebDriver d,long time){

           WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(time));
           w.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

       }

    //Fluent Wait
    public static void WaitFluentVisibility(WebDriver d,long maxTime, int pollingTime, String xpath ){
        FluentWait fwt = new FluentWait(d)
                .withTimeout(Duration.ofSeconds(maxTime))
                .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

//        WebElement error_message = d.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement((By.xpath(xpath)));
//            }
//        });
    }

}