package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import java.util.ArrayList;
import java.util.List;
 
public class AppTest {
    HtmlUnitDriver driver;
    
    String appUrl = "http://www.google.com";
    
    @BeforeTest
    public void startDriver() {
        driver = new HtmlUnitDriver();
    }
 
    @AfterTest
    public void stopDriver() {
        driver.close();
    }
 
    @Test
    public void listResponses() throws InterruptedException {
 
        driver.get(appUrl);
        Thread.sleep(5000);
        System.out.println(driver.getPageSource());
        
        driver.findElement(By.id("gb_70")).click();
        Thread.sleep(5000);
    }	
}