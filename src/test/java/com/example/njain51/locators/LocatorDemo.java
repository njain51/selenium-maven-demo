package com.example.njain51.locators;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/17/2022, Tuesday
 **/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 What this program snippet doing?
 **/
public class LocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        // set chrome.exe location
        System.setProperty("webdriver.gecko.driver", "C:\\softwares\\selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        // by id example:
        driver.findElement(By.id("email")).sendKeys("dummy@email.com");

        // by name example
        driver.findElement(By.name("pass")).sendKeys("password123");
        Thread.sleep(4000);


        // linkText example
        driver.findElement(By.linkText("Forgot password?")).click(); // with chrome same is not working - may be bug
        Thread.sleep(4000);
        System.out.println(driver.getTitle());

        // partial linkText example
        driver.navigate().back();  // going back to previous page
        driver.findElement(By.partialLinkText("Forgot")).click(); // with chrome same is not working - may be bug
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.quit();




    }
}
