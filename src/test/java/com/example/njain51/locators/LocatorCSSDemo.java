package com.example.njain51.locators;

/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/27/2022, Friday
 **/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 What this program snippet doing?
 **/
public class LocatorCSSDemo {

    public static void main(String[] args) throws InterruptedException {

        // set property for chrome webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver.exe");

        //  get webdriver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#email")).sendKeys("dummy@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("mypassword");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
        //driver.findElement(By.cssSelector("#loginbutton")).click();
        driver.findElement(By.name("login")).click();
        Thread.sleep(10000);

        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
