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
public class Selenium_demo {

    public static void main(String[] args) {
        // invoke chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver.exe");
        // Create Driver Object for Chrome
        WebDriver webDriver = new ChromeDriver();  // webDriver interface and implementing class is ChromeDriver

        // write selenium code
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
        System.out.println(webDriver.getTitle());
        webDriver.quit();
    }
}
