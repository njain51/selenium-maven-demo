package com.example.njain51;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/16/2022, Monday
 **/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 What this program snippet doing?
 **/
public class ValidateURL {

    public static void main(String[] args) throws InterruptedException {
        // invoke chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver.exe");
        // Create Driver Object for Chrome
        WebDriver webDriver = new ChromeDriver();  // webDriver interface and implementing class is ChromeDriver

        // write selenium code
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
        System.out.println(webDriver.getTitle());

        // get current URL
        System.out.println(webDriver.getCurrentUrl());

        // get page source : to deal with some UI components, it's useful for some websites where right click is disabled
        //System.out.println(webDriver.getPageSource());

        // browser to another website
        webDriver.get("https://www.yahoo.com/");
        System.out.println(webDriver.getTitle());

       // navigate back to first one
        Thread.sleep(1000);
        webDriver.navigate().back();
        Thread.sleep(1000);
        System.out.println(webDriver.getTitle());

        // navigate to yahoo again
        Thread.sleep(1000);
        webDriver.navigate().forward();
        System.out.println(webDriver.getTitle());

        webDriver.quit();
    }

}
